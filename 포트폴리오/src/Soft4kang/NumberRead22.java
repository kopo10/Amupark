package Soft4kang;

public class NumberRead22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] units = {"��" , "��" , "��" , "��" , "��" , "��" , "��" , "ĥ" , "��" , "��"};  
		for (int i = 0; i < 101; i++) {
			
			if(i >= 0 && i < 10) {
				System.out.printf("�����ڸ� : %s\n" , units[i]);
			}
			else if (i >= 10 && i < 100) {
				int i10 , i0;
				i10 = i / 10;
				i0 = i % 10;
				if (i0 == 0) {
					System.out.printf("�����ڸ� : %s��\n" , units[i10]);
				} else {
					System.out.printf("�����ڸ� : %s��%s\n" , units[i10] , units[i0]);
				}
			}								
			else System.out.printf("==> %d\n" , i);
		}
	}
}
