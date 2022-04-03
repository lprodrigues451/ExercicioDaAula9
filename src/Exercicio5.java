import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        String[] vetorMusica = new String [3];
        int i;
        String Banda, Musica;
        Scanner leitor = new Scanner(System.in);


        System.out.println("nome banda");
        Banda = leitor.next();

        for (i = 0; i< vetorMusica.length; i++){
            
            
            System.out.println("Digite a "+i+" musica da banda "+Banda);
            vetorMusica[i] = leitor.next();

        }

        System.out.println("--------------------------------------------------");
        System.out.println("------------3 Musica da "+Banda+"---------------");
        System.out.println("--------------------------------------------------");

        System.out.println(Banda+"\n");

        for (i= 0; i< vetorMusica.length; i++){

            System.out.println(vetorMusica[i]);

             
        }

                       
       }
        
    
    }



