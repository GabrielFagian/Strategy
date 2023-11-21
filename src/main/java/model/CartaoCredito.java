package model;

import interfaces.Frete;

public class CartaoCredito implements Frete {

    public double calculoFrete(int distancia){
        return distancia * 2 + 5;
    }
}
