package com.s4.service;

import org.springframework.stereotype.Service;

import com.s4.dto.AccountPDto;
import com.s4.mapper.AccountPMapper;

import lombok.Setter;

@Service
public class AccountPServiceImpl implements AccountPService{

	@Setter
	private AccountPMapper accountPMapper;

	@Override
	public void register(AccountPDto pMember) {

		accountPMapper.insertMember(pMember);
	}
}
