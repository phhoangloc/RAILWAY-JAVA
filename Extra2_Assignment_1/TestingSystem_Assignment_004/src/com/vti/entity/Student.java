package com.vti.entity;

public class Student {
	private short id;
	private String name;
	private String hometown;
	private float score;

	public Student(String name, String hometown) {
		this.name = name;
		this.hometown = hometown;
		this.score = 0f;
	}

	public void setScore(Float score) {
		this.score = score;
	}

	public void plusScore(Float score) {
		this.score += score;
	}

	@Override
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
