import java.util.ArrayList; // Importa a classe ArrayList do pacote java.util para uso no programa

/**
 * A classe MyArrayList demonstra o uso de arrays e ArrayLists em Java.
 * 
 * Arrays e ArrayLists são ambos usados para armazenar coleções de elementos, mas possuem diferenças importantes:
 * 
 * 1. Arrays:
 *    - Têm tamanho fixo, definido no momento da criação.
 *    - Podem armazenar elementos de qualquer tipo, incluindo tipos primitivos.
 *    - Acessar elementos é rápido, pois o índice é usado diretamente.
 *    - Não possuem métodos embutidos para manipulação de elementos (como adicionar, remover, etc.).
 * 
 * 2. ArrayLists:
 *    - Têm tamanho dinâmico, podendo crescer ou diminuir conforme necessário.
 *    - Podem armazenar apenas objetos (não tipos primitivos diretamente, mas podem armazenar suas classes wrapper, como Integer, Double, etc.).
 *    - Oferecem métodos embutidos para manipulação de elementos (como adicionar, remover, etc.).
 *    - São parte da coleção do framework Java Collections.
 * 
 * No método main, demonstramos o uso de ambos:
 * - Primeiro, criamos um array de Strings e iteramos sobre ele para imprimir seus elementos.
 * - Em seguida, criamos um ArrayList de Strings, adicionamos elementos, removemos um elemento, e utilizamos vários métodos do ArrayList para manipulação e acesso aos elementos.
 */
public class VetoresManipulaveis{

    public static void main(String[] args) {
        // Criação de um array de Strings
        String[] nomes = {"João", "Maria", "José"};
        
        // Iteração sobre o array e impressão de seus elementos
        System.out.println("Elementos do array:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        // Criação de um ArrayList de Strings
        ArrayList<String> listaArray = new ArrayList<>();
        
        // Adição de elementos ao ArrayList
        listaArray.add("João");
        listaArray.add("Maria");
        listaArray.add("José");
        
        // Impressão do ArrayList
        System.out.println("\nElementos do ArrayList:");
        System.out.println(listaArray);

        // Remoção do primeiro elemento do ArrayList
        listaArray.remove(0);
        
        // Impressão do ArrayList após a remoção
        System.out.println("\nArrayList após remoção do primeiro elemento:");
        System.out.println(listaArray);

        // Acesso e impressão do primeiro elemento do ArrayList
        System.out.println("\nPrimeiro elemento do ArrayList:");
        System.out.println(listaArray.get(0));
        
        // Impressão do tamanho do ArrayList
        System.out.println("\nTamanho do ArrayList:");
        System.out.println(listaArray.size());
        
        // Verificação se o ArrayList contém o elemento "Maria"
        System.out.println("\nArrayList contém 'Maria'?");
        System.out.println(listaArray.contains("Maria"));
        
        // Impressão do índice do elemento "Maria" no ArrayList
        System.out.println("\nÍndice do elemento 'Maria' no ArrayList:");
        System.out.println(listaArray.indexOf("Maria"));
        
        // Verificação se o ArrayList está vazio
        System.out.println("\nArrayList está vazio?");
        System.out.println(listaArray.isEmpty());

        // Limpeza do ArrayList
        listaArray.clear();
    }
}
