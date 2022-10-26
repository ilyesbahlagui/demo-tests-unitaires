package fr.diginamic.enumeration;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import fr.diginamic.enumerations.Saison;

public class SaisonTest {
//	public static void main(String[] args) {
////		System.out.println(Saison.valueOfLibelle(null));
//		if(Saison.valueOfLibelle(null)==null) {
//			System.out.println("il vaut null");
//		}
//		else {
//			System.out.println("non null");
//		}
//	}
//	
	
	@Test
	public void testValueOfLibelle() {
		Saison saison=Saison.valueOfLibelle("Hiver");
		
//		assertEquals("Hiver", saison.getLibelle());
		assertEquals(Saison.HIVER, saison);
	}
	
	
	@Test
	public void testValueOfLibelleAvecEspace() {
		Saison saison=Saison.valueOfLibelle(" Hiver ");
		
		assertEquals(Saison.HIVER, saison);
	}
	
	@Test
	public void testValueOfLibelleAvecNull() {
		Saison saison=Saison.valueOfLibelle(null);
		assertNull(saison);
		
//		assertEquals(0, saison);
	}
	
	
	
	
}
