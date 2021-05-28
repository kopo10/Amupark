package P0311;

public class G {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String temp = null;
		

		try {
			System.out.println(temp.length());
		} catch (NullPointerException e) {
			System.out.println("sdd");
		} catch (Exception ex) {
			System.out.println("asd33");
		} finally {
			System.out.println("dd");
			
		}
		
	}

}
