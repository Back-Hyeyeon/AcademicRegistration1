
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

		while (true) {
			try {
				// MenuViewer클래스에 mainMenuView() 메서드 만들기
				MenuViewer.mainMenuView();
				// MenuViewer클래스의 choice 스캐너를 이용하여 Int로 번호를 받아 choiceNum에 저장
				choiceNum = MenuViewer.choice.nextInt();
				MenuViewer.choice.nextLine();// 버퍼제거
				
				switch (choiceNum) {
				case 1:
					
					break;
				case 2:
					
					break;
				case 3:
					
					break;
				case 4:
					
					break;
				case 5:
					System.out.println("프로그램을 종료합니다.");
					return;
				default:
					System.out.println("해당 메뉴 번호만 입력하세요.");
				}//switch
				
			} catch (Exception e) {
				System.out.println("입력오류.. 프로그래밍 다시시작...");
			}//try_catch

		} // while
	}// mainMenu()
}
