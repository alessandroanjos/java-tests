package br.com.empresa.testes;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

	public static void main(String[] args) {
	      Result result = JUnitCore.runClasses(TestJunit.class);
			System.out.println("teste");
			
			if(!result.wasSuccessful()){
				for (Failure failure:result.getFailures()) {
			    	  String fail = failure.getMessage();
			    	  String execessao = failure.getException().toString();
			    	  String descricao = failure.getDescription().toString();
			    	 //System.out.println(failure.toString());
			         System.out.println("Falha = "+  fail +  " Excessao = "+execessao + " Descricao = "+ descricao);
			      }
	    	}
	     System.out.println(result.wasSuccessful());
	   }
}
