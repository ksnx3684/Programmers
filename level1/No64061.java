package level1;

import java.util.*;

public class No64061 {
	// 크레인 인형뽑기 게임

	class Solution {
	    public int solution(int[][] board, int[] moves) {
	        
	        int result = 0; int j = 1;
	        Stack<Integer> list = new Stack<>();
	        
	        for(int m : moves){
	        	
	            for(int i = 0; i < board[0].length; i++){
	            	
	                if(board[i][m-1] != 0){
	                	
	                    list.push(board[i][m-1]); board[i][m-1] = 0;
	                     
	                    if(list.size() > 1){
	                    	
	                       if(list.get(j) == list.get(j-1)){
	                    	   
	                            list.pop();
	                            list.pop();
	                            result = result + 2; j--;
	                            
	                           if(list.size() == 0)
	                               j++;
	                           
	                        } else
	                           j++;
	                       
	                    }
	                    
	                    break;
	                    
	                }
	                
	            }
	            
	        }
	        
	        return result;
	        
	    }
	    
	}
	
//	public static void main(String[] args) {
//	
//		int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};	
//		int[] moves = {1,5,3,5,1,2,1,4};
//		
//		int result = Solution.solution(board, moves);
//		
//		System.out.println(result);
//	}

}
