import java.util.Scanner;

public class Pratica3Loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Digite 1 para calcular a area do losango;\n2 para calcular a temperatura;\n3 para calcular o salario;\n4 para calcular a hipotenusa;\n5 para calcular o comprimento da esfera;\n6 para sair.");
            int val = scanner.nextInt();
            switch(val){
                case 1:
                    diagonal();
                    continue;
                case 2:
                    temperatura();
                    continue;
                case 3:
                    salario();
                    continue;
                case 4:
                    hipotenusa();
                    continue;
                case 5:
                    esfera();
                    continue;
                case 6:
                    System.out.println("Bye bye!");
                    break;
                default:
                    System.out.println("Desculpe mas nao entendi, poderia repetir?");
                    continue;
            }
            System.exit(0);
        }
    }
    public static void diagonal() {

        Scanner scanner = new Scanner(System.in);
        double val1, val2, area;
        System.out.println("Calculadora de área de losango");

        while(true) {

            System.out.println("Escreva o primeiro valor");
            val1 = scanner.nextDouble();

            System.out.println("Escreva o segundo valor");
            val2 = scanner.nextDouble();

            area = ((val1 * val2) / 2);

            if(val1 < 0 || val2 < 0){
                System.out.println("Algum dos valores está inválido");
                continue;
            }

            System.out.printf("A área do losango é: %.2f \n", area);

            if (val1 > val2 || val2 > val1) {
                if (val1 > val2) {
                    System.out.println("Tendo em mente que a diagonal maior é " + val1);
                    break;
                } else {
                    System.out.println("Tendo em mente que a diagonal maior é " + val2);
                    break;
                }
            } else {
                System.out.println("Tendo em mente que ambas tem o mesmo tamanho");
                break;
            }
        }
    }


    public static void temperatura() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nCalculadora de Temperatura.");

        while (true) {
            double F = 0, C = 0;
            String option = "";

            System.out.println("Digite F caso deseje calcular de Fahrenheit para Celsius");
            System.out.println("Digite C caso deseje calcular de Celsius para Fahrenheit");
            System.out.println("Caso deseje sair, digite Exit");

            option = scanner.nextLine().toUpperCase();

            switch (option) {

                case "F":
                    System.out.println("Digite o valor em F");
                    F = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.printf("O valor em Fahrenheit é %.2f F\n", F);
                    System.out.printf("O valor em Celsius é %.2f C\n", ((F - 32) / 1.8));
                    continue;
                case "C":
                    System.out.println("Digite o valor em C");
                    C = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.printf("O valor em Celsius é %.2f C\n", C);
                    System.out.printf("O valor em Fahrenheit  é %.2f F\n", ((C * 1.8) + 32));
                    continue;
                case "EXIT":
                    System.out.println("Bye bye!");
                    break;
                default:
                    System.out.println("Please try again");
                    continue;
            }
            break;
        }
    }


    public static void salario() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nCalculadora de salário");

        while (true) {
            System.out.println("Escreva o valor do salário mínimo hoje");
            double salmin = scanner.nextDouble();

            System.out.println("Escreva o valor do salário do funcionário");
            double salfun = scanner.nextDouble();

            if (salmin < 0 || salfun < 0) {
                System.out.println("Valor negativo recebido, você digitou certo?");
                continue;
            } else if (salfun / salmin > 0) {

                if (salfun / salmin < 1) {
                    System.out.println("Funcionário recebe menos do que o salário mínimo.");
                    System.out.printf("Salários: %.2f salários mínimos\n", (salfun / salmin));
                    break;

                } else {
                    System.out.printf("Funcionário recebe %.0f salários\n", (salfun / salmin));
                    break;
                }
            }
        }
    }


    public static void hipotenusa() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nCalculadora de hipotenusa");
        double a, b, c;

        while(true) {

            System.out.println("Digite os dois valores da hipotenusa");

            b = scanner.nextDouble();
            c = scanner.nextDouble();

            if (b < 0 || c < 0) {
                System.out.println("Valores inválidos");
                continue;
            }

            a = Math.sqrt((b * b) + (c * c));

            System.out.printf("O valor da hipotenusa é %.2f\n", a);
            break;
        }
    }


    public static void esfera() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nCalculadora de esfera");
        while(true) {
            System.out.println("Digite o valor do raio: ");
            double raio = scanner.nextDouble();

            if(raio < 0){
                System.out.println("valor inválido, digite novamente");
                continue;
            }

            double comprimento = 2 * Math.PI * raio;
            System.out.printf("O comprimento é %.2f \n", comprimento);

            double area = Math.PI * Math.pow(raio, 2);
            System.out.printf("A área é %.2f \n", area);

            double volume = (3.14 * Math.pow(raio, 3) * 4 / 3);
            System.out.printf("O volume é %.2f \n", volume);

            break;

        }
    }


}