import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NumeroFeliz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
       
        String[] string_n = String.valueOf(n).split("");

        int resultado_parcial = 0;
        int posicao_atual = 0;

        String resultado_parcial_string = new String();

        do{
    
            for (int contadorderepeticoes = 0;; contadorderepeticoes < string_n.length; ){

                //Pego o numero atual
                String numeroAtual = string_n[contadorderepeticoes];

                //Converto para int para fazer a conta
                posicao_atual = Integer.parseInt(String.valueOf(numeroAtual));

                //Faço a conta
                resultado_parcial = (posicao_atual * posicao_atual) + resultado_parcial;

                //Converto para string
                resultado_parcial_string = String.valueOf(resultado_parcial);
                
                contadorderepeticoes++;
            }

            if (resultado_parcial == 1){
                System.out.println("Numero feliz");
                break;
            } else if (resultado_parcial_string.length() == 1){
                System.out.println(false);
                break;
            }
            string_n = String.valueOf(resultado_parcial_string).split("");
            resultado_parcial = 0;

        }while(true);

    }}
        
 
