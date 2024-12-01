package newworkouts;

public class ConcordinateWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		concadinateWord();

	}
	public static void concadinateWord()
	{
	String input="Pavani is the learner";
	String arr[]=input.split(" ");
	for(int index=0;index<=arr.length-1;index++)
	{
		String splittedword=arr[index];
		char firstCharacter=splittedword.charAt(0);
		System.out.print(firstCharacter);
	}
	}

}
