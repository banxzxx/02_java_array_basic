package step2_01.array;

import java.util.Random;
import java.util.Scanner;

/*
 * # 기억력 게임
 * 
 * 1. 같은 숫자의 위치를 2개 입력해 정답을 맞추는 게임이다.
 * 2. 정답을 맞추면 back에 해당 숫자를 저장해,
 *    back에 모든 수가 채워지면 게임은 종료된다.
 * 예)
 * front = [5, 4, 1, 3, 1, 2, 4, 2, 3, 5]
 * back  = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
 * 입력1 : 2
 * 입력2 : 4
 * 
 * front = [5, 4, 1, 3, 1, 2, 4, 2, 3, 5]
 * back  = [0, 0, 1, 0, 1, 0, 0, 0, 0, 0]
 * 
 * 입력1 : 5
 * 입력2 : 7
 * 
 * front = [5, 4, 1, 3, 1, 2, 4, 2, 3, 5]
 * back  = [0, 0, 1, 0, 1, 2, 0, 2, 0, 0]
 * 
 */

public class ArrayEx15_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int[] front = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
		int[] back = new int[10];
		int cnt  = 0;
		
		// 셔플 구현(Shuffle) : 배열의 요소들을 무작위로 섞음
		while (cnt < 1000) {			
			int tempRan = ran.nextInt(9) + 1; // 1~9 랜덤숫자 인덱스
			int temp = front[0]; 
			front[0] = front[tempRan];
			front[tempRan] = temp;
			cnt++;
		}
		
		boolean isRun = true;
		
		while(isRun) {
		
			System.out.print("front : ");
			for ( int i = 0 ; i < front.length ; i++ ) {
				System.out.print(front[i] + " ");
			}
		
			System.out.println();
		
			System.out.print("back : ");
			for (int i=0; i<front.length; i++) {
				System.out.print(back[i] + " ");
			}
			System.out.println();
			
			System.out.print("입력 1 >> ");
			int num1 = scan.nextInt();
			System.out.print("입력 2 >> ");
			int num2 = scan.nextInt();
			
			if( front[num1] == front[num2] ) {
				System.out.println("CORRECT");
				back[num1] = front[num1];
				back[num2] = front[num1];
				// back 배열이 다 찼는지 확인하기
				int flag = 0;
				for ( int j = 0 ; j < back.length ; j++ ) {
					if ( back[j] == 0 ) flag = 1;
				}
				
				if ( flag == 0 ) {
					System.out.println("back is full");
					isRun = false;
				}
			} 
			else {
				System.out.println("TRY AGAIN");
			}
			
		}
		
	}	
}
