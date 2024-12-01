package newworkouts;

import java.lang.reflect.Array;

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseWord();

	}
	public static void reverseWord()
	{
		String input="Himanshu is the mentor of my java Automation Testing Class";
		String arr[]=input.split(" ");
		System.out.println(+arr.length);
		for(int index=arr.length-1;index>=0;index--)
		{
			//System.out.println("Working");
			String reversedsentence=arr[index];
			System.out.print(reversedsentence+" ");
		}
	}

}
