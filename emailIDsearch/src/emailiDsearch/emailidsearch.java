package emailiDsearch;

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
		String search= "yta@yhw.com";
		int c=0;
		for (int i = 0; i < ID.size(); i++) {
			c+=1;
			if (search == ID.get(i)) {
				System.out.println("Email id found.");
				break;
			}
			if (c==ID.size()) {System.out.println("Email id did'nt found.");}
		}
	}
}
