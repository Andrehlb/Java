// realizar o cálculo receba o valor bruto do salário e o adicional de benefícios. O salário a ser transferido é calculado da seguinte maneira:
// salário bruto + adicional de benefícios - percentual de imposto mediante ao salário * adicional dos benefícios
// Para calcular o percentual de imposto segue as alíquotas:
// De R$ 0.00 à R$ 1100.00 = 5.00%
// De R$ 1100.01 à R$ 2500.00 = 10.00%
// Maior que R$ 2500.00 = 15.00%

import java.util.Scanner;

public class calculandoImpostoSalario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salarioBruto, adicionalBeneficios, salarioTransferido, percentualImposto;

        System.out.println("Digite o valor do salário bruto: ");
        salarioBruto = input.nextDouble();
        System.out.println("Digite o valor do adicional de benefícios: ");
        adicionalBeneficios = input.nextDouble();

        if (salarioBruto <= 1100.00) {
            percentualImposto = 5.00;
        } else if (salarioBruto > 1100.00 && salarioBruto <= 2500.00) {
            percentualImposto = 10.00;
        } else {
            percentualImposto = 15.00;
        }

        salarioTransferido = salarioBruto + adicionalBeneficios - (percentualImposto / 100) * adicionalBeneficios;

        System.out.println("O salário transferido é: " + salarioTransferido);        
    }
}
