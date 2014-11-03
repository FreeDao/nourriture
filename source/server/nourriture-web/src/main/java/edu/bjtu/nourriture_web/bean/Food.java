package edu.bjtu.nourriture_web.bean;

public class Food {
	/** 自增序列 **/
	private int id;
	/** 食物名 **/
	private String name;
	/** 价格 **/
	private double price;
	/** 种类 **/
	private int categoryId;
	/** 口味 **/
	private int flavourId;
	/** 制造商 **/
	private int manufacturerId;
	/** 生产地 **/
	private int produceLocationId;
	/** 购买地 **/
	private int buyLocationId;
	/** 购买地经度 **/
	private double longitude;
	/** 购买地纬度 **/
	private double latitude;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public int getFlavourId() {
		return flavourId;
	}
	public void setFlavourId(int flavourId) {
		this.flavourId = flavourId;
	}
	public int getManufacturerId() {
		return manufacturerId;
	}
	public void setManufacturerId(int manufacturerId) {
		this.manufacturerId = manufacturerId;
	}
	public int getProduceLocationId() {
		return produceLocationId;
	}
	public void setProduceLocationId(int produceLocationId) {
		this.produceLocationId = produceLocationId;
	}
	public int getBuyLocationId() {
		return buyLocationId;
	}
	public void setBuyLocationId(int buyLocationId) {
		this.buyLocationId = buyLocationId;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
}