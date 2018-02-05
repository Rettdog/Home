import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class dictChecker2 {

    public static void main(String[] args) throws FileNotFoundException {
    	File filer = new File("dictionary.txt");
    	PrintWriter pw = new PrintWriter(filer);
        try {
            System.out.print("Enter the file name with extension : ");

            Scanner input = new Scanner("dict.txt");

            File file = new File(input.nextLine());

            input = new Scanner(file);


            while (input.hasNextLine()) {
                String line = input.nextLine();
                if(line.length()==3||line.length()==4)
                	/*if(line.toLowerCase().charAt(0)=='p'||line.charAt(0)=='q'||line.charAt(0)=='r'||line.charAt(0)=='s'||line.charAt(0)=='t'||line.charAt(0)=='u'||line.charAt(0)=='v'||line.charAt(0)=='w'||line.charAt(0)=='x'||line.charAt(0)=='y'||line.charAt(0)=='z') {
                
                	}*/
                	while(filer.length()==3000) {
                		filer.delete();
                	}
                pw.println(line.toLowerCase());
            }
            input.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
