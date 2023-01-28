package stringBuffer;

public class StringBuffer {
	
	public static String skompresuj(String inputStr) {
		String outStr = "";
		java.lang.StringBuffer sb = new java.lang.StringBuffer(outStr);
		int strLength = inputStr.length();
		for (int i=0; i<strLength;) {
			int n=1;
			while (i+n<strLength && (inputStr.charAt(i) == inputStr.charAt(i+n))) {
				n++;
			}
			sb.append(n);
			sb.append(inputStr.charAt(i));
			i+=n;
		}
		outStr = sb.toString();
		return outStr;
	}
	
	
	public static void main(String[] args) {
		String tekst = "abbcccddddeeeeefffffffffffffffffffffffffffffffgggggggggggggggggggggggggghhhhhhhhhhhhhhhhhhhhhhhjjkkkkkkkdddddi";
		System.out.println(skompresuj(tekst));
		
	}

}
