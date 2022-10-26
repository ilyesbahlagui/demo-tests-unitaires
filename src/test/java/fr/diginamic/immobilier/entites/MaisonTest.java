package fr.diginamic.immobilier.entites;
import static org.junit.Assert.assertEquals;


import org.junit.Test;

import fr.diginamic.immobilier.entites.Chambre;
import fr.diginamic.immobilier.entites.Cuisine;
import fr.diginamic.immobilier.entites.Maison;

public class MaisonTest {


	// Test la methode Ajout Piece
	@Test
	public void testAjoutPiece() {
		Maison maison = new Maison();
		int longueur1 = maison.getPieces().length;
		assertEquals(0, longueur1);
		maison.ajouterPiece(new Cuisine(0, 15));
		int longueur2 = maison.getPieces().length;
		assertEquals(1, longueur2);

	}

	@Test
	public void testAjoutPieceAvecNull() {

		Maison maison = new Maison();
		int longueur1 = maison.getPieces().length;
		assertEquals(0, longueur1);

		maison.ajouterPiece(null);
		int longueur2 = maison.getPieces().length;
		assertEquals(0, longueur2);

	}

	// Test Superficie Etage

	@Test
	public void testSuperficieEtage() {
		Maison maison = new Maison();
		maison.ajouterPiece(new Cuisine(0, 150));
		maison.ajouterPiece(new Chambre(0, 150));
		double superficie = maison.superficieEtage(0);

		assertEquals(300, superficie, 0.0001);

	}

	// Test Superficie type de piece
	@Test
	public void testSuperficieTypePiece() {
		Maison maison = new Maison();

		maison.ajouterPiece(new Cuisine(0, 150));
		maison.ajouterPiece(new Cuisine(0, 150));
		double superficie = maison.superficieTypePiece("Cuisine");
		assertEquals(300, superficie, 0.0001);
	}

	@Test
	public void testSuperficieTypePieceAvecEspace() {
		Maison maison = new Maison();

		maison.ajouterPiece(new Cuisine(0, 150));
		maison.ajouterPiece(new Cuisine(0, 150));
		double superficie = maison.superficieTypePiece("Cuisine  ");
		assertEquals(300, superficie, 0.0001);
	}

	@Test
	public void testSuperficieTypePieceAvecNull() {
		Maison maison = new Maison();

		maison.ajouterPiece(new Cuisine(0, 150));
		maison.ajouterPiece(new Cuisine(0, 150));
		double superficie = maison.superficieTypePiece(null);
		assertEquals(0, superficie, 0.0001);
	}
	
	// Calcule toute la surface de la maison
	
	@Test
	public void testCalculeSurface() {
		Maison maison = new Maison();

		maison.ajouterPiece(new Cuisine(0, 150));
		maison.ajouterPiece(new Cuisine(0, 150));
		
		double result=maison.calculerSurface();
		assertEquals(300, result, 0.0001);
	}

}
