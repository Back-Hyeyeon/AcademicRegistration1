package model;

import java.util.Objects;

public class LessonVo {
	private int no; // 과목 일련번호
	private String l_abbre; // 과목약어
	private String l_name; // 과목명
	
	public LessonVo() {
		super();
	}
	
	public LessonVo(int no, String l_abbre, String l_name) {
		super();
		this.no = no;
		this.l_abbre = l_abbre;
		this.l_name = l_name;
	}

	public int getNo() {
		return no;
	}

	public String getL_abbre() {
		return l_abbre;
	}

	public String getL_name() {
		return l_name;
	}

	@Override
	public boolean equals(Object obj) {
//		LessonVo lesvo = null;
		if(!(obj instanceof LessonVo)) {return false;}
		LessonVo lesvo = (LessonVo)obj;
		return lesvo.no == this.no && lesvo.l_name.equals(this.l_name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(no, l_name);
	}



	
	
}
