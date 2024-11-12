import java.io.*;
import java.sql.SQLOutput;

public class TestCommentBlock {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader in= new BufferedReader(new FileReader("/Users/dominik/Documents/Schule/5. Klasse/FSST/StateMachine/StateMachine/src/CommentXTest.java"));
		String mitComment="";
		String line;
		String ohneComment;
		
		while((line= in.readLine()) !=null)
			mitComment+= line + '\n';
		
		in.close();
		

		System.out.println(mitComment);
		
		System.out.println("------------------------------------");
		
		ohneComment= commentBlock(mitComment);
		
		System.out.println(ohneComment);

		System.out.println("Test");
	}


	public static String commentBlock(String s) {
		StringBuilder result = new StringBuilder();
		boolean inComment = false;
		int length = s.length();

		for (int i = 0; i < length; i++) {
			if (inComment) {
				// Prüfen, ob das Ende des Blockkommentars erreicht wurde
				if (i + 1 < length && s.charAt(i) == '*' && s.charAt(i + 1) == '/') {
					inComment = false;
					i++; // Das Ende des Kommentars überspringen
				}
			} else {
				// Prüfen, ob der Beginn eines Blockkommentars erreicht wurde
				if (i + 1 < length && s.charAt(i) == '/' && s.charAt(i + 1) == '*') {
					inComment = true;
					i++; // Den Anfang des Kommentars überspringen
				} else {
					// Kein Kommentar, Zeichen in die Ausgabe schreiben
					result.append(s.charAt(i));
				}
			}
		}

		return result.toString();
	}


}
