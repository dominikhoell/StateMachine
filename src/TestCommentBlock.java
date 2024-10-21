import java.io.*;

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
		
			
	}


	public static String commentBlock(String s){
		String ret="";	

		
		return ret;
	}

}
