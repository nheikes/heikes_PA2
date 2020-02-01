package heikes_p2;

import java.util.Scanner;

public class BMICalculator 
{
	
	private static int weight;
	private static int height;
	private static double bmi;
	
	private static Scanner in = new Scanner(System.in);
	private static String unitType;
	private static String bmiCategory;
	
	public static void readUserData()
	{
		readUnitType();
		readMeasurementData();
	}
	
	private static void readUnitType()
	{
		System.out.println("Please enter what unit type you are using on the next line (Metric or Imperial)...");
		unitType = in.nextLine().toLowerCase();
	}
	
	private static void readMeasurementData()
	{
		if (unitType.equals("imperial"))
		{
			readImperialData();
		}
		else if (unitType.equals("metric"))
		{
			readMetricData();
		}
		else
		{
			System.out.println("I'm sorry, you didn't enter Metric or Imperial as the unit type, please try again.");
			readUserData();
		}
	}
	
	private static void readImperialData()
	{
		System.out.println("Please enter your weight in pounds on the next line...");
		weight = in.nextInt();
		System.out.println("Please enter your height in inches on the next line...");
		height = in.nextInt();
	}
	
	private static void readMetricData()
	{
		System.out.println("Please enter your weight in kilograms on the next line...");
		weight = in.nextInt();
		if (weight < 0)
		{
			System.out.println("You inputed a negative weight, the program will now exit.");
			System.exit(0);
		}
		
		System.out.println("Please enter your height in meters on the next line...");
		height = in.nextInt();
		if (height < 0)
		{
			System.out.println("You inputed a negative height, the program will now exit.");
			System.exit(0);
		}
	}
	
	public static void calculateBmi()
	{
		if (unitType.equals("imperial"))
		{
			bmi = (703*weight)/(Math.pow(height, 2));
		}
		else
		{
			bmi = (weight)/(Math.pow(height, 2));
		}
		calculateBmiCategory();
	}
	
	private static void calculateBmiCategory()
	{
		/*
		 	Underweight = <18.5
			Normal weight = 18.5–24.9
			Overweight = 25–29.9
			Obesity = BMI of 30 or greater 
		 */
		if (bmi < 18.5)
		{
			bmiCategory = "Underweight";
		}
		else if (bmi < 24.9)
		{
			bmiCategory = "Noraml weight";
		}
		else if (bmi < 29.9)
		{
			bmiCategory = "Overweight";
		}
		else
		{
			bmiCategory = "Obesity";
		}
		
	}
	
	public static void displayBmi()
	{
		System.out.println("Your BMI is: " + bmi + ".");
		System.out.println("Your BMI Category is: " + bmiCategory + ".");
	}
	
	public static int getWeight() 
	{
		return weight;
	}

	public static void setWeight(int weight) 
	{
		BMICalculator.weight = weight;
	}

	public static int getHeight() 
	{
		return height;
	}

	public static void setHeight(int height) 
	{
		BMICalculator.height = height;
	}

	public static double getBmi() 
	{
		return bmi;
	}
	
	public static String getBmiCategory() 
	{
		return bmiCategory;
	}

}
