/*
 * https://www.hackerrank.com/challenges/array-left-rotation/problem
 *@author Godfrey Damabel
 */
import java.util.*;
class Solution {
	public static void main(){
		int[] arr = { 1, 2, 3, 4, 5 };
		// Convert array of primitive int into Integer array
		Integer[] boxedArray = Arrays.stream(arr).boxed().toArray(Integer[]::new);
		List<Integer> list = new ArrayList<>(); //copy to list
		Collections.addAll(list, boxedArray);
		leftRotation(4,list);
	}

	/**
	 * 
	 * @param d number of rotation
	 * @param arr list of value to rotate left
	 * @return list of integers
	 */
	static List<Integer> leftRotation(int d, List<Integer> arr) {
		for(int i = 0; i< d; i++){
			int temp = arr.get(0);
			arr.remove(0);
			arr.add(temp);
		} 
		return arr;
	}

	static List<Integer> leftRotationSol2(int d, List<Integer> arr) {

		List<Integer> bb = arr.subList(0, d);
		arr.addAll(bb);
		arr.subList(0, d).clear();;
		return arr;
	}
}