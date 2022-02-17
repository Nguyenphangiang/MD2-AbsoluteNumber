import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class testFindAbsolute0 {
    @Test
    void findAbsolute(){
        int number = 0;
        int expected = 0;

        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected,result);
    }
}class testFindAbsolute1 {
    @Test
    void findAbsolute(){
        int number = 1;
        int expected = 1;

        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected,result);
    }
}class testFindAbsoluteNegative1 {
    @Test
    void findAbsolute(){
        int number = -1;
        int expected = 1;

        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected,result);
    }
}