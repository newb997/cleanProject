package com.s4.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import com.s4.dto.AccountPDto;

@Mapper
public interface AccountPMapper {

	@Insert("insert into p_member (p_id, p_pw, p_name, p_nickname, p_email, p_phone) " + 
			"values (#{p_id}, #{p_pw}, #{p_name}, #{p_nickname}, #{p_email}, #{p_phone})")
	void insertMember(AccountPDto pMember);
}
