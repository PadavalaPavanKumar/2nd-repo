package CollectionFramework;
import CollectionFramework.ListTest1;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Properties;

public class ListTest {
	public static void main(String... args) throws Exception {
          ListTest1 lt=new ListTest1();
		FileReader fileReading = new FileReader(new File("test.properties"));
		Properties props = new Properties();
		props.load(fileReading);
		ArrayList<String> arrayListOfLetterCombinations = new ArrayList<String>();

		String letters = props.getProperty("5"); 
		
		String letters1 = props.getProperty("4"); 
		for (int i = 0; i < letters.length(); i++) {
			for (int j = 0; j < letters1.length(); j++) {
				char a = letters.charAt(i);
				char b = letters1.charAt(j);
				String lettersCombinations = "" + a + b;
				
				arrayListOfLetterCombinations.add(lettersCombinations);
			}
		}

		System.out.println(arrayListOfLetterCombinations);

	}
}