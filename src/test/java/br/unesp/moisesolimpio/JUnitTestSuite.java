package br.unesp.moisesolimpio;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@Suite 
@SuiteDisplayName("Suite de teste")
@SelectClasses({VectorEqualTest.class, VectorSizeTest.class})
public class JUnitTestSuite {
    
}
