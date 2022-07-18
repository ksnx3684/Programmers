package level1;

import java.util.*;

public class No1845 {
	// 폰켓몬
	
    public int solution(int[] nums) {
        int len = nums.length / 2;
        int result = 0;
        List<Integer> list = new ArrayList<>();
        for(int n : nums){
            if(result == len)
                break;
            if(!list.contains(n)){
                list.add(n);
                result++;
            }
        }
        return result;
    }
    
}
