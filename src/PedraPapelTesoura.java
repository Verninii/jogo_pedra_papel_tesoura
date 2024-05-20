import java.util.Random;
import java.util.Scanner;

public class PedraPapelTesoura {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Random sorteio = new Random();

        System.out.println("Faça sua escolha:\n(1)pedra\n(2)papel\n(3)tesoura?");


        try {
            System.out.print("Qual a sua escolha? ");
            int player1 = leitor.nextInt();
            int computador = sorteio.nextInt(3) + 1;
            System.out.print("Escolha do computador: ");
            System.out.println(computador);

            System.out.println("");

            System.out.println("Escolha do Jogador: " + definirNomeEscolha(player1));
            System.out.println("Escolha do Computador " + definirNomeEscolha(computador));

            System.out.println("");

            determinarVencedor(player1,computador);
        } catch (Exception erro) {
            System.out.println("A sua escolha deve ser um NÚMERO entre 1 e 3");
        }




    }

    private static String definirNomeEscolha(int opcao){
        String escolhaString;

        if (opcao == 1) {
            escolhaString = "Pedra";
        } else if (opcao == 2) {
            escolhaString = "Papel";
        } else {
            escolhaString = "Tesoura";
        }

        return escolhaString;
    }


    private static void determinarVencedor(int player1, int computador){

        if (player1 == 1){
            if (computador == 1){
                System.out.println("O jogo empatou !!");
            } else if (computador == 2) {
                System.out.println("O computador venceu!!");
            } else {
                System.out.println("Você venceu!!");
            }
        } else if (player1 == 2) {
            if (computador == 2){
                System.out.println("O jogo empatou !!");
            } else if (computador == 3) {
                System.out.println("O computador venceu!!");
            } else {
                System.out.println("Você venceu!!");
            }
        } else if (player1 == 3) {
            if (computador == 3){
                System.out.println("O jogo empatou !!");
            } else if (computador == 1) {
                System.out.println("O computador venceu!!");
            } else {
                System.out.println("Você venceu!!");
            }
        }
    }
}
