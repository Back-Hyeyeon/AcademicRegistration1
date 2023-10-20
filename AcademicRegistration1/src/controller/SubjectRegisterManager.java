package controller;

import java.util.Scanner;

import model.SubjectVO;

public class SubjectRegisterManager {

	public void subjectList() throws Exception {
		SubjectDAO sd = new SubjectDAO();
		System.out.println("학과 전체 리스트");
		sd.getSubjectTotalList();
		System.out.println();

	}

	public void subjectRegistr() throws Exception {
		Scanner input = new Scanner(System.in);

		SubjectDAO sd = new SubjectDAO();
		SubjectVO sv = new SubjectVO();

		String s_num; // 학과 번호
		String s_name; // 학과명
		
		System.out.println("학과 전체 리스트");
		sd.getSubjectTotalList();
		System.out.println();
		
		System.out.println("학과 정보 입력");
		System.out.print("학과번호 : ");
		s_num = input.nextLine();
		
		System.out.print("학과명 : ");
		s_name = input.nextLine();
		
		sv.setS_num(s_num);
		sv.setS_name(s_name);
		sd.setSubjectRegiste(sv);
		System.out.println();
		
		System.out.println("학과 전체 리스트");
		sd.getSubjectTotalList();
		System.out.println();

	}

	public void subjectUpdate() throws Exception {
		Scanner input = new Scanner(System.in);
		Scanner input1 = new Scanner(System.in);
		
		SubjectDAO sd = new SubjectDAO();
		SubjectVO sv = new SubjectVO();
		
		int s_no; // 입력한 일련번호
		String s_num; // 학과 번호
		String s_name; // 학과명
		
		System.out.println("학과 전체 리스트");
		sd.getSubjectTotalList();
		System.out.println();
		
		System.out.println("수정할 학과 일련번호 입력");
		System.out.print("일련번호 : ");
		s_no = input1.nextInt();
		System.out.println();
		
		System.out.println("새로운 정보 모두 입력");
		System.out.print("학과번호 : ");
		s_num = input.nextLine();
		
		System.out.print("학과명 : ");
		s_name = input.nextLine();
		
		sv.setNo(s_no);
		sv.setS_num(s_num);
		sv.setS_name(s_name);
		sd.setSubjectUpdate(sv);
		System.out.println();
		
		System.out.println("학과 전체 리스트");
		sd.getSubjectTotalList();
		System.out.println();
		
	}

	public void subjectDelete() throws Exception {
		
		Scanner input = new Scanner(System.in);
		
		SubjectDAO sd = new SubjectDAO();
		SubjectVO sv = new SubjectVO();
		
		int s_no; // 입력한 일련번호
		System.out.println("학과 전체 리스트");
		sd.getSubjectTotalList();
		System.out.println();
		System.out.println("삭제할 학과 일련번호 입력");
		System.out.print("일련번호 : ");
		s_no = input.nextInt();
		sd.setSubjectDelete(s_no);
		System.out.println();
		System.out.println("학과 전체 리스트");
		sd.getSubjectTotalList();
		System.out.println();
		}
	}

