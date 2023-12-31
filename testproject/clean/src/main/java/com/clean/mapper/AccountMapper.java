package com.clean.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import com.clean.dto.AccountPDto;

@Mapper
public interface AccountMapper {

	@Insert("insert into p_member (p_id, p_pw, p_name, p_nickname, p_email, p_phone) " + 
			"values (#{p_id}, #{p_pw}, #{p_name}, #{p_nickname}, #{p_email}, #{p_phone})")
	void insertMember(AccountPDto pMember);

}
