package Soft4kang;

public class Pira27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, m;
		m = 20; n = 1;
		while(true) {
			for (int i = 0; i < m; i++) System.out.printf(" ");
			for (int i = 0; i < n; i++) System.out.printf("¡Ú");
			System.out.println("\n");
			
			m = m - 1;
			n = n + 2;
			
		if (m < 0) break;
		}
	}

}
