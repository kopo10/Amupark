package soft6;


public class Bill {

	public static void main(String[] args) {
		TitlePrint k_10_titlePrint = new TitlePrint(); 
		ItemPrint k_10_item = new ItemPrint();
		TimeStemp k_10_time = new TimeStemp();
		HeaderPrint1 k_10_head = new HeaderPrint1();
		TotalPrint k_10_total = new TotalPrint();
		
		int k_10_itemCount = 30; // ��ǰ����
		
		k_10_titlePrint.TitlePrint1(); //Ÿ��Ʋ ����Ʈ 
		k_10_time.TimeStemp1(); // Ÿ�� ����Ʈ
		k_10_head.HeaderPrint1(); // ��� ����Ʈ
		for (int i = 0; i < k_10_itemCount; i++) { // ��ǰ������ŭ �ݺ�			
			k_10_item.Print(i); //����Ʈ
		}
		k_10_total.TotalPrint(); // ���� ����Ʈ
		k_10_time.TimeStemp2();	 //�ؿ� �ð� ����Ʈ
	
	}
}
