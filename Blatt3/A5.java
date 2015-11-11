public class A5 {
	static boolean is_palindrom(String s) {
		return s.equals(new StringBuilder(s).reverse().toString());
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
