package JavaPrograms;

public class RemoveJunk {

	public static void main(String[] args) {
		String s = "@ Shiva 西瓦 is My Father ";
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
		
	}

}
