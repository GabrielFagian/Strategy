package model;

import interfaces.Frete;

public class Debito implements Frete {

    public double calculoFrete(int distancia){
        return distancia * 1.5 + 10;
    }
}
