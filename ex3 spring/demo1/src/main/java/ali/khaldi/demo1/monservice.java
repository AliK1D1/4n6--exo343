package ali.khaldi.demo1;

import org.springframework.stereotype.Service;

import java.math.BigInteger;
@Service
public class monservice {

    public BigInteger Fibonacci(int n){
        if (n == 0) return BigInteger.ZERO;
        if (n == 1) return BigInteger.ONE;

        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;
        BigInteger result = BigInteger.ZERO;

        for (int i = 2; i <= n; i++) {
            result = a.add(b);
            a = b;
            b = result;
        }

        return result;
    }
}
