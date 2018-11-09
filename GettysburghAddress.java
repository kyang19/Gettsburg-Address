/**
 * @author kimyang
 * Period 6
 * Gettsburg Address Program
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class GettysburghAddress 
{

	public static void main(String[] args) throws FileNotFoundException 
	{
		String word;
		Scanner file = new Scanner(new File("GettysburgAddress.txt"));
		ArrayList<String> address = new ArrayList<String>(); 
		
		String spokenWord="";
		String maxWord;
		double totalLength = 0;
		
		while (file.hasNext())
		{
			word = file.next();
			address.add(word);
		}
		maxWord = address.get(0);
		for (int i = 0; i < address.size()-1 ; i++)
		{
			spokenWord = address.get(i);
			if (maxWord.length() < spokenWord.length())
				maxWord = spokenWord;
		}
		System.out.println("The longest word is: " + maxWord);
		
		for (String element: address)
		{
			totalLength += element.length();
		}
		totalLength = totalLength / address.size();
		System.out.println("The average length of each word is: " + totalLength);
	}
}
