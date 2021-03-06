package com.elm.entity;

public class Address {
	
	/**
	 * id 唯一标识
	 * userName 用户名字
	 * sex 性别
	 * phoneNumber 电话
	 * addressName 地址名称
	 * addressDetail 地址详细信息
	 * tag 地址标签
	 * lat,lon 经纬度
	 * userId 对应哪个用户
	 */
	
	private Integer id;
	private String userName;
	private Integer sex;
	private String phoneNumber;
	private String addressName;
	private String addressDetail;
	private String tag;
	private double lat;
	private double lng;
	private Integer userId;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddressName() {
		return addressName;
	}
	public void setAddressName(String addressName) {
		this.addressName = addressName;
	}
	public String getAddressDetail() {
		return addressDetail;
	}
	public void setAddressDetail(String addressDetail) {
		this.addressDetail = addressDetail;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public double getLng() {
		return lng;
	}
	public void setLng(double lng) {
		this.lng = lng;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
	public Address(Integer id, String userName, Integer sex, String phoneNumber, String addressName,
			String addressDetail, String tag, double lat, double lng, Integer userId) {
		super();
		this.id = id;
		this.userName = userName;
		this.sex = sex;
		this.phoneNumber = phoneNumber;
		this.addressName = addressName;
		this.addressDetail = addressDetail;
		this.tag = tag;
		this.lat = lat;
		this.lng = lng;
		this.userId = userId;
	}
	public Address(String userName, Integer sex, String phoneNumber, String addressName, String addressDetail,
			String tag, double lat, double lng, Integer userId) {
		super();
		this.userName = userName;
		this.sex = sex;
		this.phoneNumber = phoneNumber;
		this.addressName = addressName;
		this.addressDetail = addressDetail;
		this.tag = tag;
		this.lat = lat;
		this.lng = lng;
		this.userId = userId;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
