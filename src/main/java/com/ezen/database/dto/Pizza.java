package com.ezen.database.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

// mybatis를 이용해 CRUD를 구현하기

@NoArgsConstructor
@Data
public class Pizza {
	private Integer id;
	private String name;
	private Integer price;
	private Integer calrories;
	
}
