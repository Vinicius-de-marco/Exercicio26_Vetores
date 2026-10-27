
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        int qtde = 20;
        int vetor[] = new int[qtde];
        Scanner leitor = new Scanner(System.in);

        //entrada
        for (int i = 0; i < qtde; i++) {
            System.out.println("Digite o valor(" + i + "):");
            vetor[i] = Integer.parseInt(leitor.nextLine());
        }
        //processamento
        for (int i = 0; i < qtde - 1; i++) {
            for (int j = i + 1; j < qtde; j++) {
                if (vetor[i] > vetor[j]) {
                    int aux = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = aux;

                }
            }

        }

        //saída
        for (int i = 0; i < qtde; i++) {
            System.out.println("Vetor(" + i + "):" + vetor[i]);
        }
    }
}
