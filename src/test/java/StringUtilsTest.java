import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import fr.diginamic.utils.StringUtils;

public class StringUtilsTest {
	@Test
	public void testLevenshteinDistance() {
		int result=StringUtils.levenshteinDistance("Chine", "Chien");
		assertEquals(2, result);
		int result2=StringUtils.levenshteinDistance("Vienne", "Sienne");
		assertEquals(1, result2);
	}
	
	@Test
	public void testLevenshteinDistanceAvecEspace() {
		int result=StringUtils.levenshteinDistance(null, "toto");
		assertEquals(0, result);
	}

	
}
