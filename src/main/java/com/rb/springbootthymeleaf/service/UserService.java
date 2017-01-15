package com.rb.springbootthymeleaf.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rb.springbootthymeleaf.entity.User;
import com.rb.springbootthymeleaf.mapper.IUserMapper;

@Service
public class UserService {

	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
	public User getUserByRoleId(int roleId){
		IUserMapper mapper = sqlSessionTemplate.getMapper(IUserMapper.class);
		User user = mapper.getUserByRoleId(roleId);
		
		return user;	
	}
	
	public void saveUser(User user){
		IUserMapper mapper = sqlSessionTemplate.getMapper(IUserMapper.class);
		mapper.saveOrUpdateUser(user);
	}
}
