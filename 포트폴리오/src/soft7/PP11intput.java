package soft7;

public class PP11intput {																						//학번, 점수들을 위한 변수를 선언해준다
	private int k_10_student_id;
	private String k_10_name;
	private int k_10_kor;
	private int k_10_eng;
	private int k_10_mat;

	public PP11intput (int k_10_student_id, String k_10_name, int k_10_kor, int k_10_eng, int k_10_mat) {		// 받은 인자들을 선언한 변수에 정의해준다
		this.k_10_student_id = k_10_student_id;   // 인자 값을 넣어준다
		this.k_10_name = k_10_name;				  // 인자 값을 넣어준다
		this.k_10_kor = k_10_kor;				  // 인자 값을 넣어준다
		this.k_10_eng = k_10_eng;				  // 인자 값을 넣어준다
		this.k_10_mat = k_10_mat;				  // 인자 값을 넣어준다
	}

	public int student_id() {
		return this.k_10_student_id;   // 학번을 리턴받는다
	}

	public String name() {
		return this.k_10_name;	 		// 이름을 리턴받는다
	}

	public int kor() {
		return this.k_10_kor;			// 국어점수를 리턴받는다
	}

	public int eng() {
		return this.k_10_eng;			// 영어점수를 리턴받는다
	}

	public int mat() {
		return this.k_10_mat;			// 수학점수를 리턴받는다
	}

	public int sum() {
		return this.k_10_kor + this.k_10_eng + this.k_10_mat;  // 총합을 리턴받는다
	}

	public double ave() {
		return this.sum() / 3.0;								// 평균을 리턴받는다
	}

	

}
