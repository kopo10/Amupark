package soft6;

public class P2 {
	static int k_10_iStatic; // Ŭ������ ���� ���� static�� ����
	
	public static void add(int k_10_i) {
		k_10_iStatic++; //k_10_iStatic ����
		k_10_i++; //k_10_i����
		System.out.printf("addd�޼ҵ忡��->iStatic=[%d]\n", k_10_iStatic); // ( ) ���
		System.out.printf("addd�޼ҵ忡��->i=[%d]\n", k_10_i); // ( ) ���
	}
	
	public static int add2(int k_10_i) {
		k_10_iStatic++; //k_10_iStatic ����
		k_10_i++; //k_10_i����
		System.out.printf("add�޼ҵ忡��->Static=[%d]\n", k_10_iStatic); // ( ) ���
		System.out.printf("add�޼ҵ忡��->i=[%d]\n", k_10_i);// ( ) ���
		return k_10_i;		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k_10_iMain; //k_10_iMain�� int�� ����
		
		k_10_iMain = 1; //k_10_iMain �� 1�� ����
		k_10_iStatic = 1; // k_10_iStatic�� 1�� ����
		
		System.out.printf("**********************************\n"); // ( ) ���
		System.out.printf("�޼ҵ�ȣ���� ���ο���->iStatic=[%d]\n", k_10_iStatic); // ( ) ���
		System.out.printf("�޼ҵ�ȣ���� ���ο���->iMain=[%d]\n", k_10_iMain); // ( ) ���
		System.out.printf("**********************************\n"); // ( ) ���
		
		add(k_10_iMain);
		
		System.out.printf("**********************************\n"); // ( ) ���
		System.out.printf("�޼ҵ�ȣ���� ���ο���->iStatic=[%d]\n", k_10_iStatic); // ( ) ���
		System.out.printf("�޼ҵ�ȣ���� ���ο���->iMain=[%d]\n", k_10_iMain); // ( ) ���
		System.out.printf("**********************************\n"); // ( ) ���
		
		k_10_iMain = add2(k_10_iMain); //�̷������� ���� �����ϰ� �޴� ����� �����ϱ� ����
							 //���������� ������ ���Լ�.. �ƴ� �޼ҵ� ���޼ҵ忡�� ������ ������
		                     //����ü ��� ������ �Ǿ����� �˾ƺ��� ��ƴ�.
		
		System.out.printf("**********************************\n"); // ( ) ���
		System.out.printf("�޼ҵ� add2ȣ���� ���ο���->iStatic=[%d]\n", k_10_iStatic); // ( ) ���
		System.out.printf("�޼ҵ� add2ȣ���� ���ο���->iMain=[%d]\n", k_10_iMain); // ( ) ���
		System.out.printf("**********************************\n"); // ( ) ���
		
		
	}

}
