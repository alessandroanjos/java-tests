package br.com.empresa.testes;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

//JUnit Suite Test
@RunWith(Suite.class)

@SuiteClasses({ 
 TestJunit.class ,TestJunit1.class
})
public class JunitTestSuite {

}
