package com.tedu.sp01.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data/*hashcode()*/
@NoArgsConstructor/*无参*/
@AllArgsConstructor/*全参*/
public class Item {
	private Integer id;
	private String name;
	private Integer number;
}
