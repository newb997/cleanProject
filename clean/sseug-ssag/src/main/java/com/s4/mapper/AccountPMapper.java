package com.s4.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.s4.dto.AccountPDto;

@Mapper
public interface AccountPMapper {

	void insertMember(AccountPDto pMember);
	
	AccountPDto selectMemberByIdAndPwd(@Param("p_id")String p_id, @Param("p_pw")String p_pw);
}
