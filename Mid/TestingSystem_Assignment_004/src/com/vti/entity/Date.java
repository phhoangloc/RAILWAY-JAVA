package com.vti.entity;

public class Date {
	private int day;
	private int month;
	private int year;

	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public boolean isLeapYear() {
		boolean isLeap = false;
		if (year % 4 == 0) {
			// chia hết cho 4 là năm nhuận
			if (year % 100 == 0) {
				// nếu vừa chia hết cho 4 mà vừa chia hết cho 100 thì k phải là năm nhuận
				if (year % 400 == 0) {
					// chia hết cho 400 là năm nhuận
					return true;
				} else {
					// không chia hết cho 400 thì không phải năm nhuận
					return false;
				}
			} else {
				// chia hết cho 4 nhưng không chia hết cho 100 là năm nhuận
				return true;
			}
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
}
