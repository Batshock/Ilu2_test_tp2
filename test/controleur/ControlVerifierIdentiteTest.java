package controleur;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import personnages.Chef;
import villagegaulois.Village;

class ControlVerifierIdentiteTest {
	private Village village;
	
	@BeforeEach
	public void initialiserSituation() {
		System.out.println("Initialisation...");
		Village village = new Village("Le village des Irréductibles",10,5);
		Chef chef = new Chef("Abracourcix", 5, village);
		village.setChef(chef);
	}
	
	
	@Test
	void testControlVerifierIdentite() {
		ControlVerifierIdentite ctrlVerifierIdentite = new ControlVerifierIdentite(village);
		assertNotNull(ctrlVerifierIdentite, "Constructeur ne renvoie pas null");
	}

	@Test
	void testVerifierIdentite() {
		ControlVerifierIdentite ctrlVerifierIdentite = new ControlVerifierIdentite(village);
		//TODO
		
	}

}
