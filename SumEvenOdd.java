import java.util.Scanner;

public class SumEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Size of array: ");
        int n = sc.nextInt();

        int[] nims = new int[n]; 
        int sume = 0, sumo = 0;

        System.out.println("Enter values of array: ");
        for (int i = 0; i < n; i++) {
            nims[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (nims[i] % 2 == 0) {
                sume = sume + nims[i];
            } else {
                sumo = sumo + nims[i];
            }
        }

        System.out.println("Sum of all even numbers: " + sume);
        System.out.println("Sum of all odd numbers: " + sumo);

        sc.close();
    }
}
