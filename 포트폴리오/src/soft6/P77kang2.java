package soft6;

public class P77kang2 {

	private String name;											 // private으로 name을 String으로 선언
	private int kor;	 											 // private으로 kor을 int로 선언
	private int eng;												 // private으로 eng을 int로 선언
	private int mat;												 // private으로 mat을 int로 선언
		
	public P77kang2(String name, int kor, int eng, int mat) {
		this.name = name; 	//this로 불러준다
		this.kor = kor;		//this로 불러준다
		this.eng = eng;		//this로 불러준다
		this.mat = mat;		//this로 불러준다
	}
	
	public String name() {
		return this.name;  // return으로 this를 받아준다
	}
	
	public int kor() {
		return this.kor;  // return으로 this를 받아준다
	}
	
	public int eng() {
		return this.eng;  // return으로 this를 받아준다
	}
	
	public int mat() {
		return this.mat;  // return으로 this를 받아준다
	}
	
	public int sum() {
		return this.kor + this.eng + this.mat;  // return으로 this를 받아준다
	}
	
	public double ave() {
		return this.sum() / 3.0; 				  // return으로 this를 받아준다
	}
	

}
