package Soft4kang;

public class Number16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int il;
		double iD;
		
		il = 10 / 3;
		
		iD = 10 / 3.0;
		
		if (il == iD) {
			System.out.printf("equal\n");
		} else {
			System.out.printf("Not equal[%f][%f]\n" , (double)il , iD);
		}
		
		if (iD == 3.333333) {
			System.out.printf("equal\n");
		} else {
			System.out.printf("Not equal[3.333333][%f]\n" , (double) il , iD);
		}
		
		iD = (int)iD;
		if (il == iD) {
			System.out.printf("equal\n");
		} else {
			System.out.printf("Not equal[%f][%f]\n" , (double)il , iD);
		}
		System.out.printf("int�� �μ�[%d][%f]\n" , il , iD);
		System.out.printf("double�� �μ�[%f][%f]\n" , (double) il , iD);
		
		String aa = "abcd";
		
		if (aa.equals("abcd")) System.out.printf("aa�� abcd�̴�\n");
		else System.out.printf("aa�� abcd�� �ƴϴ�\n");
		
		boolean bb = true;
		
		if(!!bb) System.out.printf("bb�� �ƴϰ� �ƴϸ� ���̴�\n");
		else System.out.println("bb�� �ƴϰ� �ƴϸ� �����̴�\n");
		
		
		
		
	}

}
