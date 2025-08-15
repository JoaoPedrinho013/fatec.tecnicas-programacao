package exercicio02;

import java.util.Scanner;

public class verificarLogin {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        String login, senha;
        String[][] loginSenhas = {
            {"Azien", "1234"},
            {"Kadu", "4321"},
            {"Caio", "3241"},
            {"Gege", "1243"},
            {"Edu", "4312"},
            {"Pedro", "3241"}
        };
        System.out.print("Digite seu login: ");
        login = scan.nextLine();

        System.out.print("Digite sua senha: ");
        senha = scan.nextLine();

        


    }
}
