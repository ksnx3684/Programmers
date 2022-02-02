package level1;
public class No72410 {
	// 신규 아이디 추천
	
	public static String solution(String new_id) {
		// 1
		new_id = new_id.toLowerCase();
		
		// 2
		new_id = new_id.replaceAll("[^a-z0-9-_.]", "");
		
		// 3
		while(new_id.contains(".."))
			new_id = new_id.replace("..", ".");
		
		// 4
		if(new_id.length() > 0) {
			if(new_id.charAt(0) == '.')
				new_id = new_id.replaceFirst(".", "");
		}
		if(new_id.length() > 0) {
			if(new_id.charAt(new_id.length() - 1) == '.')
				new_id = new_id.substring(0, new_id.length()-1);
		}
		
		// 5
		if(new_id.length() == 0)
			new_id = "a";
		
		// 6
		if(new_id.length() > 15)
			new_id = new_id.substring(0, 15);
		if(new_id.charAt(new_id.length() - 1) == '.')
			new_id = new_id.substring(0, new_id.length()-1);
		
		// 7
		if(new_id.length() < 3) {
			for(int i = new_id.length(); i < 3; i++) {
				String a = new_id.substring(new_id.length() - 1);
				new_id = new_id + a;
			}
		}
		
		String answer = new_id;
		return answer;
	}
}