package P0311;

public class A implements Inter {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	A a = new A();
	double[] number = {1.2, 3.2 ,5.2, 12.3, 45.0, -3.4, -6.7}; 
	a.getMaxnumber(null);
	a.getMinNumber(null);

		
	}

	@Override
	public double getMaxnumber(double[] numbers) {
		// TODO Auto-generated method stub
		double max = numbers[0];
		for (int i = 0; i < 7; i++) {
			if ( max > (numbers[i])) {
				 max = numbers[i];						
			} else if ( max < numbers[i]) {
				max = max;
			}
		
	
	}
		return max;
	}
	@Override
	public double getMinNumber(double[] numbers) {
		// TODO Auto-generated method stub
		return 0;
	}

}
