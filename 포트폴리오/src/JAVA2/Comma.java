package JAVA2;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Comma {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int k_10MyWon = 1000000; // int�� k_10MyWon�� ���� 1000000���� �������ش�.
	double k_10MoneyEx = 1238.21; //double�� ȯ���� 1238.21�� �������ش�.
	double k_10commission = 0.003; // double�� k_10commission�� 0.3%�� �������ش�.
	int k_10usd = (int) (k_10MyWon / k_10MoneyEx); // ȯ���� ��ȭ�� ȯ���� ������ int�� �̿��ؼ� ������ ��ȯ
	int k_10remain = (int) (k_10MyWon - k_10usd * k_10MoneyEx);	// ȯ���� ��ȭ���� 13���� �Ҽ����� ������ �޷����� ȯ���� �����ذ�
	                                                            // ���ָ� �ܵ��� ���Եȴ�.
	System.out.printf("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�\n"); //���� ���
	System.out.printf("��              ������ ���� ���                   ��\n"); // ������ ���
	System.out.printf("�� ��ȭȯ���ݾ�: %d��=> ��ȭ: %d�޷�, �ܵ�: %d��\n", k_10MyWon, k_10usd, k_10remain); //���� ���� ���
																	// ȯ���� �ݾװ� ȯ���� �޷� �׸��� �ܵ��� ������ش�. 
	System.out.printf("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�\n\n\n\n\n"); //���� ���

	double k_10ComPerOne = k_10MoneyEx * k_10commission; //ȯ���� Ŀ�̼��ۼ�Ʈ�� �����ش�.
	
	double k_10totalcom = k_10usd * k_10ComPerOne; //��ȯ�� �޷� * (ȯ���� Ŀ�̼��ۼ�Ʈ�� �����ش�.)
	
	System.out.printf("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�\n"); //���� ���
	System.out.printf("��              ������ ���                                   ��\n"); // ������ ���
	System.out.printf("�� ������: %f�� => ��ȭ: %d�޷�, �޷��� ������: %f��\n", k_10totalcom, k_10usd, k_10ComPerOne);
																	// f%�� ���� �������� �Ҽ������� ǥ�����ش�. �޷��� �����ᵵ �Ҽ�������
																	//	ǥ�����ش�.
	System.out.printf("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�\n\n\n\n\n"); //���� ���	

	int k_10i_totalcom = 0; //k_10i_totalcom�� 0���� �������ش�.
	if (k_10totalcom != (double) ((int)k_10totalcom)) { //���� Ŀ�̼��� ������ �ƴ϶��)
		k_10i_totalcom = (int)k_10totalcom + 1; // 1�� �����༭ �����Ḧ �ش�ȭ�Ѵ�.
	} else {
		k_10i_totalcom = (int) k_10totalcom; //������� �״�� ���
	}
	System.out.printf("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�\n");//���� ���
	System.out.printf("��              ������ ����ȯ��                                             ��\n"); // ������ ���
	System.out.printf("�� ������: %11d�� => ��ȭ: %d�޷�, �޷��� ������: %f��\n", k_10i_totalcom, k_10usd, k_10ComPerOne); // ������� �޷��� ������ ǥ��
																												//�޷��� ������� �Ҽ������� ǥ��(������ �޴� ������� �÷��ֱ� ������)				
	k_10remain = (int) (k_10MyWon - k_10usd * k_10MoneyEx - k_10i_totalcom); // ȯ���� �ݾ׿��� ������� ���� ���� �̱��޷��� ȯ���� ������ �ݾ��� ���ش�
	System.out.printf("�� ��ȭȯ���ݾ�: %d�� => ��ȭ: %d�޷�, ������¡��: %6d��     �ܵ�: %d�� \n", k_10MyWon, k_10usd, k_10i_totalcom, k_10remain);
																						//ȯ���� �ݾ� �޷� ������ �ܵ��� ������ش�
	System.out.printf("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�\n\n\n\n\n");	//���� ���																				
														//�����Ḧ ������ ǥ���� k_10i_totalcom�� ������ش�. ������ ȯ�� �� ��ÿ��� �����Ḧ ���� ���߱� ������
														//�ܵ��� ���̳ʽ��� �� �� �ִ�.
	
	
	k_10usd = (int) (k_10MyWon / (k_10MoneyEx + k_10ComPerOne)); // ���� ȯ���� �ݾ׿� ȯ���� �޷��� �����Ḧ ���� ���� ������ ���� int�� �����Ѵ�.
	k_10totalcom = k_10usd * k_10ComPerOne; // int�� ������ k_10usd�� ���� ȯ���� �ݾ��̰� �� �ݾ׿� �޷��� �����㸦 �����ָ� ���� ������ �����ᰡ ���´�.
	
	if (k_10totalcom != (double) ((int)k_10totalcom)) { //���� ������ �����ᰡ ������ �ƴ϶��
		k_10i_totalcom = (int)k_10totalcom + 1; // �����Ḧ int�� ��ȯ �� 1�� �����ش�.
	} else {
		k_10i_totalcom = (int)k_10totalcom; //������� �װ��� ���� ������.
	}
		
	System.out.printf("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�\n"); //���� ���
	System.out.printf("��              (��Ȯ��) ������ ����ȯ��                                  ��\n"); // ������ ���
	System.out.printf("�� ������: %11d�� => ��ȭ: %d�޷� �޷��� ������: %f��\n",
						k_10i_totalcom, k_10usd, k_10ComPerOne); // �� ������(+ 1�� ���� �Һ��ڿ��� ������) �޷� �����Ḧ ����Ѵ�
	
	k_10remain = (int) (k_10MyWon - k_10usd * k_10MoneyEx - k_10i_totalcom); // ���ϴ� ȯ���ݾ׿��� �޷��� ȯ���� ���� �ݾ��̶� �����Ḧ ����.
	System.out.printf("�� ��ȭȯ���ݾ�: %d�� => ��ȭ: %d�޷� ������¡��:%10d�� �ܵ�: %d�� \n",
						k_10MyWon, k_10usd, k_10i_totalcom, k_10remain); // ��ȯ���ݾ� �޷� ������ �ܵ��� ����Ѵ�.
	System.out.printf("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�\n\n\n\n\n");//���� ���

	
	
	
	DecimalFormat k_10df = new DecimalFormat( "###,###,###,###,###" ); //�ڸ��� ���ϱ�
	
	Calendar k_10cal = Calendar.getInstance(); //Calendar�� �ҷ��´�.
	System.out.printf("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�\n"); //���� ���
	System.out.printf("��                         �޸����, ��¥ ����                             ��\n");	// ������ ���
	System.out.printf("�� ������: %13s�� => ��ȭ: %s�޷� �޷��� ������: %f�� \n", //����� ���� �ѱ۷� ���´�.
			k_10df.format(k_10i_totalcom), k_10df.format(k_10usd), k_10ComPerOne); // �Ѽ����� , ��ȯ�� �޷� �޷��� �����Ḧ ���
	System.out.printf("�� ��ȭȯ���ݾ�: %s�� => ��ȭ: %s�޷� ������¡��: %10s�� �ܵ�: %s�� \n", k_10df.format(k_10MyWon), k_10df.format(k_10usd), k_10df.format(k_10i_totalcom), k_10df.format(k_10remain));
	 																				//�� ȯ���ϰ� ���� �ݾ� �ٲܼ� �ִ� �޷� ������ ���� �ܵ��� ������ش�.
	SimpleDateFormat k_10sdt = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss"); //���� �ð��� YYYY/MM/dd HH:mm:ss���·� ��� 
	System.out.printf("��������ð�: %21s\n" , k_10sdt.format(k_10cal.getTime()));  //k_10sdt�� �Է��� YYYY/MM/dd HH:mm:ss��																			
	                                                                        // ���·� ���� �ð��� ������ش�.				
	System.out.printf("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�\n");	//���� ���
	}
}
