package com.ict07.IO;

import java.io.Serializable;

public class Ex25_VO implements Serializable{
	private String name;
	transient private int eng;
	transient private int math;
	transient private int kor;
	private int sum;
	private double avg;
	private String hak;
	
	public Ex25_VO() {
		// TODO Auto-generated constructor stub
	}

	public Ex25_VO(String name, int eng, int math, int kor) {
		super();
		this.name = name;
		this.eng = eng;
		this.math = math;
		this.kor = kor;
		
		sum = kor+eng+math;
		avg = (int)(sum/3.0*10)/10.0;
		
		if (avg>=90) {
			hak="A학점";
		}else if(avg>=80) {
			hak="B학점";
		}else if(avg>=70) {
			hak="C학점";
		}else {
			hak="F학점";
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public String getHak() {
		return hak;
	}

	public void setHak(String hak) {
		this.hak = hak;
	}
	
}
