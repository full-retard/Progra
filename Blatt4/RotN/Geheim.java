public class Geheim {
	public static char[][] nachricht;

	void input() {
		int count = 0;
		while (count < 1) {
			System.out.print("Geben Sie an, wie viele Worte Sie eingeben wollen: ");
			try {
				count = Integer.parseInt(System.console().readLine());
			} catch (NumberFormatException e) {
				System.out.println("*** ungültige Eingabe");
				continue;
			}

			if (count < 1) {
				System.out.println("*** bitte positive Anzahl eingeben");
				continue;
			}
		}

		nachricht = new char[count][];

		String inputWord;
		for (int i = 0; i < count; i++) {
			System.out.print("Wort " + (i+1) + " eingeben: ");
			nachricht[i] = System.console().readLine().toCharArray();
		}
	}
}
