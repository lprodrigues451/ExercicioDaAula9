import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        int i;
        String []vetorNumeros = new String [10];


        for (i = 0; i< vetorNumeros.length; i++){

            System.out.println("Digite o nome do Aluno da posição "+i+": ");
            vetorNumeros[i] = leitor.nextLine();


        }

        System.out.println("--------------------------------------------------");
        System.out.println("------------LISTA COMPLETA DO ALUNO---------------");
        System.out.println("--------------------------------------------------");

        for (i= 0; i<= vetorNumeros.length; i++){

            int NuAluno= i + 1 ;
            System.out.println("Aluno da posição "+NuAluno+" é = "+vetorNumeros[i]);

        }
      

    }
    
}
