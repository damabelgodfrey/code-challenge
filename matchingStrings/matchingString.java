/*
 * https://www.hackerrank.com/challenges/sparse-arrays/problem
 * @author Godfrey Damabel
 */
import java.util.*;
class Solution {
	public static void main(){

		String[] strings = {"boy","man","sad","hap","sad","man","sad","hap","man","sad"};
		String[] query = {"boy","man","sad","alarm","hap"};
		matchingStringsSol1(strings,query);
	}

	static int[] matchingStringsSol1(String[] strings, String[] queries) {
		HashMap<String, Integer> map  = new HashMap();
		int[] marchingCount = new int[queries.length];
		for (int i = 0; i < strings.length; i++) {
			map.merge(strings[i], 1, Integer::sum); // add new key to map with value 1 if key already exist update value to 2
		}

		for (int i = 0; i < queries.length; i++) {
			marchingCount[i] = map.getOrDefault(queries[i], 0); //if key not found return 0 as default
		}
		return marchingCount;
	}

	static int[] matchingStringsSol2(String[] strings, String[] queries) {
		List<String> myList = new ArrayList<>(Arrays.asList(strings)); //convert array to arraylist
		int[] marchingCount = new int[queries.length];
		int pos= 0;
		for(int a = 0; a < queries.length; a++) {
			String query= queries[a];
			int counter =0;	 
			for(int i = 0; i < myList.size(); i++) {
				if(query == myList.get(i)) {
					counter++;
				}
			}
			try {
				marchingCount[pos] = counter;
			}catch(Exception e) {
				break;
			}
			pos++;
			myList.removeAll(Collections.singletonList(strings)); // remove all occurrence of search word
		}
		return marchingCount;
	}
}