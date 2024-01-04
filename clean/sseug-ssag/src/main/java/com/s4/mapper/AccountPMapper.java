package com.s4.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.s4.dto.AccountPDto;

@Mapper
public interface AccountPMapper {

	void insertMember(AccountPDto pMember);
}
