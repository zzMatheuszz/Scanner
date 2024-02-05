package teste.java;


import java.util.Locale;
import java.util.Scanner;
public class scanner {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String x;
		x = sc.next();
		System.out.println("Voce digitou: " + x);
		System.out.println();
		
		int a;
		a = sc.nextInt();
		System.out.println("Voce digitou: " + a);
		System.out.println();
		
		double b;
		b = sc.nextDouble();
		System.out.println("Voce digitou: " + b);
		System.out.println();
		
		char c;
		c = sc.next().charAt(0);
		System.out.println("Voce digitou: " + c);
		System.out.println();
		
		String z;
		int y;
		double p;
		z = sc.next();
		y = sc.nextInt();
		p = sc.nextDouble();
		System.out.println("Dados digitados:");
		System.out.println(z);
		System.out.println(y);
		System.out.println(p);
		
		
		sc.close();
	}

}
