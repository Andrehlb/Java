import java.util.Scanner;

/* Escreva um programa que informa a tabuada de multiplicação 
de um número informado pelo usuário (entre 1-10). 
Exemplo:
Entre com um número de 1 a 10: 1
A tabuada de 1 é: 1 x 1 = 1 1 x 2 = 2 1 x 3 = 3
Usando estruturas de repetição
sintax do for: for (int i=0; i < 10; i++) {}
aonde i = 0 é o início, i < 0 é o fim e i++ é o incremento
Autor: André Luiz Barbosa (@Andrehlb)
… */
public class tabuadaMultiplicacao {
    public static void main(String[] args) {
        int valor;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Tabuada do número, digite o valor: ");
        valor  = teclado.nextInt();
        for (int i = 0; i < 10; i++) {
            System.out.println(valor + " x " + i + " = " + (valor + i));
        }
    }
}