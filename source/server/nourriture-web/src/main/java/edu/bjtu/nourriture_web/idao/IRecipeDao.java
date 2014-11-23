package edu.bjtu.nourriture_web.idao;

import edu.bjtu.nourriture_web.bean.Recipe;

public interface IRecipeDao {

	 int 		add(Recipe recipe);
	 Recipe 	getById(int id);
	 void 		deletebyid(int id);
	 void 		update(Recipe recipe);

}
