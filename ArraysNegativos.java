import java.util.Scanner; // Importa a classe Scanner para leitura de dados

public class ArraysNegativos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário

        // Lê o tamanho do vetor (quantidade de números a serem inseridos)
        int n = sc.nextInt();
        int vet[] = new int[n]; // Declara um vetor de inteiros com o tamanho especificado pelo usuário

        // Loop para ler os números e armazená-los no vetor
        for (int i = 0; i < n; i++) {
            vet[i] = sc.nextInt(); // Armazena cada número no vetor
        }

        // Loop para verificar e imprimir os números negativos
        for (int i = 0; i < n; i++) {
            if (vet[i] < 0) { // Verifica se o número é negativo
                System.out.println(vet[i]); // Imprime o número negativo
            }
        }

        sc.close(); // Fecha o scanner para liberar os recursos
    }
}