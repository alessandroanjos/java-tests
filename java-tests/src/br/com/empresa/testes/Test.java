package br.com.empresa.testes;


import junit.framework.*;

public class Test extends TestCase {
	protected int value1, value2;
	protected void setUp(){
		value1 = 3;
		value2 = 3;
	}
	
	@org.junit.Test
	public void testAdd(){
		double result = value1 + value2;
		assertTrue(result == 6);
	}

	public static void main(String[] args) {
		System.out.println("Teste");
	}
}
