import java.util.Scanner

public class Celular {
	String marca;
    String modelo;
    String SistemaOperacional;
    String cor;
    String numero;
    String dono;
    
    public static void main(String[] args) {
        Celular celular = new Celular();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a marca do celular: ");
        celular.marca = scanner.nextLine();
        System.out.println("Digite o modelo do celular: ");
        celular.modelo = scanner.nextLine();
        System.out.println("Digite o Sistema Operacional do celular: ");
        celular.SistemaOperacional = scanner.nextLine();
        System.out.println("Digite a cor do celular: ");
        celular.cor = scanner.nextLine();
        System.out.println("Digite o número do celular: ");
        celular.numero = scanner.nextLine();
        System.out.println("Digite o dono do celular: ");
        celular.dono = scanner.nextLine();

        System.out.println("Marca: " + celular.marca);
        System.out.println("Modelo: " + celular.modelo);
        System.out.println("Sistema Operacional: " + celular.SistemaOperacional);
        System.out.println("Cor: " + celular.cor);
        System.out.println("Número: " + celular.numero);
        System.out.println("Dono: " + celular.dono);
    }


    
}