import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual é seu nome ?");
        String nome = scan.next();
        System.out.println("Bem vindo a calculadora de médias, " + nome);

        int[] medias = new int[5];

        int i = 0;
        int contador = 0;

        while(i < medias.length){
            System.out.println("Digite sua nota: ? Digite 'stop' caso não haja.");
            String valid = scan.next();
            contador++;

            switch (valid.toLowerCase()) {
                case "stop":
                    System.out.println("Encerrando entrada de valores.");
                    i = medias.length; // Força a saída do loop while
                    break;
                default:
                    try {
                        medias[i] = Integer.parseInt(valid);
                        i++; // Incrementa o índice para passar para o próximo elemento
                    } catch (NumberFormatException e) {
                        System.out.println("Por favor, digite um número inteiro válido ou 'parar'.");
                    }
                    break;
            }
        }

        int soma = 0;
        for (int valor : medias) {
            soma += valor;
        }

        System.out.println("A soma dos valores do array medias é: " + soma);

        int media = (int) soma / medias.length;
        System.out.println("E a sua média total foi de: " + media);
        }

    }
