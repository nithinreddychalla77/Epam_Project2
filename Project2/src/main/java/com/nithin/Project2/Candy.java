package com.nithin.Project2;

import com.nithin.Project2.sweet;

public class Candy extends sweet{
      Candy(String name, int weight, int cost) {
		super(name, weight, cost);
		// TODO Auto-generated constructor stub
	}

	protected String getType(){
    	  return "candy";
      }
}
