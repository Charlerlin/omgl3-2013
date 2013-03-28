package ConverNumbers;

public class StringNumbers {
	public static void main(String[] args) {
		Convert c = new Convert();
		for(int i=123456; i<999999999; i+=10000)
			System.out.println(c.c(i));
	}
}
