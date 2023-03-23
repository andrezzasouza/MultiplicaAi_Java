import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Escolha um número para ver sua tabela de multiplicação:");
        String stringNum = userInput.nextLine();
        int num = Integer.parseInt(stringNum);

        System.out.println("Tabela de multiplicação de " + num);
        
        for (int i = 0; i < 11; i++) {
            int product = num * i;
            System.out.println(num + " x " + i + " = " + product);
        }
    }
}
