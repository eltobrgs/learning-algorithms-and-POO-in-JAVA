public class condicionais {
    public static void main(String[] args) {

        int idade = 18;
        // Verifica se a idade é maior ou igual a 18
        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }

        boolean maiorIdade = true;
        // Verifica se a variável maiorIdade é verdadeira
        if (maiorIdade) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }

        int idade2 = 19;
        // Verifica se idade2 é maior ou igual a idade
        if (idade2 >= idade) {
            System.out.println("Maior de idade");
        } else if (idade2 >= idade) { // Esta condição é redundante e nunca será executada
            System.out.println("Quase maior de idade");
        } else {
            System.out.println("Menor de idade");
        }

        var nome2 = "João";
        // Verifica se o nome é "João"
        if (nome2.equals("João")) {
            System.out.println("Nome é João");
        } else {
            System.out.println("Nome não é João");
        }

        var texto = "Exemplo";
        // Verifica se o texto está em branco
        if (texto.isBlank()) {
            System.out.println("Texto está em branco");
        } else {
            System.out.println("Texto não está em branco");
        }

        var texto2 = "Outro exemplo";
        // Verifica se o texto contém a palavra "exemplo"
        if (texto2.contains("exemplo")) {
            System.out.println("Texto contém 'exemplo'");
        } else {
            System.out.println("Texto não contém 'exemplo'");
        }

        var texto3 = "Mais um exemplo";
        // Verifica se o texto começa com a palavra "Mais"
        if (texto3.startsWith("Mais")) {
            System.out.println("Texto começa com 'Mais'");
        } else {
            System.out.println("Texto não começa com 'Mais'");
        }

        var texto4 = "Exemplo final";
        // Verifica se o texto termina com a palavra "final"
        if (texto4.endsWith("final")) {
            System.out.println("Texto termina com 'final'");
        } else {
            System.out.println("Texto não termina com 'final'");
        }

        var texto5 = "Exemplo de texto";
        // Verifica se o texto é igual a "Exemplo de texto"
        if (texto5.equals("Exemplo de texto")) {
            System.out.println("Texto é igual a 'Exemplo de texto'");
        } else {
            System.out.println("Texto não é igual a 'Exemplo de texto'");
        }

        var texto6 = "Exemplo de texto";
        // Verifica se o texto é igual a "exemplo de texto" ignorando maiúsculas/minúsculas
        if (texto6.equalsIgnoreCase("exemplo de texto")) {
            System.out.println("Texto é igual a 'exemplo de texto' (ignorando maiúsculas/minúsculas)");
        } else {
            System.out.println("Texto não é igual a 'exemplo de texto' (ignorando maiúsculas/minúsculas)");
        }

        var texto7 = "   ";
        // Verifica se o texto é vazio ou contém apenas espaços em branco
        if (texto7.trim().isEmpty()) {
            System.out.println("Texto é vazio ou apenas espaços em branco");
        } else {
            System.out.println("Texto não é vazio ou apenas espaços em branco");
        }
    }
}
