public class ex_2_5 {
    public static void main(String[] args) {
        int[] primes = new int[50];
        primes[0] = 2;
        int count = 1;
        int number = 3;

        while (count < 50) {
            boolean isPrime = true;
            for (int i = 0; i < count; i++) {
                if (primes[i] * 2 > number) {
                    break;
                }
                if (number % primes[i] == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primes[count] = number;
                count++;
            }
            number += 2;
        }

        for (int prime : primes) {
            System.out.print(prime+",");
        }
    }
}
