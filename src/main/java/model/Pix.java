package model;

import interfaces.Frete;
import org.openjdk.jmh.annotations.Benchmark;

public class Pix implements Frete {

//    @Benchmark
    public double calculoFrete(int distancia){
        return distancia * 1.5 + 5;
    }
}
