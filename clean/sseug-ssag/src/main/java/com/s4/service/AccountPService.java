package com.s4.service;

import com.s4.dto.AccountPDto;

public interface AccountPService {
	void register(AccountPDto pMember);

	AccountPDto findloginPMember(AccountPDto accountPDto);
}
