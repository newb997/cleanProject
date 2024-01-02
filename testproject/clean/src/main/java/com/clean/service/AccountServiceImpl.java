package com.clean.service;

import org.springframework.stereotype.Service;

import com.clean.dto.AccountPDto;
import com.clean.mapper.AccountMapper;

import lombok.Data;
import lombok.Setter;

@Service
public class AccountServiceImpl implements AccountService{

	@Setter
	private AccountMapper accountMapper;

	@Override
	public void register(AccountPDto pMember) {

		accountMapper.insertMember(pMember);
	}

}
