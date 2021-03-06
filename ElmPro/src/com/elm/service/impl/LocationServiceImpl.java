package com.elm.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.elm.dao.LocationDao;
import com.elm.entity.City;
import com.elm.service.LocationService;
import com.elm.util.HttpRequest;

@Service("locationService")
public class LocationServiceImpl implements LocationService{

	public HttpRequest httpRequest;
	public String appKey = "ExYQ53a0MI8lkOYh7S16oZMbeSgCkmpw";

	@Resource
	public LocationDao locationDao;

	@Override
	public String analysisLocation(String location) {
		String url = "http://api.map.baidu.com/geocoder/v2/";
		String s = HttpRequest.sendGet(url, "location=" + location + "&ak=" + appKey + "&output=json");
		return s;
	}

	@Override
	public ArrayList<String> findHotCity() {
		List<City> list = locationDao.findHotCity();
		List<String> listCityName = new ArrayList();
		for (City c : list) {
			listCityName.add(c.getName());
		}
		return (ArrayList<String>) listCityName;

	}

	@Override
	public String findAddress(String query, String city, String location) {

		String url = "http://api.map.baidu.com/place/v2/suggestion";
		String s = HttpRequest.sendGet(url,"query=" + query + "&ak=" + appKey + "&output=json" + "&region=" + city + "&city_limit=true");
		return s;

	}

}
