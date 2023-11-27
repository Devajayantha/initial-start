package org.devajayantha;

import org.devajayantha.test.Calculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Calculator Test")
public class CalculatorTest {
    private Calculator calculator =  new Calculator();

    @DisplayName("Addition Test")
    @Test
    public void testAddSuccess(){
        var result = this.calculator.add(3, 2);

        assertEquals(5, result);
    }

    @DisplayName("Division Test")
    @Test
    public void testDivideFailed(){
        assertThrows(IllegalArgumentException.class, () -> {
            this.calculator.divide(3, 0);
        });
    }

    @Disabled
    @Test
    public void testDisable()
    {
        System.out.println("This test is disabled");
    }
}
