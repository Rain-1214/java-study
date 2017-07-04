package com.elm.entity;

public class Food {
	
	private Integer id;
	private String foodName;
	private String foodInfo;
	private String foodPic;
	private double price;
	private Integer countMonth;
	private double goodEvaluate;
	private String type;
	private Integer inventory;
	private Integer foodTypeId;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public String getFoodInfo() {
		return foodInfo;
	}
	public void setFoodInfo(String foodInfo) {
		this.foodInfo = foodInfo;
	}
	public String getFoodPic() {
		return foodPic;
	}
	public void setFoodPic(String foodPic) {
		this.foodPic = foodPic;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Integer getCountMonth() {
		return countMonth;
	}
	public void setCountMonth(Integer countMonth) {
		this.countMonth = countMonth;
	}
	public double getGoodEvaluate() {
		return goodEvaluate;
	}
	public void setGoodEvaluate(double goodEvaluate) {
		this.goodEvaluate = goodEvaluate;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getInventory() {
		return inventory;
	}
	public void setInventory(Integer inventory) {
		this.inventory = inventory;
	}
	public Integer getFoodTypeId() {
		return foodTypeId;
	}
	public void setFoodTypeId(Integer foodTypeId) {
		this.foodTypeId = foodTypeId;
	}
	
	
	
}