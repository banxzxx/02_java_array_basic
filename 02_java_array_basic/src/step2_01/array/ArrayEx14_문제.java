package step2_01.array;

import java.util.Arrays;
import java.util.Scanner;

/*
 * # 숫자이동[1단계]
 * 
 * 1. 숫자2는 캐릭터이다.
 * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
 * 	    숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
 * 3. 단, 좌우 끝에 도달했을 때, 예외처리를 해야한다.
 * 
 * @) 정답을 보지않고 소스를 동작시켜 본뒤에 내용을 이해하고 코드를 작성할 것
 * 
 */

public class ArrayEx14_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] game = {0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int player = 0;
		boolean isRun = true;
		
		
		while (isRun) {
			System.out.println(Arrays.toString(game));
			System.out.print("1. LEFT 2. RIGHT 3.END >> ");
			int move = scan.nextInt(); // 왼쪽, 오른쪽 중 어디로 이동할지 정하는 변수 입력 
			
			//캐릭터 위치 인덱스 구하기
			for (int j = 0; j < game.length; j++) {
				if (game[j] == 2) {
					player = j;
					break;
				}
			}
			
			if ( move == 1 ) { // 캐릭터가 왼쪽으로 이동해야하는 경우
				game[player] = 0;
				game[--player] = 2;
				if ( player == 0 ) {
					System.out.println("가장 앞에 도착");
					isRun = false;
				}
				
			}
			else if ( move == 2 ) { // 캐릭터가 오른쪽으로 이동해야하는 경우
				game[player] = 0;
				game[++player] = 2;
				if ( player == 14 ) {
					System.out.println("가장 뒤에 도착");
					isRun = false;
				}
			}
			
			else if ( move == 3 ) isRun = false;
			
		}
				
	}
	
}
