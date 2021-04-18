import java.util.Locale;
import java.util.Scanner;
public class Pratica3 {

    public static void main(String[] args) {

        validacao();
    }

    public static void validacao(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva sua nota");
        double nota = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Escreva seu salario");
        double salario = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Escreva seu sexo (M ou F)");
        String sexo = scanner.nextLine();
        sexo.toLowerCase();

        System.out.println("Escreva sua idade");
        int idade = scanner.nextByte();
        scanner.nextLine();

        if(nota > 10 || nota < 0){
            System.out.println("Valor de nota invalido");
        }else{
            System.out.println("Nota " + nota);
        }

        if(salario <= 0){
            System.out.println("Valor de salario invalido");
        }else{
            System.out.println("Salario " + salario);
        }

        if(sexo.equals("m") || sexo.equals("f")){
            System.out.println("Sexo " + sexo);
        }else{
            System.out.println("Sexo invalido");
        }

        if(idade < 0 || idade > 150){
            System.out.println("Idade invalida");
        }else{
            System.out.println("Idade " +idade);
        }

    }
}
