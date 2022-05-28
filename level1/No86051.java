package level1;

public class No86051 {
	// 없는 숫자 더하기
	
	class Solution {
	    public int solution(int[] numbers) {
	        int result = 45;
	        for(int n : numbers){
	            result = result - n;
	        }
	        return result;
	    }
	}

}
