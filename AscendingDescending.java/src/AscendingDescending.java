import java.util.Scanner;

public class AscendingDescending {

    public static int[] sort3Ascending(int a, int b, int c) {

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        if (a > c) {
            int temp = a;
            a = c;
            c = temp;
        }

        if (b > c) {
            int temp = b;
            b = c;
            c = temp;
        }

        return new int[]{a, b, c};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three integers separated by spaces: ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int[] sorted = sort3Ascending(a, b, c);

        System.out.println("Ascending: " + sorted[0] + " " + sorted[1] + " " + sorted[2]);
        System.out.println("Descending: " + sorted[2] + " " + sorted[1] + " " + sorted[0]);

        sc.close();
    }
}
