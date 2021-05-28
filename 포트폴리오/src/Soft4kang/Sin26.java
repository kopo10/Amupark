package Soft4kang;

public class Sin26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double fSin;
		for (int i = 0; i < 360; i++) {
			fSin = Math.sin(i * 3.141592 / 180);
			System.out.printf("%d sin ==>%f\n", i, fSin);
		}

		for (int i = 0; i < 360; i++) {
			fSin = Math.sin(i * 3.141592 / 180);

			int iSpace = (int) ((1.0 - fSin) * 50);
			for (int j = 0; j < iSpace; j++)System.out.printf(" ");
			System.out.printf("¡Ú[%f][%d]\n", fSin, iSpace);
		}
	}

}
