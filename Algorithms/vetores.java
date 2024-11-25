public class vetores {
    public static void main(String[] args) {
        // Declaração de um vetor de inteiros com 5 elementos
        int[] vetor = new int[5];
        vetor[0] = 10;
        vetor[1] = 20;
        vetor[2] = 30;
        vetor[3] = 40;
        vetor[4] = 50;
        // Imprime os valores do vetor
        System.out.println("Valores do vetor:");
        System.out.println("vetor[0]: " + vetor[0]);
        System.out.println("vetor[1]: " + vetor[1]);
        System.out.println("vetor[2]: " + vetor[2]);
        System.out.println("vetor[3]: " + vetor[3]);
        System.out.println("vetor[4]: " + vetor[4]);

        // Declaração e inicialização de um vetor de inteiros com valores
        int[] vetor2 = {10, 20, 30, 40, 50};
        // Imprime o primeiro valor do vetor
        System.out.println("\nPrimeiro valor do vetor2: " + vetor2[0]);

        // Modifica o primeiro valor do vetor
        vetor2[0] = 100;
        // Imprime o novo valor do primeiro elemento do vetor
        System.out.println("Novo valor do primeiro elemento do vetor2: " + vetor2[0]);

        // Imprime o tamanho do vetor
        System.out.println("Tamanho do vetor2: " + vetor2.length);
        // Imprime o último valor do vetor
        System.out.println("Último valor do vetor2: " + vetor2[vetor2.length - 1]);

        // Declaração e inicialização de um vetor de Strings
        String[] nomes = {"João", "Maria", "José"};
        // Imprime os valores do vetor de Strings
        System.out.println("\nValores do vetor de Strings:");
        System.out.println("nomes[0]: " + nomes[0]);
        System.out.println("nomes[1]: " + nomes[1]);
        System.out.println("nomes[2]: " + nomes[2]);

        // Declaração e inicialização de um vetor de doubles
        double[] notas = {7.5, 8.0, 9.2, 6.3, 5.8};
        // Imprime os valores do vetor de doubles
        System.out.println("\nValores do vetor de doubles:");
        System.out.println("notas[0]: " + notas[0]);
        System.out.println("notas[1]: " + notas[1]);
        System.out.println("notas[2]: " + notas[2]);
        System.out.println("notas[3]: " + notas[3]);
        System.out.println("notas[4]: " + notas[4]);

        // Declaração e inicialização de um vetor de booleans
        boolean[] respostas = {true, false, true, true, false};
        // Imprime os valores do vetor de booleans
        System.out.println("\nValores do vetor de booleans:");
        System.out.println("respostas[0]: " + respostas[0]);
        System.out.println("respostas[1]: " + respostas[1]);
        System.out.println("respostas[2]: " + respostas[2]);
        System.out.println("respostas[3]: " + respostas[3]);
        System.out.println("respostas[4]: " + respostas[4]);

        // Declaração e inicialização de um vetor de chars
        char[] letras = {'A', 'B', 'C', 'D', 'E'};
        // Imprime os valores do vetor de chars
        System.out.println("\nValores do vetor de chars:");
        System.out.println("letras[0]: " + letras[0]);
        System.out.println("letras[1]: " + letras[1]);
        System.out.println("letras[2]: " + letras[2]);
        System.out.println("letras[3]: " + letras[3]);
        System.out.println("letras[4]: " + letras[4]);
    }
}
