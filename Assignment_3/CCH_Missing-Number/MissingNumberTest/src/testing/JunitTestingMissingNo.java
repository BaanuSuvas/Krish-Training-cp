package testing;
import java.util.Scanner;

public class JunitTestingMissingNo {
	
	
	public static void main (String[] args) {
		
		
		int swNo = 0;
		
		// create the instance of scanner class
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your numbers : ");
		
		// split the 
		String[] arrNum = sc.next().split(",");
		System.out.println("Array length : " + arrNum.length);
		int[] noCnt = new int[arrNum.length];
		
		//Initialize array
		for(int p=0; p<noCnt.length; p++ ) {
			noCnt[p]=Integer.parseInt(arrNum[p]);
		}
		
		
		// sort the un-sorted array as sorted array
		for(int i=0; i<noCnt.length-1; i++) {
			for(int j=0; j<noCnt.length-1; j++) {
				if(noCnt[j] > noCnt[j+1]) {
					swNo = noCnt[j];
					noCnt[j] = noCnt[j+1];
					noCnt[j+1] = swNo;
				}
			}
		}

		
		// print the sorted array
		for(int a = 0; a<noCnt.length; a++) {
			System.out.println(noCnt[a]);
		}
		
		// invoke the missingNum() function to number array
		int misNum = missingNum(noCnt);
	
        if (misNum > 0){
        	System.out.println("The Missing Number is : " + misNum);
        }
	else {
            int missingFisr = noCnt[0]-1;
            System.out.println("There ara no missing number in the middle so it can be first or last");
            System.out.println("so first number is : " + (noCnt[0]-1) + " or " + "last number : " + (noCnt[noCnt.length-1]+1));
        }
		
		
	}
	
	public static int missingNum(int[] arr) {
        int size = arr.length;
        int left = 0;
        int right = size -1;
        int middle = 0;
        int count = 0;


        while ((right - left) > 1){
            middle  = (right + left)/2;
            if ((arr[left] - left) != (arr[middle] -middle)){
                right = middle;
                count++;
            }
            if ((arr[right] - right) != (arr[middle] -middle)){
                left = middle;
                count++;
            }
            if (count <=0){
                return -1;


            }
        }

       return (arr[left]+1);
	}
}
