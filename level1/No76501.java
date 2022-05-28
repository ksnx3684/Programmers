package level1;

public class No76501 {
	// 음양 더하기
	
	class Solution {
	    public int solution(int[] absolutes, boolean[] signs) {
	        int result = 0;
	        for(int i = 0; i < absolutes.length; i++){
	            if(signs[i])
	                result += absolutes[i];
	            else
	                result -= absolutes[i];
	        }
	        return result;
	    }
	}

}
