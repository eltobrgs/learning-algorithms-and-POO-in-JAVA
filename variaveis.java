public class variaveis {
    public static void main(String[] args) {
        // Inteiros
        int inteiros = 10; // -2147483648 a 2147483647 32 bits
        byte bytes = 100; // -128 a 127
        short shorts = 1000; // -32768 a 32767
        long longs = 1000000000L; // -9223372036854775808 a 9223372036854775807, se termina com L é long
        System.out.println("Inteiro: " + inteiros);
        System.out.println("Byte: " + bytes);
        System.out.println("Short: " + shorts);
        System.out.println("Long: " + longs);
        
        // Decimais
        double decimais = 10.5;
        float floats = 10.5f; // 32 bits, se termina com f é float
        System.out.println("Double: " + decimais);
        System.out.println("Float: " + floats);

        // outros ( char, String representam texto e boolean representa verdadeiro ou falso)
        char caracteres = 'a'; //char usa aspas simples
        String strings = "Hello World"; //String usa aspas duplas
        boolean boleanos = true;
        System.out.println("Char: " + caracteres);
        System.out.println("Boolean: " + boleanos);
        System.out.println("String: " + strings);
    }
}
