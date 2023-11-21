import enums.ProductEnum;
import interfaces.Frete;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Application {

    public static void main(String[] args) {

        long start = System.nanoTime();

        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("Qual método de pagamento deseja? \n Digite '1' para Pix;" +
                    " \n Digite '2' para Cartão de Credito; \n Digite '3' para Débito; \n Digite '4' para GiftCard;");
            int produtoSelecionado = scanner.nextInt();

            System.out.println("Qual a distancia em KM?");
            int distancia = scanner.nextInt();

            ProductEnum productEnum = ProductEnum.values()[produtoSelecionado - 1];

            Frete frete = productEnum.obterFrete();
            double preco = frete.calculoFrete(distancia);
            System.out.println("O valor do frete ficou: R$"+preco);
        }


        long elapsedTime = System.nanoTime() - start;

        double seconds = TimeUnit.SECONDS.convert(elapsedTime, TimeUnit.NANOSECONDS);
        double secondDecimalPrecision = (double)elapsedTime / 1000000000.0;
        double ms = TimeUnit.MILLISECONDS.convert(elapsedTime, TimeUnit.NANOSECONDS);
        double minutes = TimeUnit.MINUTES.convert(elapsedTime, TimeUnit.NANOSECONDS);

        System.out.printf("Nanoseconds: %d ms\n", elapsedTime );
        System.out.printf("Miliseconds: %f ms\n", ms );
        System.out.printf("Seconds: %f ms\n", seconds);
        System.out.printf("Seconds2: %f ms\n", secondDecimalPrecision);
        System.out.printf("MInutes: %f ms\n", minutes);
    }
}
