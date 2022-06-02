package level1;

import java.util.*;

public class No42748 {
	// K번째수
	
	public int[] solution(int[] array, int[][] commands) {
        int[] result = new int[commands.length];
        for(int i = 0; i < commands.length; i++){
            int start = commands[i][0];
            int end = commands[i][1];
            int num = commands[i][2];
            
            int[] slice = Arrays.copyOfRange(array, start-1, end);
            
            Arrays.sort(slice);
            
            result[i] = slice[num-1];
        }
        return result;
    }

}
