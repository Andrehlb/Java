import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
    
        System.out.print("Nome do vendedor: ");
        String nomeVendedor = sc.nextLine();

        System.out.print("Salario fixo: ");
        double salarioFixo = sc.nextDouble();

        System.out.print("Total de vendas: ");
        double totalVendas = sc.nextDouble();

        double aReceber = (totalVendas * 0.15) + salarioFixo;

        System.out.println(nomeVendedor + " deve receber R$" + df.format(aReceber));
    }
}