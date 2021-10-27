package com.koreait.bookapp.model;

//이 객체는 오직 하나의 레코드를 담기위한 데이터를 담는 용도로 정의함 Vo
public class TopCategory {
	private int topCategory_id;
	private String name;
	public int getTopCategory_id() {
		return topCategory_id;
	}
	public void setTopCategory_id(int topCategory_id) {
		this.topCategory_id = topCategory_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
