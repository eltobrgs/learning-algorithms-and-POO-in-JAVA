public class Formatação {
    public static void main(String[] args) {
        System.out.format("Para imprimir um número inteiro: %d\n", 10); // %d é o formato para números inteiros
        System.out.format("Para imprimir um número decimal: %f\n", 10.5); // %f é o formato para números decimais
        System.out.format("Para imprimir um texto: %s\n", "Hello World"); // %s é o formato para texto
        System.out.format("Para imprimir um caractere: %c\n", 'a'); // %c é o formato para caracteres
        System.out.format("Para imprimir um booleano: %b\n", true); // %b é o formato para booleanos
        System.out.format("Para imprimir um número hexadecimal: %x\n", 255); // %x é o formato para números hexadecimais
        System.out.format("Para imprimir um número octal: %o\n", 8); // %o é o formato para números octais
        System.out.format("Para imprimir um número em notação científica: %e\n", 12345.6789); // %e é o formato para notação científica
    }
}
