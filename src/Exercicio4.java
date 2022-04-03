import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Quantas lista de compra que inserir?");
        int qtdNomes = leitor.nextInt();
        
        String[] listaNomes = new String[qtdNomes];
        
        for (int i = 0; i < listaNomes.length; i++) {
        System.out.println("Digite a lista de compra da posição "+i);
        listaNomes[i] = leitor.next();
        }
        
        System.out.println("------------------------------------------------");
        System.out.println(" --------------LISTA DE COMPRAS--------------- ");
        
        System.out.println("------------------------------------------------");
        
        for (int i = 0; i < listaNomes.length; i++) {
        System.out.println("A lista de compra da posição "+i+" é: "+listaNomes[i]);

        }
}
}