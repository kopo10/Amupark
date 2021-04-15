package amu_park;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Run run = new Run();
		InputClass input = new InputClass();
		int DayOrNight = 0;

		
		DayOrNight = input.DayOrNight();
		if(DayOrNight == 1) {
			run.DayOrNight(DayOrNight);
			
		}
		
	
		
	}

}
