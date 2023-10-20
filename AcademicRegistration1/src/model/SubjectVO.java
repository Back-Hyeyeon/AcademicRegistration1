package model;

import java.util.Objects;

public class SubjectVO {
	
	private int no;
	private String s_num;
	private String s_name;
	
	public SubjectVO() {
		super();
	}
	
	public SubjectVO(String s_num, String s_name) {
		super();
		this.s_num = s_num;
		this.s_name = s_name;
	}
	
	public SubjectVO(int no, String s_num, String s_name) {
		super();
		this.no = no;
		this.s_num = s_num;
		this.s_name = s_name;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getS_num() {
		return s_num;
	}

	public void setS_num(String s_num) {
		this.s_num = s_num;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	@Override
	public String toString() {
		return String.format("일련번호 : %d, 학과번호 : %s, 학과명 : %s", getNo(),getS_num(),getS_name());
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.s_num,this.s_name);
	}

	@Override
	public boolean equals(Object obj) {
//		SubjectVO sjvo = null;
		if(!(obj instanceof SubjectVO)) {return false;}
		SubjectVO sjvo = (SubjectVO)obj;
		return sjvo.s_num.equals(this.s_num) && sjvo.s_name.equals(this.s_name);
	}


}
