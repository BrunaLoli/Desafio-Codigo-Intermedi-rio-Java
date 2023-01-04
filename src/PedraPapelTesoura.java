import java.util.Scanner;  

public class PedraPapelTesoura {  
    public static void main(String[] args){  

        Scanner leitor = new Scanner(System.in);  

        int jogadaJogador = leitor.nextInt();  
        int jogadaInimigo = leitor.nextInt();

        int flecha = 1;
        int escudo = 2;
        int espada = 3;
      
       if (jogadaJogador == flecha && jogadaInimigo == flecha){
        System.out.println(("Empatou"));}
        else if (jogadaJogador == flecha && jogadaInimigo == escudo){
            System.out.println(("Perdeu"));}
        else if (jogadaJogador == flecha && jogadaInimigo == espada){
            System.out.println("Ganhou");}
        else if (jogadaJogador == escudo && jogadaInimigo == flecha){
            System.out.println("Ganhou");}
        else if (jogadaJogador == escudo && jogadaInimigo == escudo){
            System.out.println("Empatou");}
        else if (jogadaJogador == escudo && jogadaInimigo == espada){
            System.out.println("Perdeu");}
        else if (jogadaJogador == espada && jogadaInimigo == espada){
             System.out.println("Empatou");}
        else if (jogadaJogador == espada && jogadaInimigo == flecha){
            System.out.println("Perdeu");}
        else if(jogadaJogador == espada && jogadaInimigo == escudo){
            System.out.println("Ganhou");}
        }
  }

            
