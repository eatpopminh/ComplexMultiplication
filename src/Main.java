import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("HEllo");
		//Read each line int the text file.
		List<String> lines = Files.readAllLines(Paths.get("input.txt"));

	}

}
