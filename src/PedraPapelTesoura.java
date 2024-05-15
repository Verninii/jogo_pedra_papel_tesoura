import java.util.Random;
import java.util.Scanner;

public class PedraPapelTesoura {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Random sorteio = new Random();

        System.out.println("Faça sua escolha:\n(1)pedra\n(2)papel\n(3)tesoura?");
        int player1 = leitor.nextInt();

        int computador = sorteio.nextInt(3) + 1;
        System.out.println(computador);

        if (player1 == 1 && computador == 2){
            System.out.println("Você escolheu pedra e a máquina papel...\nlogo você perdeu");
        } else if (player1 == 1 && computador == 3) {
            System.out.println("Você escolheu pedra e a máquina tesoura...\nlogo você ganhou");
        } else if (player1 == 2 && computador == 1) {
            System.out.println("Você escolheu papel e a máquina pedra...\nlogo você ganhou");
        } else if (player1 == 3 && computador == 2) {
            System.out.println("Você escolheu tesoura e a máquina papel...\nlogo você ganhou");
        } else if (player1 == 3 && computador == 1) {
            System.out.println("Você escolheu tesoura e a máquina pedra...\nlogo você perdeu");
        } else if (player1 == 2 && computador == 3) {
            System.out.println("Você escolheu papel e a máquina tesoura...\nlogo você perdeu");
        } else if (player1 == computador){
            System.out.println("Vocês empataram, jogue novamente");
        }
        else {
            System.out.println("Você escolheu um valor não inspecionado");
        }


    }
}
