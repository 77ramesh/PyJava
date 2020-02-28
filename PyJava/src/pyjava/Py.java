package pyjava;

public class Py {

	public static void print(String s) {
		System.out.println(s);
	}
	
	public static void print(boolean b) {
		System.out.println(b);
	}

	public static void print(double d) {
		System.out.println(d);
	}
	
	public static void print(int i) {
		System.out.println(i);
	}
	
	public static void print(double[] arr) {
		for(double i: arr) {
			System.out.print(i + " ");
		}
	}
	
	public static void print(int[] arr) {
		for(int i: arr) {
			System.out.print(i + " ");
		}
	}
	
	public static void print(String[] arr) {
		for(String s: arr) {
			System.out.print(s + " ");
		}
	}

}
