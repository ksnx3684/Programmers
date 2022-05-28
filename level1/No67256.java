package level1;

public class No67256 {
	// 키패드 누르기
	
	public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        int lnow = 10; int rnow = 12;
        
        for(int n : numbers){
        	
            if(n == 0)
                n = 11;
            
            if(n == 1 || n == 4 || n == 7){
            	
                sb.append("L");
                lnow = n;
                
            } else if(n == 3 || n == 6 || n == 9){
            	
                sb.append("R");
                rnow = n;
                
            } else{
            	
                int llen = Math.abs((lnow-1)%3 - (n-1)%3) + Math.abs((lnow-1)/3 - (n-1)/3);
                int rlen = Math.abs((rnow-1)%3 - (n-1)%3) + Math.abs((rnow-1)/3 - (n-1)/3);
                
                if(llen > rlen){
                	
                    sb.append("R");
                    rnow = n;
                    
                } else if(llen < rlen){
                	
                    sb.append("L");
                    lnow = n;
                    
                } else{
                	
                    if(hand.equals("right")){
                    	
                        sb.append("R");
                        rnow = n;
                        
                    } else{
                    	
                        sb.append("L");
                        lnow = n;
                        
                    }
                    
                }
                
            }
            
        }
        
        return sb.toString();
        
    }

}
