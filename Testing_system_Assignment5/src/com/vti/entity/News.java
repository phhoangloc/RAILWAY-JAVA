package com.vti.entity;

public class News implements Inews{
	int id;
	String tilte;
	String publishDate;
	String author;
	String content;
	Float AverageRate;
	int Rate[] = {};
	
	public News(String title, String pd, String au, String content, float averates) {
		this.tilte=title;
		this.publishDate=pd;
		this.author=au;
		this.content=content;
		this.AverageRate=averates;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTilte() {
		return tilte;
	}
	public void setTilte(String tilte) {
		this.tilte = tilte;
	}
	public String getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Float getAverageRate() {
		return AverageRate;
	}
	@Override
	public void Display() {
		
		
	}
	@Override
	public String toString() {
		return "News [tilte=" + tilte + ", publishDate=" + publishDate + ", author=" + author + ", content=" + content
				+ ", AverageRate=" + AverageRate + "]";
	}
	@Override
	public void Calculate() {
		// TODO Auto-generated method stub
		AverageRate=  (((float)Rate[0]+(float)Rate[1]+Rate[2])/3);
	}

	
	
}
