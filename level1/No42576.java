package level1;

import java.util.Arrays;
import java.util.HashMap;

public class No42576 {

	public static void main(String[] args) {
		
		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"eden", "kiki"};
		
		System.out.println(Solution.hashSolution(participant, completion));
		System.out.println(Solution.listSolution(participant, completion));
		
	}
	
	class Solution {
		public static String hashSolution(String[] participant, String[] completion) {
			String result = "";
			HashMap<String, Integer> map = new HashMap<>();
			
			for(String name : participant) {
				map.put(name, map.getOrDefault(name, 0) + 1);
			}
			for(String name : completion) {
				map.put(name, map.get(name) - 1);
			}
			for(String key : map.keySet()) {
				if(map.get(key) != 0) {
					result = key;
				}
			}
			return result;
		}
		
	    public static String listSolution(String[] participant, String[] completion) {
	    	String result = "";
	    	Arrays.sort(participant);
	    	Arrays.sort(completion);
	    	int i = 0;
    		for(i = 0; i < completion.length; i++) {
    			if(!participant[i].equals(completion[i])) {
    				return participant[i];
    			}
	    	}
	    	return participant[i];
	    }
	}
}
