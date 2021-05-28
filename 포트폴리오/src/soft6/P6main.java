package soft6;

public class P6main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		P6Overloading k_10_over = new P6Overloading(); 								//P6Overloading Å¬·¡½º¸¦ ºÒ·¯¿Â´Ù. 
			
		System.out.printf("2°³ µ¡¼ÀÀÌ È£ÃâµÊ [%d]\n", k_10_over.sum(1, 2)); 		// ( ) Ãâ·Â
		System.out.printf("3°³ µ¡¼ÀÀÌ È£ÃâµÊ [%d]\n", k_10_over.sum(1, 2, 3));		// ( ) Ãâ·Â
		System.out.printf("4°³ µ¡¼ÀÀÌ È£ÃâµÊ [%d]\n", k_10_over.sum(1, 2, 3, 4));	// ( ) Ãâ·Â
		System.out.printf("´õºíÇü µ¡¼ÀÀÌ È£ÃâµÊ [%f]\n", k_10_over.sum(1.3, 2.4));	// ( ) Ãâ·Â
	}
}
