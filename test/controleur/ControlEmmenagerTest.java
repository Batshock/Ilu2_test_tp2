package controleur;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import personnages.Chef;
import villagegaulois.Village;

class ControlEmmenagerTest {
	private Village village;
	private Chef chef;
	
	@BeforeEach
	public void initialiserSituation() {
		System.out.println("Initialisation...");
		Village village = new Village("Le village des Irréductibles",10,5);
		Chef Abracourcix = new Chef("Abracourcix", 5, village);
		village.setChef(Abracourcix);
	}
	
	@Test
	void testControlEmmenager() {
		ControlEmmenager ctrlEmmenager = new ControlEmmenager(village);
		assertNotNull(ctrlEmmenager, "Constructeur ne renvoie pas null");
	}
	
	@Test
	void testIsHabitant() {
		ControlEmmenager ctrlEmmenager = new ControlEmmenager(village);
		ctrlEmmenager.ajouterGaulois("Bonemine", 10);
		assertTrue(ctrlEmmenager.isHabitant("Bonemine"));
		assertFalse(ctrlEmmenager.isHabitant("Existe pas"));
		ctrlEmmenager.ajouterDruide("Panoramix", 10, 1, 5);
		assertTrue(ctrlEmmenager.isHabitant("Panoramix"));
	}
	
	@Test
	void testAjouterDruide() {
		ControlEmmenager ctrlEmmenager = new ControlEmmenager(village);
		ctrlEmmenager.ajouterDruide("Panoramix", 10, 1, 5);
	}
}
