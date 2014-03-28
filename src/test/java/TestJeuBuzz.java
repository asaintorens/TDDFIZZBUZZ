import static org.junit.Assert.fail;
import junit.framework.Assert;

import org.junit.BeforeClass;
import org.junit.Test;


public class TestJeuBuzz {

	

	@Test
	public void testBuzz() {
		Jeu leJeu = new Jeu();
		String mot =leJeu.Parler(3);
		Assert.assertEquals("BUZZ", mot);
	}
	
	@Test
	public void testFIZZ() {
		Jeu leJeu = new Jeu();
		String mot =leJeu.Parler(5);
		Assert.assertEquals("FIZZ", mot);
	}

	@Test
	public void testBuzzFizz() {
		Jeu leJeu = new Jeu();
		String mot =leJeu.Parler(15);
		Assert.assertEquals("BUZZFIZZ", mot);
	}
	@Test
	public void testNOMBRE() {
		Jeu leJeu = new Jeu();
		String mot =leJeu.Parler(2);
		Assert.assertEquals("2", mot);
	}
	
	@Test
	public void test100premier() {
		Jeu leJeu = new Jeu();
		String[] centaine;
		centaine = leJeu.retourner100Premier();
		Assert.assertEquals(100, centaine.length);
	}
	
	@Test
	public void testFAIL() {
		fail("TAMERE LE FAIL BARBEZ");
	}
}
