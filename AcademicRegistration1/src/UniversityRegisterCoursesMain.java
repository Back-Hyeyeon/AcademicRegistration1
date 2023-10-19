
import controller.LessonRegisterManager;
import controller.StudentRegisterManager;
import controller.SubjectRegisterManager;
import controller.TraineeRegisterManager;
import view.LESSON_CHOICE;
import view.MENU_CHOICE;
import view.MenuViewer;
import view.STUDENT_CHOICE;
import view.SUBJECT_CHOICE;
import view.TRAINEE_CHOICE;

public class UniversityRegisterCoursesMain {

	public static void main(String[] a) {
		mainMenu();
	}

//==================================================
	private static void mainMenu() {
		int choiceNum;
		boolean stop = false;
		while (!stop) {
			try {
				// MenuViewer클래스에 mainMenuView() 메서드 만들기
				// 화면설계한 것 들고 오기
				MenuViewer.mainMenuView();
				// MenuViewer클래스의 choice라는 스캐너를 이용하여 Int(정수)로 번호를 받아 choiceNum에 저장
				choiceNum = MenuViewer.choice.nextInt();
				MenuViewer.choice.nextLine();// 버퍼제거

				switch (choiceNum) {
				case MENU_CHOICE.SUBJECT:
					subjectMenu();
					break;
				case MENU_CHOICE.STUDENT:
					studentMenu();
					break;
				case MENU_CHOICE.LESSON:
					lessonMenu();
					break;
				case MENU_CHOICE.TRAINEE:
					traineeMenu();
					break;
				case MENU_CHOICE.EXIT:
					System.out.println("프로그램을 종료합니다.");
					stop = true;
					break;
				default:
					System.out.println("해당 메뉴 번호만 입력하세요.");
				}// switch

			} catch (Exception e) {
				System.out.println("입력오류.. 프로그래밍 다시시작...");
				stop = true;

			} // try_catch

		} // while
	}// mainMenu()

	// =====================================================================
//	수강신청메뉴
	public static void traineeMenu() throws Exception {
		int choice;
		// TraineeRegisterManager클래스 객체선언
		TraineeRegisterManager traineeManager = new TraineeRegisterManager();
		// MenuViewer 클래스에 있는 traineeMenu수강신청 뷰를 가져온다.
		MenuViewer.traineeMenu();
		// MenuViewer 클래스에 있는 choice로 정의한 Scanner을 사용하여 Int로 값을 넣는다.
		choice = MenuViewer.choice.nextInt();
		MenuViewer.choice.nextLine(); // 버퍼제거
		switch (choice) {
		// TRAINEE_CHOICE클래스 안에 있는 LIST는 select역활을 한다.
		case TRAINEE_CHOICE.LIST:
			System.out.println("");
			traineeManager.traineeList();
			break;
		case TRAINEE_CHOICE.INSERT:
			System.out.println("");
			traineeManager.traineeRegistr();
			break;
		case TRAINEE_CHOICE.UPDATE:
			System.out.println("");
			traineeManager.traineeDelete();
			break;
		// MAIN으로 나가다.
		case TRAINEE_CHOICE.MAIN:
			return;
		default:
			System.out.println("해당 메뉴 번호만 입력하세요.");
		}
	}

//	학과메뉴
	public static void subjectMenu() throws Exception {
		int choice;
		// 학과 정보를 컨드롤 하기위한 객체
		SubjectRegisterManager subjectManager = new SubjectRegisterManager();
		// MenuViewer 클래스에 있는 subjectMenu 학과메뉴 뷰를 가져온다.
		MenuViewer.subjectMenu();
		choice = MenuViewer.choice.nextInt();
		MenuViewer.choice.nextLine();
		switch (choice) {
		// select 전체보기
		case SUBJECT_CHOICE.LIST:
			System.out.println("");
			subjectManager.subjectList();
			break;
		// 삽입
		case SUBJECT_CHOICE.INSERT:
			System.out.println("");
			subjectManager.subjectRegistr();
			break;
		// 수정
		case SUBJECT_CHOICE.UPDATE:
			System.out.println("");
			subjectManager.subjectUpdate();
			break;
		// 삭제
		case SUBJECT_CHOICE.DELETE:
			System.out.println("");
			subjectManager.subjectDelete();
			break;
		// MAIN 으로 나가다.
		case SUBJECT_CHOICE.MAIN:
			return;
		default:
			System.out.println("해당 메뉴 번호만 입력하세요.");
		}
	}

//	학생메뉴
	public static void studentMenu() throws Exception {
		int choice;

		StudentRegisterManager studnetManager = new StudentRegisterManager();
		MenuViewer.studentMenu();
		choice = MenuViewer.choice.nextInt();
		MenuViewer.choice.nextLine();

		switch (choice) {
		case STUDENT_CHOICE.INSERT:
			System.out.println("");
			studnetManager.studnetRegistr();
			break;
		case STUDENT_CHOICE.UPDATE:
			System.out.println("");
			studnetManager.studnetUpdate();
			break;
		case STUDENT_CHOICE.LIST:
			System.out.println("");
			studnetManager.studnetTotalList();
			break;
		case STUDENT_CHOICE.MAIN:
			return;
		default:
			System.out.println("해당 메뉴 번호만 입력하세요.");
		}
	}

//	과목메뉴
	public static void lessonMenu() throws Exception {
		int choice;

		LessonRegisterManager lessonManager = new LessonRegisterManager();
		MenuViewer.lessonMenu();
		choice = MenuViewer.choice.nextInt();
		MenuViewer.choice.nextLine();

		switch (choice) {
		case LESSON_CHOICE.LIST:
			System.out.println("");
			lessonManager.lessonList();
			break;
		case LESSON_CHOICE.INSERT:
			System.out.println("");
			lessonManager.lessonRegistr();
			break;
		case LESSON_CHOICE.UPDATE:
			System.out.println("");
			lessonManager.lessonUpdate();
			break;
		case LESSON_CHOICE.DELETE:
			System.out.println("");
			lessonManager.lessonDelete();
			break;
		case LESSON_CHOICE.MAIN:
			return;
		default:
			System.out.println("해당 메뉴 번호만 입력하세요.");
		}
	}
}
