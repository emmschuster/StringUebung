
public class StringUebungMain {

	public static void main(String[] args) {
		com("Meier", "Mayer");
		printletter("Schuster");
		String x=String.join("--", "Hallo", "Du", "Mensch");
		System.out.println(x);
		printletter1("Kastner");
	}

	private static void printletter1(String x) {
		StringBuilder sbx=new StringBuilder("Sehr geehrte(r) Herr/Frau "+x+", wir gratulieren zur Lösung der Aufgabe!!!");
		System.out.println(sbx);
	}

	private static void printletter(String s) {
		StringBuffer sb = new StringBuffer(
				"Sehr geehrte(r) Herr/Frau " + s + " wir gratulieren zur Lösung der Aufgabe!!!");
		System.out.println(sb);
		// ok was is jetzt wirklich so cool an einem string buffer??
	}

	private static void com(String n12, String n22) {

		System.out.println("Du vergleichst " + n12 + " mit " + n22);
		System.out.println(n12.compareTo(n22) );
		System.out.println("Klein geschrieben die namen: " + n12.toLowerCase() + " und " + n22.toLowerCase()); 
	}

}
