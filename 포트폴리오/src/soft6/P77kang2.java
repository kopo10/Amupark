package soft6;

public class P77kang2 {

	private String name;											 // private���� name�� String���� ����
	private int kor;	 											 // private���� kor�� int�� ����
	private int eng;												 // private���� eng�� int�� ����
	private int mat;												 // private���� mat�� int�� ����
		
	public P77kang2(String name, int kor, int eng, int mat) {
		this.name = name; 	//this�� �ҷ��ش�
		this.kor = kor;		//this�� �ҷ��ش�
		this.eng = eng;		//this�� �ҷ��ش�
		this.mat = mat;		//this�� �ҷ��ش�
	}
	
	public String name() {
		return this.name;  // return���� this�� �޾��ش�
	}
	
	public int kor() {
		return this.kor;  // return���� this�� �޾��ش�
	}
	
	public int eng() {
		return this.eng;  // return���� this�� �޾��ش�
	}
	
	public int mat() {
		return this.mat;  // return���� this�� �޾��ش�
	}
	
	public int sum() {
		return this.kor + this.eng + this.mat;  // return���� this�� �޾��ش�
	}
	
	public double ave() {
		return this.sum() / 3.0; 				  // return���� this�� �޾��ش�
	}
	

}
