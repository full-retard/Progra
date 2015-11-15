public class Palindrom {
	static boolean is_palindrom(String s) {
		String umgekehrt = "";
		for (int i = 0; i < s.length(); i++)
			umgekehrt = s.charAt(i) + umgekehrt;
		return s.equals(umgekehrt);
	}

	public static void main(String[] args){
		assert(is_palindrom(""));
		assert(is_palindrom("a"));
		assert(is_palindrom("aa"));
		assert(is_palindrom("aba"));
		assert(!is_palindrom("abab"));
		assert(!is_palindrom("abb"));
		System.out.println("Everything good!");
	}
}
