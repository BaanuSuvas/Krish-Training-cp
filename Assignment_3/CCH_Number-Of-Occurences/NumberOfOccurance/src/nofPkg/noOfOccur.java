package nofPkg;
import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;

public class noOfOccur {
	
	public static void main(String[] args) {
		
		//create instance of Scanner class
		Scanner sc = new Scanner(System.in);
		int temp;
		int count = 0;
		
		System.out.println("Enter any word : ");
		String wordStr = sc.nextLine();
		sc.close();
		
		char[] strArr = new char[wordStr.length()];
		
		for(int i=0; i<wordStr.length(); i++) {
			strArr[i] = wordStr.toLowerCase().charAt(i);
		}
		
		//sort the letters of strArr
		for(int p= 0; p<strArr.length; p++) {
			for(int q=0; q<strArr.length; q++) {
				if(strArr[p] > strArr[q]) {
					temp = strArr[p];
					strArr[p] = strArr[q];
					strArr[q] = (char) temp;
				}
			}
		}
		
		// declare a TreeMap variable 
		Map<String, Integer> lettMap = new TreeMap<>();
		
		for(int i=0; i<strArr.length; i++) {
			for(int j=0; j<strArr.length; j++) {
				if(strArr[i] == strArr[j]) {
					count++;
				}
			}
			
			// put the value inside TreeMap variable
			lettMap.put(String.valueOf(strArr[i]), count);
			count=0;
		}
		// print the results
		for(String m: lettMap.keySet()) {
			System.out.println(m + "  " + "occur"+ "  " + lettMap.get(m));
		}
			
	}

}
