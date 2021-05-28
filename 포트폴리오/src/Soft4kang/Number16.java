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
		System.out.printf("int로 인쇄[%d][%f]\n" , il , iD);
		System.out.printf("double로 인쇄[%f][%f]\n" , (double) il , iD);
		
		String aa = "abcd";
		
		if (aa.equals("abcd")) System.out.printf("aa는 abcd이다\n");
		else System.out.printf("aa는 abcd가 아니다\n");
		
		boolean bb = true;
		
		if(!!bb) System.out.printf("bb가 아니고 아니면 참이다\n");
		else System.out.println("bb가 아니고 아니면 거짓이다\n");
		
		
		
		
	}

}
