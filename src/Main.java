import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Read each line int the text file.
		List<String> lines = Files.readAllLines(Paths.get("C:\\Users\\Mindy\\Documents\\GitHub\\ComplexMultiplication\\src\\input.txt"));
		String var1 = "";
		String var2 = "";
		System.out.println(lines);

		for(int i = 0;i<lines.size();i++)
		{
			var1 = lines.get(i);
			var2 = lines.get(i+1);
			i++;
			

		}
		
		
		

	}


}
