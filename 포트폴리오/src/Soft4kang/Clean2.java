package Soft4kang;

public class Clean2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i < 13; i++) {
			System.out.printf(" %d월 =>" , i);
			for (int j = 1; j < 32; j++) {
				
				System.out.printf("%d, " , j);
				
				if (i == 4 || i == 6 || i == 9 || i == 11) { //교안에는 7도 포함이지만 7월은 31일까지 있다
					if (j == 30) break;										
				}
				
				if (i == 2) {
					if(j == 28) break;
				}
			}
			System.out.printf("\n");
		}
	}



	public static void Clean3() {
		for (int i = 1; i < 13; i++) {
			System.out.printf(" %d월 =>" , i);
				for (int j = 1; j < 32; j++) {
		
					System.out.printf("%d, " , j);
		
					if ((i == 4 || i == 6 || i == 9 || i == 11) && (j==30))  //교안에는 7도 포함이지만 7월은 31일까지 있다				
					if (i == 2 && j == 28) break; 									
				}
				System.out.printf("\n");
		}
	}
}