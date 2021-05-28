package soft6;

public class P6Overloading {
	
	public int sum(int k_10_a, int k_10_b) { 									// 인자가 2개 있는 메소드
		return k_10_a+k_10_b;
	}
	
	public int sum(int k_10_a, int k_10_b, int k_10_c) {						// 인자가 3개 있는 메소드
		return k_10_a + k_10_b + k_10_c;
	}

	public int sum(int k_10_a, int k_10_b, int k_10_c, int k_10_d) {			// 인자가 4개 있는 메소드
		return k_10_a + k_10_b + k_10_c + k_10_d;
	}

	public double sum(double k_10_a, double k_10_b) {						// 더블 인자가 2개 있는 메소드
		return k_10_a + k_10_b;
	}
}
