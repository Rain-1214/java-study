package com.elm.entity;

import java.util.List;

public class Food {
	/**
	 *  id 唯一标识
	 *  foodName 食品名称
	 *  foodInfo 食品简介
	 *  foodPic 食品图片
	 *  price 价格
	 *  countMonth 月销售
	 *  goodEvaluate 好评率
	 *  type 是否是多规格商品
	 *  inventory 存货
	 *  foodTypeId 多规格对应ID
	 */
	private Integer id;
	private String foodName;
	private String foodInfo;
	private String foodPic;
	private double price;
	private Integer countMonth;
	private double goodEvaluate;
	private Integer type;
	private Integer inventory;
	private Integer foodTypeId;
	private List<FoodProperty> foodPropertyList;
	
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
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
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
	public List<FoodProperty> getFoodPropertyList() {
		return foodPropertyList;
	}
	public void setFoodPropertyList(List<FoodProperty> foodPropertyList) {
		this.foodPropertyList = foodPropertyList;
	}
	
	
	
	
}
