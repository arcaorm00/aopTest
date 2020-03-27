package com.bit.dao;

import java.util.ArrayList;

public class GoodsDAO {
	
	public int insertGoods(String item, int price) {
		System.out.println("<상품등록>");
		return 1;
	}
	
	public ArrayList<String> list(){
		ArrayList<String> list = new ArrayList<String>();
		list.add("사과");
		list.add("복숭아");
		list.add("딸기");
		System.out.println( list.get(100) ); //의도적으로 예외를 발생시킨다.
		return list;
	}
}
