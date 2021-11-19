import java.util.Scanner;

import team.LCKTeam;

public class LCK {
	private static LCKTeam[] teams = new LCKTeam[10];
	private static int count = 0;
	private static Scanner sc = new Scanner(System.in);
	
	public static void showMainMenu() {
		System.out.println("-----------------------------------");
		System.out.println("1.등록 2.수정 3.팀별 검색 4.라인별 검색 5.각 팀 코치진 검색 6.종료");
		System.out.println("-----------------------------------");
		System.out.println("선택>");
	}
	public static void insertInfo() {
		System.out.println("선수 및 코치 정보 등록하기");
		System.out.println("팀명:");
		System.out.println(">");
		String tname = sc.nextLine();
	}
	
	
}
