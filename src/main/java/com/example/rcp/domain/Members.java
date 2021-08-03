package com.example.rcp.domain;

import lombok.*;

@Data
@ToString
public class Members {
	
	private int id;
	private String name;
	private String nameHiragana;
	private String part;
	private String partHiragana;
	private String tel;
	private String email;
	private String password;
	private Role auth;
	private String regDate;
	private String modDate;
	

}
