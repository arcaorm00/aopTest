package com.bit.dao;

import java.util.ArrayList;

import com.bit.exam01.ProfilingAdvice;

public class MemberDAO {
	
	//private ProfilingAdvice advice = new ProfilingAdvice();
	
	public int insertMember(String name, int age) {
		//advice.pro();
		System.out.println("<ȸ�� ���>");
		return 1;
	}
	
	public void updateMember() {
		//advice.pro();
		System.out.println("<ȸ�� ���� ����>");
	}
	
	public ArrayList<String> listMember(){
		//advice.pro();
		ArrayList<String> list = new ArrayList<String>();
		list.add("�����");
		list.add("�̼ݼ�");
		list.add("�ڿͿ�");
		return list;
	}
}
