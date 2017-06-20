package com.elm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.elm.dao.ShopDao;
import com.elm.entity.ShopType;
import com.elm.service.ShopService;

@Service("shopService")
public class ShopServiceImpl implements ShopService{
	
	@Resource
	public ShopDao shopDao;

	@Override
	public List<ShopType> findShopType() {
		return shopDao.findShopType();
	}
	
	
	
}