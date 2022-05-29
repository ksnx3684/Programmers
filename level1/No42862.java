package level1;

import java.util.*;

public class No42862 {
	// 체육복
	
	class Solution {
		public int solution(int n, int[] lost, int[] reserve) {
			
			List<Integer> losts = new ArrayList<>();
			List<Integer> reserves = new ArrayList<>();
			
			for(int i = 0; i < lost.length; i++) 
				losts.add(lost[i]);
			for(int i = 0; i < reserve.length; i++)
				reserves.add(reserve[i]);
			losts.sort(null); reserves.sort(null);
		
	        int count = n - lost.length;
	        
	        for(int i = 0; i < lost.length; i++) {
	        	for(int j = 0; j < reserve.length; j++) {
	        		if(losts.get(i) == reserves.get(j)) {
		        		losts.set(i, -1); reserves.set(j, -1);
		        		count++; break;
	        		}
	        	}
	        }
	        
	        for(int l : losts){
	            for(int i = 0; i < reserve.length; i++){
	                if(reserves.get(i)-1 == l || reserves.get(i)+1 == l){
	                    count++; reserves.set(i, -1); break;
	                }
	            }      
		    }
	        return count;
		}
	}
}
