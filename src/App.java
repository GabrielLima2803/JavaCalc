import java.util.Scanner;

// Calculadora de Dois números em Java, Apredendo

public class App {

    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário a partir do console
        Scanner scanner = new Scanner(System.in);

        // Declaração de variáveis para armazenar números, operação e resultado
        double num1, num2, resultado; // double = decimal parecido com C#
        char operacao; // char = string

        // Solicita ao usuário para inserir o primeiro número
        System.out.println("Digite o primeiro número:");
        // Aqui vai ser armazenado o primeiro numero
        num1 = scanner.nextDouble(); // nextDouble() serve para ele ler o valor double da constante

        // Aqui vai ser armazenado a operação
        System.out.println("Digite a operação (+, -, *, /):");
        operacao = scanner.next().charAt(0); // .next() serve para ler a proxima entrada que o usúario colocar ex: +, .charAt(0) serve para pegar a primeira posição

        // Aqui vai ser armazenado o segundo numero
        System.out.println("Digite o segundo número:");
        num2 = scanner.nextDouble(); // nextDouble() serve para ele ler o valor double da constante

        // Switch case padrão para as operações
        switch (operacao) {
            case '+':
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '-':
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '*':
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                }
                break;
            default:
                System.out.println("Operação inválida.");
        }

        // Fecha o objeto Scanner para liberar os recursos.
        scanner.close();
    }
}
