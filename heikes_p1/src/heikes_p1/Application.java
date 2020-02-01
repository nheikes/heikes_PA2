package heikes_p1;

import java.util.Scanner;

/*
 	Pseudocode...
 	
	Get and encrypt a user inputed number
	Get and decrypt a user inputed number
*/

public class Application 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Please input the number to encrypt...");
		System.out.println("The encrypted number is: " + Encrypter.encrypt(in.nextLine()));
		
		System.out.println("Please input the number to decrypt...");
		System.out.println("The encrypted number is: " + Decrypter.decrypt(in.nextLine()));
	}
}
