package soft6;

public class P6Overloading {
	
	public int sum(int k_10_a, int k_10_b) { 									// ���ڰ� 2�� �ִ� �޼ҵ�
		return k_10_a+k_10_b;
	}
	
	public int sum(int k_10_a, int k_10_b, int k_10_c) {						// ���ڰ� 3�� �ִ� �޼ҵ�
		return k_10_a + k_10_b + k_10_c;
	}

	public int sum(int k_10_a, int k_10_b, int k_10_c, int k_10_d) {			// ���ڰ� 4�� �ִ� �޼ҵ�
		return k_10_a + k_10_b + k_10_c + k_10_d;
	}

	public double sum(double k_10_a, double k_10_b) {						// ���� ���ڰ� 2�� �ִ� �޼ҵ�
		return k_10_a + k_10_b;
	}
}
