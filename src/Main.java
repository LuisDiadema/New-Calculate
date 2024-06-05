import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo a calculadora\n");
        System.out.println("Escola a operção\n");

        while (true) {
            System.out.println("A = Adição \nS = Subtração\nM = Multiplicação\nD = Divisão \n\nE = Sair");
            String mat = scanner.nextLine();

            if (mat.equals("A") || mat.equals("a")){
                System.out.println("Digite o primeiro número da equação ");
                String num1 = scanner.nextLine();

                System.out.println("Digite o segundo número da equação");
                String num2 = scanner.nextLine();

                int num3 = Integer.parseInt(num1);
                int num4 = Integer.parseInt(num2);

                soma(num3, num4);
            } else if (mat.equals("S") || mat.equals("s")){
                System.out.println("Digite o primeiro número da equação: ");
                String num1 = scanner.nextLine();

                System.out.println("Digite o segundo número da equação: ");
                String num2 = scanner.nextLine();

                int num3 = Integer.parseInt(num1);
                int num4 = Integer.parseInt(num2);

                subtracao(num3, num4);
            } else if (mat.equals("M") || mat.equals("m")) {
                System.out.println("Digite o primeiro número da equação: ");
                String num1 = scanner.nextLine();

                System.out.println("Digite o segundo número da equação: ");
                String num2 = scanner.nextLine();

                int num3 = Integer.parseInt(num1);
                int num4 = Integer.parseInt(num2);

                multiplicacao(num3, num4);
            }else if (mat.equals("D") || mat.equals("d")) {
                System.out.println("Digite o primeiro número da equação: ");
                String num1 = scanner.nextLine();

                System.out.println("Digite o segundo número da equação: ");
                String num2 = scanner.nextLine();

                int num3 = Integer.parseInt(num1);
                int num4 = Integer.parseInt(num2);

                divisao(num3, num4);
            }else if (mat.equals("e") || mat.equals("E")){
                break;
            }
            else {
                System.out.println("Opção invalida tente novamente!! ");
                return;
            }
        }
    }
    static void soma (int num3, int num4) {
        System.out.println("Resultado: " + (num3 + num4));
    }
    static void subtracao (int num3, int num4) {
        System.out.println("Resultado: " + (num3 - num4));
    }
    static void multiplicacao (int num3, int num4){
        System.out.println("Resultado: " + (num3 * num4));
    }
    static void divisao (int num3, int num4) {
        System.out.println("Resultado: " + (num3 / num4));
    }
}