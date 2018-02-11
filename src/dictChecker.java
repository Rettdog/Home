import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class dictChecker {
	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter pw = new PrintWriter(new File("dictionary.txt"));
		File file = new File("dict.txt");
		Scanner sc = new Scanner(file);
		String line;
		while (sc.hasNextLine()) {
			line = sc.nextLine();
			if (line.length() == 4 || line.length() == 3) {
				pw.println(line.toLowerCase());
			}

		}
		sc.close();
		pw.close();
	}
}
