import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        int vetorNumeros[] = new int [10];
        int i;
        Scanner leitor = new Scanner(System.in);

        for (i = 0; i< vetorNumeros.length; i++){
            
            
            System.out.println("Digite o "+i+" número ");
            vetorNumeros[i] = leitor.nextInt();

        }

        System.out.println("--------------------------------------------------");
        System.out.println("------------Números Pares---------------");
        System.out.println("--------------------------------------------------");

        for (i= 0; i<= vetorNumeros.length; i++){

             if (vetorNumeros[i] % 2 == 0){
                
                System.out.println("O número "+vetorNumeros[i]+" é par  ");
            
        }else if (vetorNumeros[i] % 2 != 0){

            System.out.println("Impar");

         }
        }

                       
       }
        
    
    }



