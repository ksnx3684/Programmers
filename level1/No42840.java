package level1;

import java.util.*;

public class No42840 {
	
	public static void main(String[] args) {
		
		int[] answers = {1,2,3,4,5};
		
		int[] a = Solution.solution(answers);
		
		for(int an: a) {
			System.out.println(an);
		}
	}
}

	class Solution {
	    public static int[] solution(int[] answers) {
	        int score1 = 0; int score2 = 0; int score3 = 0;
	        int i = 0; int j = 0; int k = 0;
	        int[] result = new int[3];
	        int[] supo1 = {1,2,3,4,5};
	        int[] supo2 = {2,1,2,3,2,4,2,5};
	        int[] supo3 = {3,3,1,1,2,2,4,4,5,5};
	        
	        for(int ans : answers){
	            if(ans == supo1[i]) score1++;
	            if(ans == supo2[j]) score2++;
	            if(ans == supo3[k]) score3++;
	            
	            i++; j++; k++;
	            if(i > 4) i = 0;
	            if(j > 7) j = 0;
	            if(k > 9) k = 0;
	        }
	        int max = Math.max(Math.max(score1, score2), score3);
	        ArrayList<Integer> list = new ArrayList<>();
	        if(max == score1) list.add(1);
	        if(max == score2) list.add(2);
	        if(max == score3) list.add(3);
	        int[] answer = new int[list.size()];
	        for(int a = 0; a < list.size(); a++) {
	        	answer[a] = list.get(a);
	        }
	        
	        return answer;
	    }
}
