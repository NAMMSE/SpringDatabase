package com.ezen.database.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

// mybatis�� �̿��� CRUD�� �����ϱ�

@NoArgsConstructor
@Data
public class Pizza {
	private Integer id;
	private String name;
	private Integer price;
	private Integer calrories;
	
}
