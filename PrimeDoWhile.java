import java.util.Scanner;

class PrimeDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int N = sc.nextInt();

        int num = 2;

        do {
            int i = 2;
            boolean isPrime = true;

           
            do {
                if (num % i == 0 && i != num) {
                    isPrime = false;
                    break;
                }
                i++;
            } while (i < num);

            
            if (isPrime) {
                System.out.print(num + " ");
            }

            num++;

        } while (num <= N);
    }
}
