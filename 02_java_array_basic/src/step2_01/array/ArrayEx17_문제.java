package step2_01.array;

import java.util.Scanner;

/* 
 * # 틱택토
 * 
 * 1. 구글에 검색해보면 실제로 게임을 진행해볼 수 있음
 * 2. 미니 오목처럼 1p 혹은 2p가 먼저 가로로 3줄 , 세로로 3줄, 대각선 3줄을 선택한 플레이어가 승리하는 게임
 * 3. 1p가 입력한 부분은 화면에 O표시 , 2p가 입력한 부분은 화면에 X표시
 * 
 * === 틱택토 ===
 * [X][X][O]
 * [ ][O][ ]
 * [ ][ ][ ]
 * [p1]인덱스 입력 : 6
 * === 틱택토 ===
 * [X][X][O]
 * [ ][O][ ]
 * [O][ ][ ]
 * [p1]승리
 * 
 */

public class ArrayEx17_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[][] game = new int[3][3];
		int flag = 1;
		
		while(flag <= 2) {
			System.out.println("======틱택토======");
			//배열 출력
			for ( int i = 0 ; i < 3 ; i++ ) {
				for  ( int j = 0 ; j < 3 ; j++ ) {
					if ( game[i][j] == 0 ) System.out.print("[ ]");
					else if ( game[i][j] == 1 ) System.out.print("[O]");
					else if ( game[i][j] == 2 ) System.out.print("[X]");
				}
				System.out.println();
			}
			
			if ( flag == 1 ) {
				System.out.print("P1 INDEX >> ");
				int id1 = scan.nextInt();
				int id2 = scan.nextInt();
				
				if ( game[id1][id2] == 0 ) game[id1][id2] = 1;
				else System.out.println("TRY AGAIN");
				
				flag = 2; // p2 차례
			}
			else if ( flag == 2 ) {
				System.out.print("P2 INDEX >> ");
				int id1 = scan.nextInt();
				int id2 = scan.nextInt();
				if ( game[id1][id2] == 0 ) game[id1][id2] = 2;
				else System.out.println("TRY AGAIN");
				
				flag = 1; // p1 차례
				
			}
			
			// 우승자있는지 확인하기 ( 세로 빙고 )
			for ( int i = 0 ; i < 3 ; i++ ) {
				if ( game[0][i] == game[1][i] && game[0][i] == game[2][i] ) {
					if ( game[0][i] == 1 ) {
						System.out.println("P1 win");
						flag = 3;
					}
					else if ( game[0][i] == 2 ){
						System.out.println("P2 win");
						flag = 4;
					}
				}
			}
			// 가로 빙고
			for ( int i = 0 ; i < 3 ; i++ ) {
				if ( game[i][0] == game[i][1] && game[i][0] == game[i][2] ) {
					if ( game[i][0] == 1 ) {
						System.out.println("P1 win");
						flag = 3;
					}
					else if ( game[i][0] == 2 ){
						System.out.println("P2 win");
						flag = 4;
					}
				}
			}
			
			//대각선 빙고
			if ( game[0][0] == game[1][1] && game[0][0] == game[2][2]) {
				if ( game[0][0] == 1 ) {
					System.out.println("P1 win");
					flag = 3;
				}
				else if ( game[0][0] == 2 ){
					System.out.println("P2 win");
					flag = 4;
				}
			}
			
			if ( game[0][2] == game[1][1] && game[0][2] == game[2][0]) {
				if ( game[0][2] == 1 ) {
					System.out.println("P1 win");
					flag = 3;
				}
				else if ( game[0][2] == 2 ){
					System.out.println("P2 win");
					flag = 4;
				}
			}
			
			
		}
		
	}
		
}
