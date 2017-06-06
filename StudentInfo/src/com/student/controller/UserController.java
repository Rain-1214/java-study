package com.student.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.student.entity.User;
import com.student.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Resource
	private UserService userService;
	
	@RequestMapping(value = "/login",method=RequestMethod.POST)
	@ResponseBody
	public Map login(@RequestBody User user,HttpServletRequest request){
		User resultUser = userService.findUser(user);
		Map params =  new HashMap();
		if(resultUser == null){
			params.put("errorCode", 0);
			params.put("message", "�û���������");
			return params;
		}else if(resultUser.getUserName().equals(user.getUserName()) && !resultUser.getPassword().equals(user.getPassword())){
			params.put("errorCode", 0);
			params.put("message", "�������");
			return params;
		}else if(resultUser.getUserName().equals(user.getUserName()) && resultUser.getPassword().equals(user.getPassword())){
			params.put("errorCode", 1);
			params.put("message", "success");
			return params;
		}else{
			params.put("errorCode", 0);
			params.put("message", "δ֪����");
			return params;
		}
	}
	
	@RequestMapping(value = "/register",method=RequestMethod.POST)
	@ResponseBody
	public Map register(@RequestBody User user,HttpServletRequest request){
		int result = userService.insertUser(user);
		if(result == 0){
			Map params =  new HashMap();
			params.put("errorCode", 0);
			params.put("message", "ע��ʧ��");
			return params;
		}else{
			Map params =  new HashMap();
			params.put("errorCode", 1);
			params.put("message", "ע��ɹ�");
			return params;
		}
	}
	
	@RequestMapping(value = "/findUser",method=RequestMethod.POST)
	@ResponseBody
	public Map findUser(@RequestBody User user,HttpServletRequest request){
		User resultUser = userService.findUser(user);
		if(resultUser == null){
			Map params =  new HashMap();
			params.put("errorCode", 1);
			params.put("message", "�û�������");
			return params;
		}else{
			Map params =  new HashMap();
			params.put("errorCode", 0);
			params.put("message", "�û����Ѵ���");
			return params;
		}
	}
	
	@RequestMapping(value = "/findUserSafetyQuestion",method=RequestMethod.POST)
	@ResponseBody
	public Map findUserSafetyQuestion(@RequestBody User user,HttpServletRequest request){
		User resultUser = userService.findUser(user);
		if(user.getSafetyAnswer() == null){
			if(resultUser == null){
				Map params =  new HashMap();
				params.put("errorCode", 0);
				params.put("message", "�û���������");
				return params;
			}else{
				Map params =  new HashMap();
				Map data =  new HashMap();
				params.put("errorCode", 1);
				data.put("safetyQuestion", resultUser.getSafetyQuestion());
				data.put("id", resultUser.getId());
				params.put("data", data);
				params.put("message", "success");
				return params;
			}	
		}else{
			if(resultUser.getSafetyAnswer().equals(user.getSafetyAnswer())){
				Map params =  new HashMap();
				params.put("errorCode", 1);
				params.put("message", "����ȷ");
				return params;
			}else{
				Map params =  new HashMap();
				params.put("errorCode", 0);
				params.put("message", "�𰸴���");
				return params;
			}
		}
		
	}
	
	@RequestMapping(value = "/alterUser",method=RequestMethod.POST)
	@ResponseBody
	public Map alterUser(@RequestBody Map user,HttpServletRequest request){
		Integer id = (Integer) user.get("id");
		String userName = (String) user.get("userName");
		String password = (String) user.get("password");
		int result = userService.updateUser(new User(id,userName,password));
		if(result == 1){
			Map params =  new HashMap();
			params.put("errorCode", 1);
			params.put("message", "�޸ĳɹ�");
			return params;
		}else{
			Map params =  new HashMap();
			params.put("errorCode", 0);
			params.put("message", "�޸�ʧ��");
			return params;
		}
	}
	
	
}