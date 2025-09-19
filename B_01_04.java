/* Ввести (через консоль) два додатних цілих числа N та M. Вивести N
* випадкових цілих чисел у діапазоні від 0 до M. Кожне число виводити в
* окремому рядку. Опрацювати випадок, коли числа N та M вводяться як
* аргументи командного рядка.
*/

import java.util.Scanner;

public class B_01_04 {
    public static void main(String[] args) {
        int N, M;

        if (args.length == 2) {
            N = Integer.parseInt(args[0]);
            M = Integer.parseInt(args[1]);
        } else {
            Scanner in = new Scanner(System.in);
            System.out.print("Input N: ");
            N = in.nextInt();
            System.out.print("Input M: ");
            M = in.nextInt();
        }

        for (int i = 0; i < N; i++) {
            int r = (int) (Math.random() * (M + 1));
            System.out.println(r);
        }
    }
}

