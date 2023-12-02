package org.devajayantha;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;
@DisplayName("Calculator Test")
public class CalculatorInputTest {

    @ParameterizedTest
    @ValueSource(strings = {"Devajayantha", "Dewmini"})
    @DisplayName("Input Test")
    public void testWithInput(String input) {
        assertNotNull(input);
    }
}
