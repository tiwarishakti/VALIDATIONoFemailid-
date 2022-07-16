package emailidsearch;


import java.util.ArrayList;

public class emailidsearch {
	public static void main(String[] args) {
		ArrayList<String> ID = new ArrayList<String>();
		ID.add("abc@yhw.com");
		ID.add("def@yhw.com");
		ID.add("ghi@yhw.com");
		ID.add("jkl@yhw.com");
		ID.add("mno@yhw.com");
		ID.add("pqr@yhw.com");
		ID.add("stu@yhw.com");
		ID.add("vwx@yhw.com");
		ID.add("yza@yhw.com");
		ID.add("bcd@yhw.com");
		String search;
		search = "vwx@yhw.com";

		for (int i = 0; i < ID.size(); i++) {
			System.out.println(ID.get(i));
			if (search == ID.get(i)) {
				System.out.println("\n");
				System.out.println("Email id found.");
				break;
			}
		}
	}
}
