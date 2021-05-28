package D;

import java.util.Scanner;
public class DP1 {

	public static final String father = "big Ryu";
	public static final String mother = "mom";
	public static final String me = "han";
	public static final String sister = "Ryu";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Age in my family \n1 : father\n2 : mother\n3 : me\n4 : sisther");
		int a = 0;
		a = sc.nextInt();		
		System.out.println(addition(a));
	}
	
	public static String addition(int FM) {
		String ret = "";
		if (FM == 1) {
			ret = father;
		} else if (FM == 2) {
			ret = mother;		
	    } else if (FM == 3) {
	    	ret = me;	    
        } else if (FM == 4) {
        	ret = sister;
        }
		return ret;
	}

}
