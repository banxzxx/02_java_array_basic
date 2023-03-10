package step2_01.array;

import java.util.Scanner;

//2023 02 20 20 17 ~

/*
 * # 즉석복권
 * 
 * 1. 숫자 7이 연속으로 3번 등장하면, 당첨복권이다.
 * 2. 메뉴를 선택해서 1번 2번 3번이 당첨인지 확인한다.
 * 3. 0번은 반복문을 종료한다.
 * 
 */


public class ArrayEx10_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] lotto1 = {0, 0, 7, 7, 7, 0, 0, 0};
		int[] lotto2 = {7, 0, 7, 7, 0, 0, 0, 0};
		int[] lotto3 = {7, 0, 7, 7, 7, 0, 7, 0};
		int sel      = 0;
		int flag = 0;
		
		while (flag == 0) {
					
			System.out.println("\n[1]번복권 결과확인");
			System.out.println("[2]번복권 결과확인");
			System.out.println("[3]번복권 결과확인");
			System.out.println("[0]종료");
			System.out.print("메뉴 선택 : ");
			
			sel = scan.nextInt();
			
			switch(sel) {
			case 1 :  // 1번 복권 확인하기
				int check = 0 ;
				for (int i = 0; i < lotto1.length; i++) {
					if ( lotto1[i] == 7 ) {
						if ( lotto1[i+1] == 7 && lotto1[i+2] == 7 ) {
							check = 1;
						}
					}
				}
				if ( check == 1 ) System.out.println("당첨");
				break;
			
			
			case 2 :  // 2번 복권 확인하기
				int check2 = 0 ;
				for (int i = 0; i < lotto2.length; i++) {
					if ( lotto2[i] == 7 ) {
						if ( lotto2[i+1] == 7 && lotto2[i+2] == 7 ) {
							check2 = 1;
						}
					}
				}
				if ( check2 == 1 ) System.out.println("당첨");
				break;
			
			
			case 3 :  // 3번 복권 확인하기
				int check3 = 0 ;
				for (int i = 0; i < lotto3.length; i++) {
					if ( lotto3[i] == 7 ) {
						if ( lotto3[i+1] == 7 && lotto3[i+2] == 7 ) {
							check3 = 1;
						}
					}
				}
				if ( check3 == 1 ) System.out.println("당첨");
				break;
				
			case 0 :
				System.out.println("종료");
				flag = 1;
				break;
			}
		
								
			
		}
		
	}
}
