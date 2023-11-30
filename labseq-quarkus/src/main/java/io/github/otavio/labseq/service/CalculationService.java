package io.github.otavio.labseq.service;

import io.quarkus.cache.CacheResult;
import jakarta.enterprise.context.ApplicationScoped;
import java.math.BigInteger;

@ApplicationScoped
public class CalculationService {

    @CacheResult(cacheName = "math-labseq-cache")
    public BigInteger calcularL(BigInteger n) throws Exception {
        if (n.equals(BigInteger.ZERO) || n.equals(BigInteger.TWO)) {
            return BigInteger.ZERO;
        } else if (n.equals(BigInteger.ONE) || n.equals(new BigInteger("3"))) {
            return BigInteger.ONE;
        } else {
            return calcularL(n.subtract(new BigInteger("4")))
                    .add(calcularL(n.subtract(new BigInteger("3"))));
        }
    }
}
