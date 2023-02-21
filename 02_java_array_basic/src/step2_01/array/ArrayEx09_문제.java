package step2_01.array;

import java.util.Scanner;

//2023 02 20 20 : 05 ~ 16

/*
 * 
 * # 영화관 좌석예매
 * 
 * 1. 사용자로부터 좌석번호(index)를 입력받아 예매하는 시스템이다.
 * 2. 예매가 완료되면 해당 좌석 값을 'O'로 변경한다.
 * 3. 이미 예매가 완료된 좌석은 재구매할 수 없다.
 * 4. 한 좌석당 예매 가격은 12000원이다.
 * 5. 프로그램 종료 후, 해당 영화관의 총 매출액을 출력한다.
 * 예)
 * [X] [X] [X] [X] [X] [X] [X]
 * 
 * 1. 좌석 예매
 * 2. 종료
 * 
 * (1번 입력)
 * 
 * 좌석선택(1~7) : 1
 * [O] [X] [X] [X] [X] [X] [X]
 * 
 * 1. 좌석 예매
 * 2. 종료
 * 
 * (1번 입력)
 * 
 * 좌석선택(1~7) : 3
 * 
 * [O] [X] [O] [X] [X] [X] [X]
 * 
 * 1. 좌석 예매
 * 2. 종료
 *
 * (1번 입력)
 * 
 * 좌석선택(1~7) : 3
 * 이미 예매가 완료 되었습니다.
 * 
 * [O] [X] [O] [X] [X] [X] [X]
 * 
 * 1. 좌석 예매
 * 2. 종료
 * 
 * (2번 입력)
 * ----------------------
 * 매출액 : 24000원
 * 
 */


public class ArrayEx09_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		char seat[] = {'X', 'X', 'X', 'X', 'X', 'X', 'X'};
		
		int flag = 0;
		int cnt = 0;
		
		while( flag == 0 ) {
			System.out.println("1. 좌석 예매 \n2. 종료");
			int menu = scan.nextInt();
			switch(menu) {
				case 1 :
				System.out.print("좌석 선택(1~7) : ");
				int s = scan.nextInt();
				
				if ( s >= 8 ) {
					System.out.println("에매 좌석이 없습니다");
					break;
				}
				if ( seat[s-1] == 'X' ) {
					seat[s-1] = 'O';
					cnt++;
				}
				else System.out.println("이미 예매가 완료 되었습니다.");
				
				for (int i = 0; i < seat.length; i++) {
					System.out.print("[" + seat[i] + "] ");
				}
				System.out.println();
				break;
				case 2 : 
					flag = 1;
					System.out.println("----------------------");
					System.out.println("매출액 : " + cnt*12000 + "원" );
					break;
				default : 
					System.out.println("메뉴 번호 다시 선택하기");
					break;
					
			}
		}
		
	}
	
}
