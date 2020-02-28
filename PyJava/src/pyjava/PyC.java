package pyjava;
import pyjava.Py;

public class PyC {
	
	public static void isin(int num, int[] arr) {
		
		boolean p = false;
		
		for(int i=0;i<arr.length;i++) {
			if(num == arr[i])
				p = true;
		}
		
		Py.print(p);
	}
}



