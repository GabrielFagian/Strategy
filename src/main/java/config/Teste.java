package config;

import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;

public class Teste {

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @Fork(value = 1)
    @Warmup(iterations = 1)
    @Measurement(iterations = 1)

    public void init() {

        fib(50);
        //fibbonaci(300);
    }

    static int fib(int n) {
        if (n<2) return 1;
        else return fib(n-1) + fib(n-2);
    }

    double fibbonaci(int n){
        double prev=0d, next=1d, result=0d;
        for (int i = 0; i < n; i++) {
            result=prev+next;
            prev=next;
            next=result;
        }
        return result;
    }
}
