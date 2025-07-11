package mangos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("introduce el numero de mangos:");
        int mangos = scanner.nextInt();
        System.out.print("introduce el numero de naranja:");
        int naranjas = scanner.nextInt();

        MangosNaranjas cajas = new MangosNaranjas(mangos, naranjas);
        cajas.imprimir();

        scanner.close();
    }
}

