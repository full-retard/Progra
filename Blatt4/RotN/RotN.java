public class RotN {
	public static void main(String[] args) {
		Geheim nachricht = new Geheim();
		nachricht.input();

		int rot = 0;
		while (rot < 1 || rot > 25) {
			System.out.print("Verschiebungsweite angeben: ");
			try {
				rot = Integer.parseInt(System.console().readLine());
			} catch (NumberFormatException e) {
				System.out.println("*** ungültige Eingabe");
				continue;
			}

			if (rot < 0 || rot > 25) {
				System.out.println("*** Verschiebungsweite muss zwischen 0 und 25 liegen");
				continue;
			}
		}

		Geheim encrypted = new Geheim();
		encrypted.nachricht = new char[nachricht.nachricht.length][];
		for (int i = 0; i < nachricht.nachricht.length; i++) {
			encrypted.nachricht[i] = new char[nachricht.nachricht[i].length];
			for (int j = 0; j < nachricht.nachricht[i].length; j++)
				encrypted.nachricht[i][j] = encrypt(nachricht.nachricht[i][j], rot);
		}

		System.out.println("Die Nachricht ist:");
		for (int i = 0; i < encrypted.nachricht.length; i++)
			System.out.println(encrypted.nachricht[i]);
	}

	static char encrypt(char c, int r) {
		String characters = "abcdefghijklmnopqrstuvwxyz";
		int i = c - 'a' + r;
		while (i < 0 || i > 25) {
			if (i > 25)i -= 26;
		}
		return characters.charAt(i);
	}
}
