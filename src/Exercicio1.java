public class Exercicio1 {

    public static void main(String[] args) {
        int vetorNumeros[] = new int [5];
        int i, soma = 0;
        
        vetorNumeros[0] = 4;
        vetorNumeros[1] = 2;
        vetorNumeros[2] = 2;
        vetorNumeros[3] = 10;
        vetorNumeros[4] = 2;

        for (i = 0; i< vetorNumeros.length; i++){

            soma = soma + vetorNumeros[i];
        }

        System.out.println("O valor da soma foi: "+soma);
    }
    
}
