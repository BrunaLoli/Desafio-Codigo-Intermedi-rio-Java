import java.util.Scanner;

public class QuantidadeNecessaria {

    public static void main(String[] args) {

        final int SLICE = 4;
        
        Scanner scanner = new Scanner(System.in);         
        double T = scanner.nextInt();

        for(int contagem = 0; contagem < T; contagem++){

            double amigos = scanner.nextInt();
            double fatias = scanner.nextInt();
            
            double resultadoPizzas = (fatias * amigos) / SLICE;
            resultadoPizzas = Math.ceil(resultadoPizzas);

            System.out.println((int)resultadoPizzas);
        
        }

    }
}
