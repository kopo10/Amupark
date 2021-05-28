package D;

public class prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int diff = getDiff("aaa", "b");
		int diff2 = Math.abs(diff);
		System.out.println(diff2);
		
		int absol = getAbsol(5 , 7);
		System.out.println(absol);
		
	}
	public static int getDiff(String a, String b) {		
		int lengofa = a.length();
		int lengofb = b.length();
		int result = lengofb - lengofa;
		return result;		
	}
	public static int getAbsol(int a, int b) {
		
		int result = 0;
		if(a > b) {
		    result = a - b;
		} else if (a < b) {
		  result = b - a;
		} else {
		    result = 0;
		}    
		  return result;
		
		
	}
}

