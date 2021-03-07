/*
 *@author Godfrey Damabel
 */
import java.util.*;
class Solution {
	public static void main(){		
		int[] arr1 = {1,1,0,1,1,1};
		System.out.println(cornfLIP(arr1)); // return 2
		int[] arr2 = {1,1,0,1,1,1,0,1,1,0,0,0,1,1};
		System.out.println(cornfLIP(arr2)); //return 6
	}

	/*
	 * get the minimal flip such that a tail must be preceded or proceeded with a head
	 * @param array of unordered coins
	 * @return min flip
	 */
	static int minCoinfLIP(int[] arr) {
		int count1 = 0;
		int count2 = 0;
		int head = 1;
		int tail = 0;
		for(int i = 0; i < arr.length; i++) {
			int currentChar = arr[i];
			if(currentChar == head) {
				count1++;        		
				if(head == 1) {
					head = 0;
				}else {
					head = 1;
				}
			}else {
				head = currentChar;
			}

			if(currentChar == tail) {
				count2++;

				if(tail == 1) {
					tail = 0;
				}else {
					tail = 1;
				}
			}else {
				tail = currentChar;
			}        
		}
		return Math.min(count1,count2);
	}
}