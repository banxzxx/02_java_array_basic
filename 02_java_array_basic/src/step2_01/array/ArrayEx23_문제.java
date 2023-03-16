package step2_01.array;

import java.util.Arrays;
import java.util.Scanner;
//2023.03.16 16:50 ~ 17:13
/*
 * # ATM[3단계]
 * 
 * 1. 가입
 *  - 계좌번호와 비밀번호를 입력받아 가입
 *  - 계좌번호 중복검사
 * 2. 탈퇴
 *  -  계좌번호를 입력받아 탈퇴
 */


public class ArrayEx23_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] accs = {1001, 1002, 0, 0, 0};
		int[] pws  = {1111, 2222, 0, 0, 0};
		
		int accsCnt = 2;
		int selectMenu = 0;
		boolean isRun = true;
		
		while (isRun) {
			
			System.out.println("1.가입");
			System.out.println("2.탈퇴");
			System.out.println("3.종료");
			System.out.print("메뉴 선택 >> ");
			selectMenu = scan.nextInt();
			
			if		(selectMenu == 1) {
				
				if ( accsCnt == 5 ) {
					System.out.println("ARRAY FULL");
					continue;
				}
				
				System.out.print("가입할 계좌 입력 >> ");
				int acc = scan.nextInt();
				int flag = 0;
				for (int i = 0; i < accs.length; i++) {
					if ( accs[i] == acc ) flag = 1;
				}
				if ( flag == 1 ) {
					System.out.println("중복된 계좌번호입니다");
					continue;
				}
				System.out.print("가입할 비밀번호 입력 >> ");
				int pw = scan.nextInt();
				
				accs[accsCnt] = acc;
				pws[accsCnt] = pw;
				
				accsCnt++;
				
				System.out.println(Arrays.toString(accs));
				System.out.println(Arrays.toString(pws));
				
			}
			
			else if (selectMenu == 2) {
				System.out.print("탈퇴할 계좌번호 입력 >> ");
				int acc = scan.nextInt();
				int flag = 0;
				int del = 0;
	
				for (int i = 0; i < accs.length; i++) {
					if ( accs[i] == acc ) {
						flag = 1;
						del = i;
					}
				}
				if ( flag == 0 ) {
					System.out.println("해당 계좌는 존재하지 않습니다");
					continue;
				}
				else if (flag == 1) {
					if ( del == accsCnt - 1 ) {
						accs[del] = 0;
						pws[del] = 0;
					}
					else {
						for (int j = del ; j < accs.length - 2 ; j++) {
							accs[j] = accs[j+1];
							pws[j] = pws[j+1];
						}
					}
				}
				accsCnt--;
				
				System.out.println(Arrays.toString(accs));
				System.out.println(Arrays.toString(pws));
				
			}
			else if (selectMenu == 3) {
				System.out.println("종료합니다");
				break;
			}
			
		}

	}
}
