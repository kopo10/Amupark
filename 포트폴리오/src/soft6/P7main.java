package soft6;

public class P7main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P7Output k_10_out = new P7Output();
		P7Grade k_10_grade = new P7Grade();
				
		k_10_out.print(3); //������� ����ϱ�
		System.out.printf("������  100     100      100     %d     %d\n\n\n", k_10_grade.sum(100, 100, 100), k_10_grade.ave(100, 100, 100)); //���� ���ڿ� ���� �ٸ� �޼ҵ� �ҷ�����
		k_10_out.print2(4); //������� ����ϱ�
		System.out.printf("������  100     100      100    100     %d     %d\n\n\n", k_10_grade.sum(100, 100, 100, 100), k_10_grade.ave(100, 100, 100, 100)); //���� ���ڿ� ���� �ٸ� �޼ҵ� �ҷ�����
		k_10_out.print3(5); //������� ����ϱ�
		System.out.printf("������  100     100      100    100     100     %d     %d", k_10_grade.sum(100, 100, 100, 100, 100), k_10_grade.ave(100, 100, 100, 100, 100)); //���� ���ڿ� ���� �ٸ� �޼ҵ� �ҷ�����

	}
	
}
