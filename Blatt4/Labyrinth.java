public class Labyrinth {
	static char avatar(int r) {
		String dirs = ">^<v";
		switch (r) {
		case 0: case 1: case 2: case 3:
			return dirs.charAt(r);
		default:
			System.out.println("*** ungültige Richtung: " + r);
			// ehrenvoller Seppuku
			System.exit(1);
			return ' ';
		}
	}

	static void print(boolean[][] field, int[] pos, char r) {
		for (int i = 1; i < (field.length - 1); i++) {
			for (int j = 1; j < (field[0].length - 1); j++) {
				if (i == pos[1] && j == pos[0])
					System.out.print(r);
				else
					System.out.print
						(field[i][j] ? "." : "X");
				System.out.print(" ");
			}
			System.out.println();
		}
	}

	static boolean[] viewport(boolean[][] field, int[] pos) {
		return new boolean[] {
			field[pos[1]][pos[0]+1],
			field[pos[1]-1][pos[0]],
			field[pos[1]][pos[0]-1],
			field[pos[1]+1][pos[0]]
		};
	}

	static int move(boolean[] field) {
		int dir = -1;
		System.out.println("Mögliche Richtungen:");
		if (field[0])
			System.out.println(" 0: Rechts");
		if (field[1])
			System.out.println(" 1: Oben");
		if (field[2])
			System.out.println(" 2: Links");
		if (field[3])
			System.out.println(" 3: Unten");
		while (true) {
			System.out.print("Auswahl: ");
			try {
				dir = Integer.parseInt(System.console().readLine());
			} catch (NumberFormatException e) {
				System.out.println("*** ungültige Eingabe");
				continue;
			}
			if (dir < 0 || dir > 3) {
				System.out.println("*** ungültiger Zug");
				continue;
			}

			if (field[dir])
				return dir;
		}
	}

	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("*** keine Map angegeben");
			return;
		}

		boolean[][] map = Loader.load(args[0]);
		int[] dest = new int[] {map.length - 2, map[0].length - 2};
		int[] cur = new int[] {1, 1};
		int dir = 0;

		while (cur[0] != dest[0] || cur[1] != dest[1]) {
			print(map, cur, avatar(dir));
			dir = move(viewport(map, cur));
			switch (dir) {
			case 0:
				cur[0]++;
				break;
			case 1:
				cur[1]--;
				break;
			case 2:
				cur[0]--;
				break;
			case 3:
				cur[1]++;
				break;
			default:
				System.out.println("*** ungültige Orientierung: " + dir);
				System.exit(1);
			}
		}
		System.out.println("Ziel erreicht!");
	}
}
