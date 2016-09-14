package br.com.empresa.testes;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

/**
 * 
 * Classe que une todos os testes para a palestra.
 * 
 * @author Allessandro
 */
public class TestJunit1 {

	/**
	 * Nesse teste nos escrevemos a expectativa e o objeto atual
	 */
	@Test
	public void testAdd() {
	  String str = "Junit is working fine";
	  Assert.assertEquals("", "a");
	  //assertEquals("Junit is working fine",str);
	}
	String message = "Robert";	
	   
	   @Test
	   public void testPrintMessage() {	
	      System.out.println("Inside testPrintMessage()");    
	      assertEquals(message,"Robert");     
	   }

}
