package Java_ScannerAdapter;

/*
Axel Tingman axti3665
*/

import java.util.ArrayList;
import java.util.Scanner;
import java.io.InputStream;

//@UnderTest(id="U6.4")
public class ScannerAdapter {
	
	private static ArrayList<InputStream> streamList = new ArrayList<InputStream>();
	private Scanner scanner;
	
	/* First constructor WHITHOUT parameters: */
	public ScannerAdapter() { 
		this(System.in); /* "this" is used to invoke the second constructor */
	}
	
	/* Second constructor WITH parameters: */
	public ScannerAdapter(InputStream stream) {
		if(!streamList.contains(stream)) {
			streamList.add(stream);
			scanner = new Scanner(streamList.get(streamList.size()-1));
		}
		else {
			throw new IllegalStateException("hejhopp");
		}

	}
	
	/* Method for receiving integer inputs: */
	public int scanInt(String prompt) { 
		System.out.print(prompt + "?> ");
		int output = scanner.nextInt();
		scanner.nextLine();
		return output;
	}	
	
	/* Method for receiving string inputs: */
	public String scanString(String prompt) { 
		System.out.print(prompt + "?> ");
		String output = scanner.nextLine();
		return output;
	}
	
	/* Method for receiving double inputs: */
	public double scanDouble(String prompt) { 
		System.out.print(prompt + "?> ");
		double output = scanner.nextDouble();
		scanner.nextLine();
		return output;
	}
}
