import java.util.Scanner;

public class Exercicio1Copy {

    public static void main(String[] args) {
        int vetorNumeros[] = new int [5];
        int i, soma = 0;
        Scanner leitor = new Scanner(System.in);

        for (i = 0; i< vetorNumeros.length; i++){

            System.out.println("Digite o valor da posição "+i+": ");
            vetorNumeros[i] = leitor.nextInt();

            soma = soma + vetorNumeros[i];

        }

        System.out.println("O valor da soma foi: "+soma);
    
    }
    
}
