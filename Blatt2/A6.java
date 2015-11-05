public class A4 {
	public static void main(String args[]) {
		int anzahl = 0;
		while (anzahl < 1) {
			System.out.print("Anzahl (> 0) eingeben: ");
			anzahl = Integer.parseInt(System.console().readLine());
			if (anzahl < 1) System.out.println("Anzahl muss positiv sein.");
		}

		int summe = 0;
		for (int i = 0; i < anzahl; i++) {
			System.out.print("Zahl " + (i + 1) + " eingeben: ");
			summe += Integer.parseInt(System.console().readLine());
		}
		System.out.println("Das arithmetische Mittel von " + summe + " ist: " + ((double)summe / anzahl));
	}
}
