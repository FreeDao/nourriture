app.controller("search", function($scope, $http) {
	$scope.search = function() {
		var keyword = {
				foodname:$scope.submit
		}
		if ($scope.submit != "null") {
			$http({
				method : 'GET',
				url : "ws/food/food/search",
				params : keyword
			}).success(function(data) {
				if (!data.errorCode) {
					$cookieStore.put("username", $scope.username);
				} else {
					$scope.hintShow = true;
					$scope.hint = "what you search is not here!";
				}
			});
		}
	}
});