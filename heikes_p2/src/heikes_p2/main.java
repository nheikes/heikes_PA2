package heikes_p2;

public class main 
{
	public static void main(String[] args) 
	{
	    BMICalculator app = new BMICalculator();
	    app.readUserData();
	    app.calculateBmi();
	    app.displayBmi();
	}
}
