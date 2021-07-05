package by.it.nikitko.calc;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParserTestParam {

    private final String expression;
    private final String expectedResult;
    private Parser parser;

    public ParserTestParam(String expression, String expectedResult) {
        this.expression = expression;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection<Object> data() {
        Object[][] data = new Object[][]{
                {"A=2+5.3", "7.3"},
                {"B=A*3.5", "25.55"},
                {"C=B+(A*2)", "40.15"},
                {"D=((C-0.15)-20)/(7-5)", "10.0"},
                {"E={2,3}*(D/2)", "{10.0, 15.0}"},
                {"{{1,2},{8,3}}-2", "{{-1.0, 0.0}, {6.0, 1.0}}"},
                {"{{1,2},{8,3}} * {{1,2},{8,3}}", "{{17.0, 8.0}, {32.0, 25.0}}"},
                {"{{1,2},{8,3}}+{{1,2},{8,3}}", "{{2.0, 4.0}, {16.0, 6.0}}"}
        };
        return Arrays.asList(data);
    }

    @Before
    public void setUp() {
        parser = new Parser();
    }

    @Test
    public void test() throws CalcException {
        Var actualVar = parser.calc(expression);
        String actual = actualVar.toString();
        assertEquals(expectedResult, actual);
    }
}



