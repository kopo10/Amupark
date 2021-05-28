package P0311;

public class P10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {5, 10, 12};
		
		try {
			System.out.println(numbers[20]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("error");			
		} catch (Exception e) {
			System.out.println("exception");
			e.printStackTrace();
		} finally {
			System.out.println("finally");			
		}
	}

}
