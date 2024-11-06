import java.util.ArrayList;

/**
 * Esta classe demonstra vários tipos de loops em Java.
 * Inclui exemplos de loops com listas, arrays e números.
 */
public class loops {

    public static void main(String[] args) {

        // Criando um ArrayList e adicionando elementos a ele
        ArrayList<String> listaArray = new ArrayList<>();
        listaArray.add("João");
        listaArray.add("Maria");
        listaArray.add("José");
        listaArray.add("Pedro");
        listaArray.add("Ana");
        System.out.println("Conteúdo do ArrayList: " + listaArray);

        // Percorrendo o ArrayList usando um loop for
        System.out.println("\nPercorrendo o ArrayList usando um loop for:");
        for (int i = 0; i < listaArray.size(); i++) {
            System.out.println("Elemento " + i + ": " + listaArray.get(i));
        }
        
        // Percorrendo o ArrayList usando um loop while
        System.out.println("\nPercorrendo o ArrayList usando um loop while:");
        int J = 0;
        while (J < listaArray.size()) {
            System.out.println("Elemento " + J + ": " + listaArray.get(J));
            J++;
        }

        // Percorrendo o ArrayList usando um loop do-while
        System.out.println("\nPercorrendo o ArrayList usando um loop do-while:");
        int K = 0;
        do {
            System.out.println("Elemento " + K + ": " + listaArray.get(K));
            K++;
        } while (K < listaArray.size());

        // Criando um array de inteiros
        int[] vetor = {10, 20, 30, 40, 50};
        
        // Percorrendo o array usando um loop for
        System.out.println("\nPercorrendo o array de inteiros usando um loop for:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Elemento " + i + ": " + vetor[i]);
        }

        // Criando um array de strings
        String[] nomes = {"João", "Maria", "José"};
        
        // Percorrendo o array usando um loop for-each (enhanced for ou usando variavel de controle)
        System.out.println("\nPercorrendo o array de strings usando um loop for-each:");
        for (String nome : nomes) {
            System.out.println("Nome: " + nome);
        }

        // Percorrendo números usando um loop for
        System.out.println("\nPercorrendo números usando um loop for:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Número: " + i);
        }

        // Percorrendo números usando um loop while
        System.out.println("\nPercorrendo números usando um loop while:");
        int j = 0;
        while (j < 5) {
            System.out.println("Número: " + j);
            j++;
        }

        // Percorrendo números usando um loop do-while
        System.out.println("\nPercorrendo números usando um loop do-while:");
        int k = 0;
        do {
            System.out.println("Número: " + k);
            k++;
        } while (k < 5);
    }
}
