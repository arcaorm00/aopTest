package com.bit.dao;

import java.util.ArrayList;

import com.bit.exam01.ProfilingAdvice;

public class MemberDAO {
	
	//private ProfilingAdvice advice = new ProfilingAdvice();
	
	public int insertMember(String name, int age) {
		//advice.pro();
		System.out.println("<È¸¿ø µî·Ï>");
		return 1;
	}
	
	public void updateMember() {
		//advice.pro();
		System.out.println("<È¸¿ø Á¤º¸ ¼öÁ¤>");
	}
	
	public ArrayList<String> listMember(){
		//advice.pro();
		ArrayList<String> list = new ArrayList<String>();
		list.add("±è¸ú¸ú");
		list.add("ÀÌ¼Ý¼Ý");
		list.add("¹Ú¿Í¿Í");
		return list;
	}
}
