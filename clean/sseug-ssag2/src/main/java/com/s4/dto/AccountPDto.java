package com.s4.dto;

import java.util.Date;

import lombok.Data;

@Data
public class AccountPDto {
	private String p_no;
	private String p_id;
	private String p_pw;
	private String p_name;
	private String p_nickname;
	private String p_email;
	private String p_phone;
	private Date p_regdate;
	private int p_yn;
	
	
}
