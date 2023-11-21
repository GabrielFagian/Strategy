package enums;

import interfaces.Frete;
import model.CartaoCredito;
import model.Debito;
import model.GiftCard;
import model.Pix;

public enum ProductEnum {


    PIX{
        @Override
        public Frete obterFrete(){
            return new Pix();
        }
    },

    CARTAOCREDITO{
        @Override
        public Frete obterFrete(){
            return new CartaoCredito();
        }
    },


    DEBITO{
        @Override
        public Frete obterFrete(){
            return new Debito();
        }
    },


    GIFTCARD{
        @Override
        public Frete obterFrete(){
            return new GiftCard();
        }
    };

    public abstract Frete obterFrete();
}
