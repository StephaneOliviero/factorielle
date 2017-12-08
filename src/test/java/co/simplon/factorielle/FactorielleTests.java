package co.simplon.factorielle;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class FactorielleTests {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCalculerFactorielle() {
	
		//GIVEN
		long entier = 1;
		Factorielle factorielle = new Factorielle(); 
		
		//When
		long retour=factorielle.calculer(entier);
		
		//Then
		
		assertEquals(1,retour);
		
		
	}
	
	//Initialisation Test
	@Test
	public void testCalculerFactoriellef() {
	
		//GIVEN
		long entier = 1;
		Factorielle f = new Factorielle(); 
		
		//When
		long retour=f.calculer(entier);
		
		//Then
		
	//	assertEquals(expected, actual, delta);
	//	assertEquals(message, expected, actual);
	//	assertTrue(expected, actual, delta);
		
	}
	
	
	@Test
	public void testCalculerFactorielle0() {
	
		//GIVEN
		long entier = 0;
		Factorielle factorielle = new Factorielle(); 
		
		//When
		long retour=factorielle.calculer(entier);
		
		//Then
		
		assertEquals(1,retour);
		
	}
	
	
	
	@Test
	@Ignore
	public void testCalculerFactorielle10() {
		
		//GIVEN
		long entier = 10;
		Factorielle factorielle = new Factorielle(); 
		
		//When
		long retour=factorielle.calculer(entier);
		
		//Then
		
		assertEquals(3628800,retour);
		
	}

	@Test
	public void testCalculerFactorielle19() {
		
		//GIVEN
		long entier = 19;
		Factorielle factorielle = new Factorielle(); 
		
		//When
		long retour=factorielle.calculer(entier);
		
		//Then
		
		assertEquals(121645100408832000l,retour);
		
	}

}
