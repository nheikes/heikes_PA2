package heikes_p1;

import java.util.Scanner;

public class Application 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Please input the number to encrypt...");
		Encrypter.encrypt(in.nextLine());
		System.out.println("Please input the number to decrypt...");
		Decrypter.decrypt(in.nextLine());
	}
}
