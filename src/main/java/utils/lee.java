package utils;

import java.util.Scanner;

public class lee {

	/**
	 * M�todo que controla que el valor que ha introducido el usuario sea un entero
	 * @return devuelve el valor introducido por el usuario cuando  haya introducido un entero v�lido
	 */
	public static int Entero() {
		int x=-1;
		Scanner s=new Scanner(System.in);
		boolean valid=true;
		do {
			try {
				x=s.nextInt();
				valid=false;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Error!!");
				s.next();
			}
		} while(valid);
		return x;
	}
	
	/**
	 * M�todo que controla que el valor que ha introducido el usuario sea un Double
	 * @return devuelve el valor introducido por el usuario cuando  haya introducido un Double v�lido
	 */
	public static double Double() {
		double x=-1;
		Scanner s=new Scanner(System.in);
		boolean valid=true;
		do {
			try {
				x=s.nextDouble();
				valid=false;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Error!!");
				s.next();
			}
		} while (valid);
		return x;
	}
	
	/**
	 * M�todo que controla que el valor que ha introducido el usuario sea un String
	 * @return devuelve el valor introducido por el usuario cuando  haya introducido un String v�lido
	 */
	public static String String() {
		String x="";
		Scanner s=new Scanner(System.in);
		boolean valid=true;
		do {
			try {
				x=s.nextLine();
				valid=false;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Error!!");
				s.next();
			}
		} while (valid);
		return x;
	}
	
	/**
	 * M�todo que muestra por pantalla un String
	 * @param f: String que se va a mostrar por pantalla
	 */
	public static void Print(String f) {
		System.out.println(f);
	}
	
	/**
	 * M�todo que muestra por pantalla un objeto
	 * @param o: objeto que se va a mostrar por pantalla
	 */
	public static void Print(Object o) {
		System.out.println(o);
	}

}
