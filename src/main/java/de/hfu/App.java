package de.hfu;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Bittw text eingeben");
		String t = s.nextLine();
		t = t.toUpperCase();
		System.out.println(t);
	}
}
