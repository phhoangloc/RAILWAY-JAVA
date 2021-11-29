package com.vti.entity;

//a) Tất cả các property sẽ để là private để các class khác không 
//chỉnh sửa hay nhìn thấy
public class Student {
	private int id;
	private String name;
	private String hometown; 
	private float score;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHometown() {
		return hometown;
	}
	public void setHometown(String hometown) {
		this.hometown = hometown;
	}
	public float getScore() {
		return score;
	}
//	b) Tạo constructor cho phép khi khởi tạo mỗi student thì người 
//	dùng sẽ nhập vào tên, hometown và có điểm học lực = 0
	public Student(String name, String hometown) {
		this.name=name;
		this.hometown=hometown;
		this.score=0;
	}
//	c) Tạo 1 method cho phép set điểm vào
	public void setScore(float score) {
		this.score = score;
	}
//	d) Tạo 1 method cho phép cộng thêm điểm
	public void setMoreScore(float morescore) {
		this.score += morescore;
	}
//	e) Tạo 1 method để in ra thông tin của sinh viên bao gồm có tên, 
//	điểm học lực ( nếu điểm <4.0 thì sẽ in ra là Yếu, nếu điểm > 
//	4.0 và < 6.0 thì sẽ in ra là trung bình, nếu điểm > 6.0 và < 8.0 
//  thì sẽ in ra là khá, nếu > 8.0 thì in ra là Giỏi)
	public String toString() {
		String rank = null;
		if (this.score < 4.0f) {
			rank = "Yếu";
		} else if (this.score < 6.0f) {
			rank = "Trung Bình";
		} else if (this.score < 8.0f) {
			rank = "Khá";
		} else {
			rank = "Giỏi";
		}
		return "Student [name=" + name + ", score=" + score + ", Xếp loại=" + rank + "]";
	}
}
