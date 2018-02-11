import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class PhoneNumber2 {
	static int o0=1;
	static int o1=1;
	static int o2=3;
	static int o3=3;
	static int o4=3;
	static int o5=3;
	static int o6=3;
	static int o7=4;
	static int o8=3;
	static int o9=4;
	static char miLetter = ' ';
	static String[]letters=new String[] {"000","111","abc","def","ghi","jkl", "mno", "pqrs", "tuv", "wxyz"};
	public static void main(String[] args) throws FileNotFoundException {
		String phoneNumber = JOptionPane.showInputDialog("What is your phone number?");
		char oo0 = phoneNumber.charAt(0);
		char oo1 = phoneNumber.charAt(1);
		char oo2 = phoneNumber.charAt(2);
		char oo3 = phoneNumber.charAt(3);
		char oo4 = phoneNumber.charAt(4);
		char oo5 = phoneNumber.charAt(5);
		char oo6 = phoneNumber.charAt(6);
		char oo7 = phoneNumber.charAt(7);
		char oo8 = phoneNumber.charAt(8);
		char oo9 = phoneNumber.charAt(9);
		//System.out.println(oo0);
		//System.out.println(oo2);
		//System.out.println(oo4);
		//System.out.println(oo6);
		int ao = 0;
		int bo = 0;
		int co = 0;
		int doo = 0;
		int eo = 0;
		int fo = 0;
		int go = 0;
		int ho = 0;
		int io = 0;
		int jo = 0;
		int j1 = 3;
		int k1 = 3;
		int l1 = 3;
		int m1 = 3;
		int n1 = 3;
		int o1 = 3;
		int p1 = 3;
		int q1 = 3;
		int r1 = 3;
		int s1 = 3;
		String firstWord = "";
		String middleWord= "";
		String lastWord="";
		String myWord = "";
		PrintWriter pw = new PrintWriter(new File("phone.txt"));
		File file = new File("dictionary.txt");
		ArrayList<String> array = new ArrayList<String>();
		PrintWriter prw = new PrintWriter(new File("finish.txt"));
		//File filer = new File("dict.txt");
		Scanner sc = new Scanner(file);
		String line;
		while (sc.hasNextLine()) {
			line = sc.nextLine();
			//if (line.length() == 4 || line.length() == 3) {
				
				array.add(line);
				//System.out.println(array.size());
			//}

		}
		
		
		sc.close();
		
	

				
		
		for(int j = 0;j<j1;j++) {

			if(oo0=='7'||oo0=='9'&& ao==0) {
				j1=4;
				ao=1;
			}
			if(oo0=='1'||oo0=='0') {
				j1=1;
			}
			for(int k = 0;k<k1;k++) {
				if(oo1=='7'||oo1=='9'&& bo==0) {
					k1=4;
					bo=1;
				}
				if(oo1=='1'||oo1=='0') {
					k1=1;
				}
				for(int l = 0;l<l1;l++) {
					if(oo2=='7'||oo2=='9'&& co==0) {
						l1=4;
						co=1;
					}
					if(oo2=='1'||oo2=='0') {
						l1=1;
					}
					for(int m = 0;m<m1;m++) {
						if(oo3=='7'||oo3=='9'&& doo==0) {
							m1=4;
							doo=1;
						}
						if(oo3=='1'||oo3=='0') {
							m1=1;
						}
						for(int n = 0;n<n1;n++) {
							if(oo4=='7'||oo4=='9'&& eo==0) {
								n1=4;
								eo=1;
							}
							if(oo4=='1'||oo4=='0') {
								n1=1;
							}
							for(int o = 0;o<o1;o++) {
								if(oo5=='7'||oo5=='9'&& fo==0) {
									o1=4;
									fo=1;
								}
								if(oo5=='1'||oo5=='0') {
									o1=1;
								}
								for(int p = 0;p<p1;p++) {
									if(oo6=='7'||oo6=='9'&& go==0) {
										p1=4;
										go=1;
									}
									if(oo6=='1'||oo6=='0') {
										p1=1;
									}
									for(int q = 0;q<q1;q++) {
										if(oo7=='7'||oo7=='9'&& ho==0) {
											q1=4;
											ho=1;
										}
										if(oo7=='1'||oo7=='0') {
											q1=1;
										}
										for(int r = 0;r<r1;r++) {
											if(oo8=='7'||oo8=='9'&& io==0) {
												r1=4;
												io=1;
											}
											if(oo8=='1'||oo8=='0') {
												r1=1;
											}
												for(int s = 0;s<s1;s++) {
													if(oo9=='7'||oo9=='9'&& jo==0) {
														s1=4;
														jo=1;
													}
													if(oo9=='1'||oo9=='0') {
														s1=1;
													}
													//start
													myLetter(oo0,j);
													//System.out.println(miLetter);
													myWord = myWord + miLetter;
													firstWord = firstWord + miLetter;
													myLetter(oo1,k);
													//System.out.println(miLetter);
													myWord = myWord + miLetter;
													firstWord = firstWord + miLetter;
													myLetter(oo2,l);
													//System.out.println(miLetter);
													myWord = myWord + miLetter;
													firstWord = firstWord + miLetter;
													     myWord = myWord + "-";
													myLetter(oo3,m);
													//System.out.println(miLetter);
													myWord = myWord + miLetter;
													middleWord = middleWord + miLetter;
													myLetter(oo4,n);
													//System.out.println(miLetter);
													myWord = myWord + miLetter;
													middleWord = middleWord + miLetter;
													myLetter(oo5,o);
													//System.out.println(miLetter);
													myWord = myWord + miLetter;
													middleWord = middleWord + miLetter;
													     myWord = myWord + "-";
													myLetter(oo6,p);
													//System.out.println(miLetter);
													myWord = myWord + miLetter;
													lastWord = lastWord + miLetter;
													myLetter(oo7,q);
													//System.out.println(miLetter);
													myWord = myWord + miLetter;
													lastWord = lastWord + miLetter;
													myLetter(oo8,r);
													//System.out.println(miLetter);
													myWord = myWord + miLetter;
													lastWord = lastWord + miLetter;
													myLetter(oo9,s);
													//System.out.println(miLetter);
													myWord = myWord + miLetter;
													lastWord = lastWord + miLetter;
													
													//System.out.println(myWord);
													pw.println(myWord);
													//System.out.println(middleWord);
													if((array.contains(firstWord))) {
														prw.println(firstWord.toUpperCase()+"-"+middleWord+"-"+lastWord);
														//System.out.println(myWord);
													}else if((array.contains(middleWord))){
														prw.println(firstWord+"-"+middleWord.toUpperCase()+"-"+lastWord);
														//System.out.println(myWord);
													}else if(array.contains(lastWord)) {
														prw.println(firstWord+"-"+middleWord+"-"+lastWord.toUpperCase());
														//System.out.println(myWord);
													}else {
													//	System.out.println(hm.get(firstWord));
													}
													myWord = "";
													firstWord = "";
													middleWord = "";
													lastWord = "";
													//end
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		pw.close();
		prw.close();
		}
	

	public static char myLetter(char i, int counter){
		miLetter = ' ';
		miLetter = letters[i-48].charAt(counter);
	
		return miLetter;
	}
	/*	if(i=='1') {
	myLetter = '1';
}else if(i=='2') {
	myLetter = letters[i-48].charAt(counter);
}else if(i=='3') {
	myLetter = letters[i-48].charAt(counter);
}else if(i=='4') {
	
}else if(i=='5') {
	
}else if(i=='6') {
	
}else if(i=='7') {
	
}else if(i=='8') {
	
}else if(i=='9') {
	
}else if(i=='0') {
	myLetter = '0';
}else {
	
}
*/
	
}
