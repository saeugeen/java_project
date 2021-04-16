package test;

public class test01 {
	private String num;
	private int kor;
	private int eng;
	private int math;
	public test01(String num, int kor, int eng, int math) {
		super();
		this.num = num;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
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
	
}
