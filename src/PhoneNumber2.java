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
	public static void main(String[] args) {
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
		
		for(int j = 0;j<3;j++) {
			if(oo0=='7'||oo0=='9'&& ao==0) {
				j=-1;
				ao=1;
			}
			if(oo0=='1'||oo0=='0') {
				j=2;
			}
			for(int k = 0;k<3;k++) {
				if(oo1=='7'||oo1=='9'&& bo==0) {
					k=-1;
					bo=1;
				}
				if(oo1=='1'||oo1=='0') {
					k=2;
				}
				for(int l = 0;l<3;l++) {
					if(oo2=='7'||oo2=='9'&& co==0) {
						l=-1;
						co=1;
					}
					if(oo2=='1'||oo2=='0') {
						l=2;
					}
					for(int m = 0;m<3;m++) {
						if(oo3=='7'||oo3=='9'&& doo==0) {
							m=-1;
							doo=1;
						}
						if(oo3=='1'||oo3=='0') {
							m=2;
						}
						for(int n = 0;n<3;n++) {
							if(oo4=='7'||oo4=='9'&& eo==0) {
								n=-1;
								eo=1;
							}
							if(oo4=='1'||oo4=='0') {
								n=2;
							}
							for(int o = 0;o<3;o++) {
								if(oo5=='7'||oo5=='9'&& fo==0) {
									o=-1;
									fo=1;
								}
								if(oo5=='1'||oo5=='0') {
									o=2;
								}
								for(int p = 0;p<3;p++) {
									if(oo6=='7'||oo6=='9'&& go==0) {
										p=-1;
										go=1;
									}
									if(oo6=='1'||oo6=='0') {
										p=2;
									}
									for(int q = 0;q<3;q++) {
										if(oo7=='7'||oo7=='9'&& ho==0) {
											q=-1;
											ho=1;
										}
										if(oo7=='1'||oo7=='0') {
											q=2;
										}
										for(int r = 0;r<3;r++) {
											if(oo8=='7'||oo8=='9'&& io==0) {
												r=-1;
												io=1;
											}
											if(oo8=='1'||oo8=='0') {
												r=2;
											}
												for(int s = 0;s<3;s++) {
													if(oo9=='7'||oo9=='9'&& jo==0) {
														s=-1;
														jo=1;
													}
													if(oo9=='1'||oo9=='0') {
														s=2;
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
			}
		}
	

	public char myLetter(char i){
		char myLetter = ' ';
		if(i=='1') {
			myLetter = '1';
		}else if(i=='2') {
			
		}else if(i=='3') {
			
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
		
		return myLetter;
	}
}
