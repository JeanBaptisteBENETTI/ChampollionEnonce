package champollion;

import org.junit.jupiter.api.*;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class ChampollionJUnitTest {
	Enseignant untel;
	UE uml, java;
		
	@BeforeEach
	public void setUp() {
		untel = new Enseignant("untel", "untel@gmail.com");
		uml = new UE("UML");
		java = new UE("Programmation en java");		
	}
	

	@Test
	public void testNouvelEnseignantSansService() {
		assertEquals(0, untel.heuresPrevues(),
                        "Un nouvel enseignant doit avoir 0 heures prévues");
	}

	/*@Test
	public void testNouvelEnseignantSansUE() {
		assertTrue(untel.heuresPrevues().isEmpty());
	}*/

	@Test
	public void testAjouteHeures() {
                // 10h TD pour UML
		untel.ajouteEnseignement(uml, 0, 10, 0);

		assertEquals(10, untel.heuresPrevuesPourUE(uml),
                        "L'enseignant doit maintenant avoir 10 heures prévues pour l'UE 'uml'");

                // 20h TD pour UML
                untel.ajouteEnseignement(uml, 0, 20, 0);
                
		assertEquals(10 + 20, untel.heuresPrevuesPourUE(uml),
                         "L'enseignant doit maintenant avoir 30 heures prévues pour l'UE 'uml'");		
		
	}

	@Test
	public void testAPlanifier() {
		untel.ajouteEnseignement(uml, 0, 10, 0);
		Date date = new Date("13/12/2022");
		Intervention inter = new Intervention(date, 1, false, 10);
		//untel.ajouteIntervention(inter);
		assertEquals(0, untel.resteAPlanifier(uml, TypeIntervention.CM), "Erreur, il n'y a pas assez d'heure planifiées");
	}
	
}
