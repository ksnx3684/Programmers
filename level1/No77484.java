package level1;
public class No77484 {
	// 로또의 최고 순위와 최저 순위

	public int[] solution(int[] lottos, int[] win_nums) {
		int max = 0, min = 0;
		for(int i = 0; i < 6; i++) {
			if(lottos[i] == 0)
				max++;
			for(int j = 0; j < 6; j++) {
				if(lottos[i] == win_nums[j])
					min++;
			}
		}
		max += min;
		
		int[] answer = new int[2];
		answer[0] = Math.min(7 - max, 6);
		answer[1] = Math.min(7 - min, 6);
		return answer;
		}
	
}