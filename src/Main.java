import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Bem-vindo a calculadora\n");
        eq();
    }

    static void eq () {
        Scanner scanner = new Scanner(System.in);

            for (int i = 0; i < 1; i++) {
                System.out.println("\nEscola a operção\n");
                System.out.println("A = Adição \nS = Subtração\nM = Multiplicação\nD = Divisão \n\nE = Sair");
                String mat = scanner.nextLine();

                if (mat.equals("A") || mat.equals("a")) {
                    System.out.println("Digite o primeiro número da equação ");
                    String num1 = scanner.nextLine();
                    System.out.println("Digite o segundo número da equação");
                    String num2 = scanner.nextLine();

                    int num3 = Integer.parseInt(num1);
                    int num4 = Integer.parseInt(num2);

                    soma(num3, num4);
                    System.out.println("\nDeseja fazer uma nova operação");
                    System.out.println("S = Sim |-| N Não");
                    String continuar = scanner.nextLine();
                    if (continuar.equals("S") || continuar.equals("s")) {
                        eq();
                    } else {
                        break;
                    }
                } else if (mat.equals("S") || mat.equals("s")) {
                    System.out.println("Digite o primeiro número da equação: ");
                    String num1 = scanner.nextLine();
                    System.out.println("Digite o segundo número da equação: ");
                    String num2 = scanner.nextLine();

                    int num3 = Integer.parseInt(num1);
                    int num4 = Integer.parseInt(num2);

                    subtracao(num3, num4);
                    System.out.println("\nDeseja fazer uma nova operação");
                    System.out.println("S = Sim |-| N Não");
                    String continuar = scanner.nextLine();
                    if (continuar.equals("S") || continuar.equals("s")) {
                        eq();
                    } else {
                        break;
                    }
                } else if (mat.equals("M") || mat.equals("m")) {
                    System.out.println("Digite o primeiro número da equação: ");
                    String num1 = scanner.nextLine();
                    System.out.println("Digite o segundo número da equação: ");
                    String num2 = scanner.nextLine();

                    int num3 = Integer.parseInt(num1);
                    int num4 = Integer.parseInt(num2);

                    multiplicacao(num3, num4);
                    System.out.println("\nDeseja fazer uma nova operação");
                    System.out.println("S = Sim |-| N Não");
                    String continuar = scanner.nextLine();
                    if (continuar.equals("S") || continuar.equals("s")) {
                        eq();
                    } else {
                        break;
                    }
                } else if (mat.equals("D") || mat.equals("d")) {
                    System.out.println("Digite o primeiro número da equação: ");
                    String num1 = scanner.nextLine();
                    System.out.println("Digite o segundo número da equação: ");
                    String num2 = scanner.nextLine();

                    int num3 = Integer.parseInt(num1);
                    int num4 = Integer.parseInt(num2);

                    divisao(num3, num4);
                    System.out.println("\nDeseja fazer uma nova operação");
                    System.out.println("S = Sim |-| N Não");
                    String continuar = scanner.nextLine();
                    if (continuar.equals("S") || continuar.equals("s")) {
                        eq();
                    } else {
                        break;
                    }
                } else if (mat.equals("e") || mat.equals("E")) {
                    break;
                } else {
                    System.out.println("Opção invalida, tente novamente!! \n\n");
                    eq();
                }
            }
    }

    static void nova () {
        Scanner exit = new Scanner(System.in);
        System.out.println("\n\nDeseja fazer uma nova equação ? \n\nS = Sim \nN = Não\n\n");
        String sair = exit.nextLine();

        for (int i = 0; i < 1; i++) {
            if (sair.equals("S") || sair.equals("s")){
                eq();
            } else if (sair.equals("N") || sair.equals("n")){
                System.out.println("Obriado por usar!");
                break;
            } else {
                System.out.println("Opção invalida, Tente novamente!!");
                nova();
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