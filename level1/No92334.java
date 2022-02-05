package level1;
//import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
public class No92334 {
	// 신고 결과 받기
	
	// ArrayList를 이용한 아래의 코드를 이용하면 정상적으로 값은 도출해내지만 24개의 테스트 케이스 중 6개 케이스에서 시간초과가 발생하였다
	// 대신 Map과 HashSet을 이용하여 코드의 길이가 조금 늘어났지만 시간을 좀 더 단축시킬 수 있었다
		
	public static int[] solution (String[] id_list, String[] report, int k) {
		int[] answer = new int[id_list.length]; // 통보 횟수를 저장하는 배열 선언
		
		Map<String, HashSet<String>> a  = new HashMap<>(); // 각 유저에 따른 자신을 신고한 사람들의 리스트 (Hash는 중복을 없앤다)

		for(String id : id_list)
			a.put(id,new HashSet<>()); // a의 key값에 유저 이름을 넣고 각각의 value값에 HashSet을 생성한다
		
		for(String r : report) {
			String[] singo = r.split(" "); // 앞에가 신고자, 뒤에가 피신고자
			a.get(singo[1]).add(singo[0]); // get이 key값이고 add가 value값으로 a리스트에 신고한 사람을 넣는다 
		}
		
		for(String key : a.keySet()) {
			HashSet<String> reporters = a.get(key);
			if(reporters.size() >= k) { // 만약 자신을 신고한 사람이 k이상이면
				for(int i = 0; i < id_list.length; i++) {
					if(reporters.contains(id_list[i]))
						answer[i]++; // 해당 사람의 통보 횟수 1 증가
				}
			}
		}
        return answer;
    }

	
//	public static int[] solution (String[] id_list, String[] report, int k) {
//		int[] answer = new int[id_list.length]; // 통보 횟수를 저장하는 배열 선언
//		for(int i = 0; i < id_list.length; i++) {
//			ArrayList<String> a = new ArrayList<>(); // 자신을 신고한 사람들의 리스트
//			
//			for(int j = 0; j < report.length; j++) {
//				String[] singo = report[j].split(" ");  // 앞에가 신고자, 뒤에가 피신고자
//				
//				// 자신의 이름과 피신고자의 이름이 같으면서(자신이 신고당했으면서), 자신을 신고한 사람이 리스트에 없다면
//				if(singo[1].equals(id_list[i]) && !a.contains(singo[0])){
//					a.add(singo[0]); // 리스트에 추가
//				}
//			}
//			if(a.size() >= k) {
//				for(int l = 0; l < id_list.length; l++) {
//					if(a.contains(id_list[l]))
//						answer[l]++;
//				}
//			}
//		}
//		return answer;
//	}

}