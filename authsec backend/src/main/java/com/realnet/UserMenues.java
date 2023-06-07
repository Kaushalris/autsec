package com.realnet;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserMenues {
	 	private String menuItemDesc;
	    private List<SubMenu> subMenus;
}
