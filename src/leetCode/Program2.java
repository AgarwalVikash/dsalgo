package leetCode;

import java.util.ArrayList;
import java.util.List;

public class Program2 {

	public static void main(String args[]) {
		String s = "PAYPALISHIRING";
		int numRows = 3;
		int lengthOfString = s.length();
		if (numRows == lengthOfString)
			System.out.println(s);
		List<StringBuilder> arrayList = new ArrayList<StringBuilder>();

		for (int x = 0; x < numRows; x++) {
			arrayList.add(new StringBuilder());
		}
		int rowPointer = 0;
		boolean direction=true;
		for (int i = 0; i < lengthOfString - 1; i++) {
			arrayList.get(rowPointer).append(s.charAt(i));
			if(!direction)
				rowPointer--;
			if(direction)
				rowPointer++;
			if(rowPointer>=numRows-1)
				direction=false;
			if(rowPointer==0)
				direction=true;
			
		}
		StringBuilder outPut = new StringBuilder();
		for (StringBuilder os : arrayList) {
			outPut.append(os);
		}
		System.out.println(outPut.toString());
	}

}
