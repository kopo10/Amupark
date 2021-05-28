package soft7;

public class P7OneRec {
	private String k_10_name;
	private int k_10_kor;
	private int k_10_eng;
	private int k_10_mat;
		
	public P7OneRec(String k_10_name, int k_10_kor, int k_10_eng, int k_10_mat) {
		this.k_10_name = k_10_name;
		this.k_10_kor = k_10_kor;
		this.k_10_eng = k_10_eng;
		this.k_10_mat = k_10_mat;
	}
	
	public String name() {
		return this.k_10_name;
	}
	
	public int kor() {
		return this.k_10_kor;
	}
	
	public int eng() {
		return this.k_10_eng;
	}
	
	public int mat() {
		return this.k_10_mat;
	}
	
	public int sum() {
		return this.k_10_kor + this.k_10_eng + this.k_10_mat;
	}
	
	public double ave() {
		return this.sum() / 3.0;
	}
	
}
