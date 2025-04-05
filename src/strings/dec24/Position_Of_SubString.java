//24 December 2024

package strings.dec24;

public class Position_Of_SubString {
	public static void main(String[] args) {
		String str = "takeyouforward";
		String sub = "forward";

		for (int i = 0; i < str.length() - sub.length() + 1; i++) {
			if (str.charAt(i) == sub.charAt(0)) {
				if (str.substring(i, sub.length() + i).equals(sub)) {
					System.out.println(i);
				}
			}

		}

	}
}