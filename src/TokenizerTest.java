import org.junit.Test;

import java.util.ArrayList;

public class TokenizerTest {

	@Test
	public void testTokenizer() throws Exception {
		Tokenizer testToken = new Tokenizer("/Users/daniel.l/Code/git/233-4/233-4/src/First_Chapter_of_1984.txt");
		ArrayList<String> temp = testToken.wordList();
		// test by using debug. 
		System.out.println("hello world");
	}
	
}
