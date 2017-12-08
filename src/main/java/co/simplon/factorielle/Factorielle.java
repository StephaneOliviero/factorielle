package co.simplon.factorielle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Factorielle
 */
	

public class Factorielle 
{
	
    public Factorielle() {
    		super();
    }
    
    public long calculer(long n) { 
    	    System.out.println("n = " + n);
    		if (n > 1) {
    			return n * calculer(n-1);
    		} else if (n < 0) { 
    			  throw new IllegalArgumentException();
    		}
    		return 1;
    }


    public static void main(String[] args) {
    	
    	Logger logger = LoggerFactory.getLogger(Factorielle.class);
        logger.info("Factorielle");
    	
    	long entier = 50;
		Factorielle factorielle = new Factorielle(); 
		
		long retour=factorielle.calculer(entier);
    	
    }

}

