package step2_01.array;

//2023 02 20 19 : 45 ~ 18: 47

/*
 * # 학생성적관리 프로그램[4단계] : 1등학생
 */


public class ArrayEx07_문제 {

	public static void main(String[] args) {
		
		int[] studentNums = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		
		// 문제) 1등학생의 학번과 성적 출력
		// 정답) 1004번(98점)
		
		int max = 0 ;
		int maxid = 0;
		
		for (int i = 0; i < scores.length; i++) {
			if ( scores[i] > max ) {
				max = scores[i];
				maxid = studentNums[i];
			}
		}
		System.out.println(maxid + "번(" + max + "점)");
		
	}
	
}
