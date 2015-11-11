public class A4 {
	static int count_a(String s) {
		int as = 0;
		for (int i = 0; i < s.length(); i++) 
			if (s.charAt(i) == 'a')
				as++;
		return as;
	}

	public static void main(String[] args){
		assert(count_a("") == 0);
		assert(count_a("a") == 1);
		assert(count_a("aa") == 2);
		assert(count_a("abb") == 1);
		assert(count_a("abba") == 2);
		assert(count_a("bb") == 0);
		System.out.println("Everything good!");
	}
}
