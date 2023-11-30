package io.github.otavio.labseq.service;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

@QuarkusTest
class CalculationServiceTest {

    @Inject
    private CalculationService service;

    @Test
    void calculateLOK() throws Exception {
        var result = service.calcularL(new BigInteger("10"));
        assertEquals(new BigInteger("3"), result);
    }

    @Test
    void calculateLNumberFormatNotOK() throws Exception {
        assertThrows(NumberFormatException.class,
                ()-> service.calcularL(new BigInteger("a")));
    }
}