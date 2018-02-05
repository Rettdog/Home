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
for(int i = 0;i<1;) {
	line = sc.next("dict.txt");
if(line.length()==4||line.length()==3) {
	pw.println(sc.nextLine());
}
	
}
}
}
