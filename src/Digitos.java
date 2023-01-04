import java.util.Arrays;
import java.util.Scanner;

public class Digitos {
    	public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);

    int numero = scan.nextInt();
    int soma = 0;
    int produto =1;
    int resultado;

    String numeroEmString = String.valueOf(numero);

   String[] split = numeroEmString.split("");

   int[] ints = Arrays.stream(split).mapToInt(Integer::new).toArray();

        for(int i = 0; i < ints.length; i++){
            produto *= ints[i];
            soma += ints[i];
           
        }
        resultado= produto - soma;
        System.out.println(resultado);
    }
}
