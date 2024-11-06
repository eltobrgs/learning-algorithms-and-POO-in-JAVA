public class casting {

    public static void main(String[] args) {
        // Casting explícito (narrowing conversion)
        double inicial = 10.0;
        int resultado = (int) inicial; // Converte double para int
        System.out.println("Casting explícito de double para int: " + resultado);

        // Casting implícito (widening conversion)
        int outroResultado = 10;
        double outroInicial = outroResultado; // Converte int para double automaticamente
        System.out.println("Casting implícito de int para double: " + outroInicial);

        // Casting de String para int
        String numeroStr = "10";
        int numeroInt = Integer.parseInt(numeroStr); // Converte String para int
        System.out.println("Casting de String para int: " + numeroInt);

        // Casting de int para String
        int numeroInt2 = 10;
        String numeroStr2 = Integer.toString(numeroInt2); // Converte int para String
        System.out.println("Casting de int para String usando Integer.toString: " + numeroStr2);

        // Outra forma de converter int para String
        int numeroInt3 = 10;
        String numeroStr3 = String.valueOf(numeroInt3); // Converte int para String
        System.out.println("Casting de int para String usando String.valueOf: " + numeroStr3);

        // Casting de long para int (explícito)
        long valorLongo = 100L;
        int valorInt = (int) valorLongo; // Converte long para int
        System.out.println("Casting explícito de long para int: " + valorInt);

        // Casting de float para double (implícito)
        float valorFloat = 10.5f;
        double valorDouble = valorFloat; // Converte float para double automaticamente
        System.out.println("Casting implícito de float para double: " + valorDouble);

        // Casting de double para float (explícito)
        double valorDouble2 = 10.5;
        float valorFloat2 = (float) valorDouble2; // Converte double para float
        System.out.println("Casting explícito de double para float: " + valorFloat2);

        // Casting de char para int (implícito)
        char valorChar = 'A';
        int intDeChar = valorChar; // Converte char para int automaticamente
        System.out.println("Casting implícito de char para int: " + intDeChar);

        // Casting de int para char (explícito)
        int valorInt2 = 65;
        char charDeInt = (char) valorInt2; // Converte int para char
        System.out.println("Casting explícito de int para char: " + charDeInt);
    }
}