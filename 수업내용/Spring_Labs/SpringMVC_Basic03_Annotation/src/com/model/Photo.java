package com.model;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

/*
create table myphoto(
  name varchar2(20),
  age number,
  image varchar2(50)
)
*/
public class Photo {
	private String name;
	private int age;
	private String image;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	//파일 전송 memberfield///////////////////////
	private CommonsMultipartFile file;
	public CommonsMultipartFile getFile() {
		return file;
	}
	public void setFile(CommonsMultipartFile file) {
		this.file = file;
	}
	/////////////////////////////////////////////
	
}
