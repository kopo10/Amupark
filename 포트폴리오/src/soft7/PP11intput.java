package soft7;

public class PP11intput {																						//�й�, �������� ���� ������ �������ش�
	private int k_10_student_id;
	private String k_10_name;
	private int k_10_kor;
	private int k_10_eng;
	private int k_10_mat;

	public PP11intput (int k_10_student_id, String k_10_name, int k_10_kor, int k_10_eng, int k_10_mat) {		// ���� ���ڵ��� ������ ������ �������ش�
		this.k_10_student_id = k_10_student_id;   // ���� ���� �־��ش�
		this.k_10_name = k_10_name;				  // ���� ���� �־��ش�
		this.k_10_kor = k_10_kor;				  // ���� ���� �־��ش�
		this.k_10_eng = k_10_eng;				  // ���� ���� �־��ش�
		this.k_10_mat = k_10_mat;				  // ���� ���� �־��ش�
	}

	public int student_id() {
		return this.k_10_student_id;   // �й��� ���Ϲ޴´�
	}

	public String name() {
		return this.k_10_name;	 		// �̸��� ���Ϲ޴´�
	}

	public int kor() {
		return this.k_10_kor;			// ���������� ���Ϲ޴´�
	}

	public int eng() {
		return this.k_10_eng;			// ���������� ���Ϲ޴´�
	}

	public int mat() {
		return this.k_10_mat;			// ���������� ���Ϲ޴´�
	}

	public int sum() {
		return this.k_10_kor + this.k_10_eng + this.k_10_mat;  // ������ ���Ϲ޴´�
	}

	public double ave() {
		return this.sum() / 3.0;								// ����� ���Ϲ޴´�
	}

	

}
