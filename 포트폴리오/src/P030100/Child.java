package P030100;

public class Child extends Parent{
		void sleep() { 
			System.out.println("�ʹ� �ʹ� ��ƴ�");
		}
	
	
	public static void main(String[] args) {
		Parent ha = new Parent(); 
		Child sl = new Child();
		ha.eat();
		sl.sleep();
		
	}
	
	
	
	
	}


