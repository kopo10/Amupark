package soft6;


public class Bill {

	public static void main(String[] args) {
		TitlePrint k_10_titlePrint = new TitlePrint(); 
		ItemPrint k_10_item = new ItemPrint();
		TimeStemp k_10_time = new TimeStemp();
		HeaderPrint1 k_10_head = new HeaderPrint1();
		TotalPrint k_10_total = new TotalPrint();
		
		int k_10_itemCount = 30; // 상품수량
		
		k_10_titlePrint.TitlePrint1(); //타이틀 프린트 
		k_10_time.TimeStemp1(); // 타임 프린트
		k_10_head.HeaderPrint1(); // 헤드 프린트
		for (int i = 0; i < k_10_itemCount; i++) { // 상품수량만큼 반복			
			k_10_item.Print(i); //프린트
		}
		k_10_total.TotalPrint(); // 세금 프린트
		k_10_time.TimeStemp2();	 //밑에 시간 프린트
	
	}
}
