import core.calc;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestCalc {

    @Test
    public void testPlus(){
        int res = calc.plus(10,11);
        assertEquals(res,21);
    }

    @Test
    public void testMinus(){
        int res = calc.minus(10,11);
        assertEquals(res,-1);
    }

    @Test
    public void testDiv(){
        int res = calc.div(10,2);
        assertEquals(res,5);
    }

    @Test
    public void testMult(){
        int res = calc.mul(50,2);
        assertEquals(res,100);
    }

}
