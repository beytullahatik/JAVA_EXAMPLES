import java.util.Scanner;
import java.util.Stack;

public class IsTheWordPalindrom 
{
	public static void main(String[] args) 
	{
		Stack <Character> stack = new Stack<>();
		String word=getWord();
		char [] Array = new char [word.length()];
		String empty_string_for_palindrom="";
		for(int i=0; i<word.length(); i++)
		{
			Array[i] = word.charAt(i);
		}
		push_stack(stack, word, Array);
		empty_string_for_palindrom = pop_stack(stack, word, empty_string_for_palindrom);
		control_palindrom(word, empty_string_for_palindrom);
	}
	private static void control_palindrom(String word, String control_palindrom) {
		if(word.equals(control_palindrom))
			printMessage("This word is palindrom");	
		else
			printMessage("This word is not palindrom");
	}
	private static String pop_stack(Stack<Character> stack, String word, String control_palindrom) {
		for(int i=0; i<word.length(); i++)
		{
			control_palindrom = control_palindrom + stack.pop();
		}
		return control_palindrom;
	}
	private static void push_stack(Stack<Character> stack, String word, char[] Array) {
		for(int i=0; i<word.length(); i++)
		{
			stack.push(Array[i]);
		}
	}
	private static void printMessage(String message)
	{
		System.out.println(message);
	}
	private static String getWord()
	{
		Scanner input_word = new Scanner(System.in);
		printMessage("Enter Word :");
		String kelime = input_word.nextLine();
		return kelime;

	}
}
