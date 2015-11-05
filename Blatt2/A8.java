public class A8 {
	public static void main(String args[]) {
		double w = 0;
		while (w <= 0) {
			System.out.print("Breite des Hauses eingeben (> 0): ");
			w = Integer.parseInt(System.console().readLine());
		}

		for (double i = 0; i < w; i++) {
			for (double j = 0; j < w; j++) {
				if (inHaus(j, i, w))
					System.out.print("#");
				else
					System.out.print(" ");
				System.out.print(" ");
			}
			System.out.println("");
		}
	}

	public static boolean inHaus(double px, double py, double w) {
		double olx = 0, oly = w / 2, urx = w, ury = w;
		double rcx = w / 2, rcy = w / 2, b = w / 2;
		double cx = w / 2, cy = w / 4, r = w / 8;
		double tolx = w / 8, toly = 5 * w / 8, turx = 3 * w / 8, tury = w;

		return (inRaute(px, py, rcx, rcy, b) || inRechteck(px, py, olx, oly, urx, ury)) && !inKreis(px, py, cx, cy, r) && !inRechteck(px, py, tolx, toly, turx, tury);
	}

	public static boolean inKreis(double px, double py, double cx, double cy, double r) {
		return Math.sqrt(Math.pow(px - cx, 2) + Math.pow(py - cy, 2)) <= r;
	}

	public static boolean inRaute(double px, double py, double cx, double cy, double b) {
		return Math.abs(px - cx) + Math.abs(py - cy) <= b;
	}

	public static boolean inRechteck(double px, double py, double olx, double oly, double urx, double ury) {
		return px >= olx && px <= urx && py >= oly && py <= ury;
	}
}
