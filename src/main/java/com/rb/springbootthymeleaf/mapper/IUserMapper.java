package com.rb.springbootthymeleaf.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.rb.springbootthymeleaf.entity.User;

@Mapper
public interface IUserMapper {

	void saveOrUpdateUser(User user);
	User getUserByRoleId(Integer roleId);
	User getUserByName(String name);
}
