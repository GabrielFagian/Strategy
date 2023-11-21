package model;

import interfaces.Frete;

public class GiftCard implements Frete {

    public double calculoFrete(int distancia){
        return distancia * 2 + 10;
    }
}
