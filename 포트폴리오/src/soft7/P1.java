package soft7;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P1HanBlank k_10_han = new P1HanBlank();
		
		System.out.printf("HanBlankForeword[%s]\n", k_10_han.Foreword("�ѱ�abcd", 15));			//���
		System.out.printf("HanBlankForeword[%s]\n", k_10_han.Foreword("�ѱ��ѱ�aa", 15));		//���
		System.out.printf("HanBlankForeword[%s]\n", k_10_han.Backword("�ѱ�aa", 15));			//���
		System.out.printf("HanBlankForeword[%s]\n", k_10_han.Backword("�ѱ��ѱ�aa", 15));		//���
		System.out.printf("�ѱ��� [%d]��\n", k_10_han.count("�ѱ��ѱ�aa"));						//���
	}

}
