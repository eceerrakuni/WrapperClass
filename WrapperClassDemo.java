import java.util.*;
/**
 * This is a short program to demonstrate the difference between wrapper classes
 * and primitives.
 * 
 * @author Michael Ida
 *
 */
public class WrapperClassDemo {
	
	public static Integer[] selectionSort(Integer[] sort) {
		
		int a = sort.length;
		for (int i = 1; i < a; i++) {
			int key = sort[i];
			int u = i - 1;
			while (u >= 0 && sort[u] > key) {
				sort[u + 1] = sort[u];
				u = u - 1;
			}
			sort [u + 1] = key;
		}
		return sort;
	}

	public static void main(String[] args) {
		
		// Integer objects and int primitives are declared differently
		Integer intObject1 = Integer.valueOf(10);
		Integer intObject2 = Integer.valueOf(11);
		int intPrimitive1 = 12;
		int intPrimitive2 = 12;
		
		// Primitives and objects have a different syntax
		System.out.println("The value of intObject1 is " + intObject1.toString());
		System.out.println("The value of intPrimitive1 is " + intPrimitive1);
		
		if (intObject1.equals(intObject2)) {
			System.out.println("Objects are equal");
		} else {
			System.out.println("Objects not equal");
		}
		
		if (intPrimitive1 == intPrimitive2) {
			System.out.println("Primitives equal");
		} else {
			System.out.println("Primitives not equal");
		}
		
		// Integers can be used to convert Strings to numerical values
		Scanner scnr = new Scanner(System.in);
		System.out.println("How many values inside the array? ");
		String tempo = scnr.nextLine();
		Integer a = Integer.parseInt(tempo);
		int b = a;
		Integer[] ans = new Integer[a];
		for (int i = 0; b > i; i++) {
			System.out.println("Please enter the next value. ");
			ans[i] = (Integer.parseInt(scnr.nextLine()));
		}
		selectionSort(ans);
		for (int n = 0; n < b; n++) {
			System.out.println(ans[n].toString());
		}
	}
}