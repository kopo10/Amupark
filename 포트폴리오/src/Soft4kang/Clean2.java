package Soft4kang;

public class Clean2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i < 13; i++) {
			System.out.printf(" %d�� =>" , i);
			for (int j = 1; j < 32; j++) {
				
				System.out.printf("%d, " , j);
				
				if (i == 4 || i == 6 || i == 9 || i == 11) { //���ȿ��� 7�� ���������� 7���� 31�ϱ��� �ִ�
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
			System.out.printf(" %d�� =>" , i);
				for (int j = 1; j < 32; j++) {
		
					System.out.printf("%d, " , j);
		
					if ((i == 4 || i == 6 || i == 9 || i == 11) && (j==30))  //���ȿ��� 7�� ���������� 7���� 31�ϱ��� �ִ�				
					if (i == 2 && j == 28) break; 									
				}
				System.out.printf("\n");
		}
	}
}