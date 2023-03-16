package step2_01.array;

import java.util.Arrays;
import java.util.Scanner;

//2023 02 22 20:43 ~ 21:00

/*
 * # 미니마블
 * 
 * 1. 플레이어는 p1과 p2 2명이다.
 * 2. p1는 사용자가 1~3 사이의 숫자를 입력해 이동하고 p2는 랜덤값으로 1~3값으로 이동한다.
 * 3. 이동하다가 다음 플레이어와 같은 위치에 놓이게 되면,
 *    상대 플레이어는 잡히게 되어 원점으로 되돌아간다.
 * 4. 먼저 3바퀴를 돌면 이긴다.
 *    
 *  1 0 0 0 0 0 0 0  [0바퀴]
 *  2 0 0 0 0 0 0 0  [0바퀴]
 *  [p1사용자]1~3 입력 : 3 
 *
 *  1 2 3 4 5 6 7 8  
 *  0 0 0 1 0 0 0 0  [0바퀴]
 *  2 0 0 0 0 0 0 0  [0바퀴]
 *  [p2컴퓨터] : 3
 *  [p2컴퓨터]가 p1을 잡았다! 
 *  
 *  1 2 3 4 5 6 7 8 
 *  1 0 0 0 0 0 0 0  [0바퀴]
 *  0 0 0 2 0 0 0 0  [0바퀴]
 * [p1사용자]1~3 입력 : 
 *
 *
 *
 */

public class ArrayEx18_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] game = {1, 2, 3, 4, 5, 6, 7, 8};
		int[] p1   = {0, 0, 0, 0, 0, 0, 0, 0};
		int[] p2   = {0, 0, 0, 0, 0, 0, 0, 0};
		
		int turn = 1;

		int idx1 = 0;	
		int idx2 = 0;
		
		p1[idx1] = 1;	
		p2[idx2] = 2;
		
		int r1 = 0 ;
		int r2 = 0; 

		while( true ) {
			System.out.println(Arrays.toString(game));
			System.out.print(Arrays.toString(p1));
			System.out.println(" " + r1 + "바퀴");
			System.out.print(Arrays.toString(p2));
			System.out.println(" " + r2 + "바퀴");
			
			if ( turn == 1 ) {
				System.out.print("P1 >> ");
				int move = scan.nextInt();
				p1[idx1] = 0;
				idx1 += move;
				if ( idx1 > 7 ) {
					idx1 -= 7;
					r1++;
					if ( r1 == 3 ) {
						System.out.println("P1 WIN");
						break;
					}
				}
				p1[idx1] = 1;
				if ( idx1 == idx2 ) {
					p2[idx2] = 0;
					idx2 = 0;
					p2[idx2] = 2;
				}
				turn = 2;
			}
			else if ( turn == 2 ) {
				System.out.print("P2 >> ");
				int move = scan.nextInt();
				p2[idx2] = 0;
				idx2 += move;
				if ( idx2 > 7 ) {
					idx2 -= 7;
					r2++;
					if ( r2 == 3 ) {
						System.out.println("P2 WIN");
						break;
					}
				}
				p2[idx2] = 2;
				if ( idx2 == idx1 ) {
					p1[idx1] = 0;
					idx1 = 0;
					p1[idx1] = 1;
				}
				turn = 1;
			}
			
		}
		
		
	}
}
