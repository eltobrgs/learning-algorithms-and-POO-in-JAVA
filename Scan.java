import java.util.Scanner;
public class Scan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        int numeroInteiro = scanner.nextInt();
        System.out.println("Número inteiro digitado: " + numeroInteiro);
        System.out.println("Digite um número decimal:");
        double numeroDecimal = scanner.nextDouble();
        System.out.println("Número decimal digitado: " + numeroDecimal);
        System.out.println("Digite um texto:");
        String texto = scanner.next();
        System.out.println("Texto digitado: " + texto);
        scanner.close();
        
    }
}
