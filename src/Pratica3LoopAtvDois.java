import java.util.Scanner;

public class Pratica3LoopAtvDois {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Digite 1 para conferir o triangulo;\n2 para calcular a media de notas;\n3 para calcular o imc;\n4 para calcular a funcao;\n5 para validar o comprimento do lado;\n6 para fazer equacao do segundo grau;\n7 para catalogo de produtos;\n8 para sair.");

        while(true) {
            int val = scanner.nextInt();
            switch (val) {
                case 1:
                    triangulo();
                    continue;
                case 2:
                    notas();
                    continue;
                case 3:
                    imc();
                    continue;
                case 4:
                    funcao();
                    continue;
                case 5:
                    triangulosoma();
                    continue;
                case 6:
                    equacaosegundograu();
                    continue;
                case 7:
                    catalogo();
                    continue;
                case 8:
                    System.out.println("Bye bye!");
                    break;
                default:
                    System.out.println("Desculpe mas nao entendi, poderia repetir?");
                    continue;
            }
            System.exit(0);
        }
    }

    public static void triangulo(){
        int val1, val2, val3;

        System.out.println("Calculadora de Triângulos");

        while(true) {
            System.out.println("Primeiro lado");
            val1 = scanner.nextInt();
            System.out.println("Segundo Lado");
            val2 = scanner.nextInt();
            System.out.println("Terceiro Lado");
            val3 = scanner.nextInt();

            if(val1 < 0 || val2 < 0 || val3 < 0){
                System.out.println("Insira um valor maior que 0");
                continue;
            }

            if(val1 == val2 || val2 == val3){
                if(val1 == val3){
                    System.out.println("O triângulo é Equilátero");
                    break;
                }else{
                    System.out.println("O triângulo é Isósceles");
                    break;
                }
            }else{
                System.out.println("O triângulo é Escaleno");
                break;
            }

        }
    }

    public static void notas(){
        double val1, val2, val3, media;

        System.out.println("\nCalculadora de notas");

        while(true) {
            System.out.println("Valor 1: ");
            val1 = scanner.nextInt();
            System.out.println("Valor 2: ");
            val2 = scanner.nextInt();
            System.out.println("Valor 3: ");
            val3 = scanner.nextInt();

            if(val1 < 0 || val2 < 0 || val3 < 0 || val1 > 10 || val2 > 10 || val3 > 10){
                System.out.printf("Valores inválidos, tente novamente\n");
                continue;
            }

            media = (val1 + val2 + val3) / 3;

            System.out.printf("A média é %.2f \n", media);
            if(media > 2){
                if(media > 6){
                    System.out.println("Aluno Aprovado");
                    break;
                }else{
                    System.out.println("Aluno em Exame");
                    break;
                }
            }else{
                System.out.println("Aluno reprovado");
                break;
            }
        }
    }

    public static void imc() {
        double massa, altura, imc;

        System.out.println("\nCalculadora de imc");

        while (true) {
            System.out.println("Digite seu peso em KG (coloque vírgula pro decimal, usei ponto e deu erro no meu por algum motivo)");
            massa = scanner.nextDouble();

            System.out.println("Digite sua altura em metros");
            altura = scanner.nextDouble();

            if (altura < 0 || massa < 0) {
                System.out.println("Massa ou Altura inválidos");
                continue;
            }

            imc = massa / (altura * altura);

            System.out.printf("Seu imc é: %.2f ", imc);

            if (imc > 19) {
                if (imc > 25) {
                    if (imc > 30) {
                        if (imc > 40) {
                            System.out.println("Obesidade Mórbida");
                            break;
                        } else {
                            System.out.println("Obesidade");
                            break;
                        }
                    } else {
                        System.out.println("Sobrepeso");
                        break;
                    }
                } else {
                    System.out.println("Normal");
                    break;
                }
            } else {
                System.out.println("Abaixo do Peso");
                break;
            }
        }
    }

    public static void funcao(){

        System.out.println("\nCalculadora de função.");

        while(true) {
            System.out.println("Digite o valor de x");
            int x = scanner.nextInt();

            System.out.print("2*"+ x +"+2 = " + ((2*x)+2));
            if(x < -2){
                System.out.println("\t \t"+ x +" < -2");
            }else if(x > -2){
                System.out.println("\t \t"+ x +" > -2");
            }else{
                System.out.println("\t \t"+ x +" == 2");
            }

            System.out.print("3\t \t \t \t");

            if(x <= -2 || x < 3){
                if(x <= -2 && x < 3){
                    System.out.println("-2 >= " + x + " < 3");
                }else if(x > -2){
                    System.out.println("-2 < " + x + " < 3");
                }else if(x >= 3){
                    System.out.println("-2 >= " + x + " >= 3");
                }
            }else{
                System.out.println("-2 < " + x + " >= 3");
            }

            System.out.printf((-x) + "\t \t \t \t");

            if(3 <= x){
                System.out.println("3 <= " + x);
            }else{
                System.out.println("3 > " + x);
            }

            break;
        }
    }

    public static void triangulosoma() {
        double x, y, z;

        System.out.println("\nValidação de comprimento de lado");


        while (true) {
            System.out.println("Valor de X");
            x = scanner.nextDouble();
            System.out.println("Valor de Y");
            y = scanner.nextDouble();
            System.out.println("Valor de Z");
            z = scanner.nextDouble();

            if(x < 0 || y < 0 || z < 0){
                System.out.println("Valor inválido, favor digitar novamente");
                continue;
            }

            if (x < y + z || y < x + z || z < x + y) {
                if (x < y + z) {
                    System.out.println("X é comprimento");
                } else {
                    System.out.println("X não é comprimento");
                }

                if (y < x + z) {
                    System.out.println("Y é comprimento");
                } else {
                    System.out.println("Y não é comprimento");
                }

                if (z < x + y) {
                    System.out.println("Z é comprimento");
                } else {
                    System.out.println("Z não é comprimento");
                }

                break;
            }
        }
    }

    public static void equacaosegundograu() {
        double a, b, c, x, delta;

        System.out.println("\nEquação do segundo grau");
        while (true) {
            System.out.println("Escreva o valor de A em ax^2+bx+c = 0");
            a = scanner.nextDouble();
            System.out.println("Escreva o valor de B em ax^2+bx+c = 0");
            b = scanner.nextDouble();
            System.out.println("Escreva o valor de C em ax^2+bx+c = 0");
            c = scanner.nextDouble();

            if (a == 0) {
                if (b == 0) {
                    if (c != 0) {
                        System.out.println("Coeficientes informados incorretamente");
                        continue;
                    } else {
                        System.out.println("Igualdade confirmada");
                        System.out.println("0 = 0");
                        break;
                    }
                } else {
                    x = (Math.sqrt(c)) / a;
                    System.out.printf("Essa é uma equação de primeiro grau, onde X = %.2f\n", x);
                    break;
                }
            }

            delta = (Math.pow(b, 2) - 4 * a * c);

            if (delta < 0) {
                System.out.println("Esta equação não possui raízes reais");
                System.out.println("Delta = " + delta);
                break;
            } else if (delta == 0) {
                System.out.println("Esta equação possui duas raízes reais iguais");
                x = (-b + (Math.sqrt(delta))) / (2 * a);
                System.out.printf("O valor de x1 é = %.2f\n", x);
                x = (-b - (Math.sqrt(delta))) / (2 * a);
                System.out.printf("O valor de x2 é = %.2f\n", x);
                break;
            } else {
                System.out.println("Esta equação possui duas raízes reais diferentes");
                x = (-b + (Math.sqrt(delta))) / (2 * a);
                System.out.printf("O valor de x1 é = %.2f\n", x);
                x = (-b - (Math.sqrt(delta))) / (2 * a);
                System.out.printf("O valor de x2 é = %.2f\n", x);
                break;
            }


        }
    }

    public static void catalogo() {
        int cod;

        System.out.println("\nCatálogo de produtos");
        while (true) {
            System.out.println("Digite o código do produto");
            System.out.println("\n1- Sapato, \n2- Bolsa, \n3- Camisa, \n4- Calça, \n5- Blusa, \n6- Sair");
            cod = scanner.nextInt();

            switch (cod) {
                case 1:
                    System.out.println("O valor do produto Sapato é R$ 99,99");
                    continue;
                case 2:
                    System.out.println("O valor do produto Bolsa é R$ 103,89");
                    continue;
                case 3:
                    System.out.println("O valor do produto Camisa é R$ 49,98");
                    continue;
                case 4:
                    System.out.println("O valor do produto Calça é R$ 89,72");
                    continue;
                case 5:
                    System.out.println("O valor do produto Blusa é R$ 97,35");
                    continue;
                case 6:
                    System.out.println("Bye bye!");
                    break;
                default:
                    System.out.println("Entrada incorreta, favor tentar novamente");
                    continue;
            }
            break;
        }
    }


}
