package com.bit.exam01;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bit.dao.GoodsDAO;
import com.bit.dao.MemberDAO;

public class MainTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/bit/exam01/beans.xml");
		
		MemberDAO mDAO = (MemberDAO)context.getBean("mDAO");
		GoodsDAO gDAO = (GoodsDAO)context.getBean("gDAO");
		
		mDAO.insertMember("ÃÖ·Ö·Ö", 20);
		mDAO.updateMember();
		ArrayList<String> memberList = mDAO.listMember();
		for( String member : memberList ) {
			System.out.println(member);
		}
		
		gDAO.insertGoods("¿Á¼ö¼ö", 3000);
		ArrayList<String> goodsList = gDAO.list();
		for( String item : goodsList ) {
			System.out.println(item);
		}
		
	}

}
