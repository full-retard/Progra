public class Palindrom {
	static boolean is_palindrom(String s) {
		int i = s.length(), e = i - 1;
		for (int b = 0; b < (i/2); b++, e--)
			if (s.charAt(e) != s.charAt(b)) return false;
		return true;
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
