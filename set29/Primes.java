package zohoSets.set29;

public class Primes {

    public static void main(String[] args) {
        Primes primes = new Primes();
        primes.init();
    }

    private void init() {
        System.out.print("ENTER NUM : ");
//        int num = new Scanner(System.in).nextInt();
//        printPrime(num);
//        printPrime1(num);
//        soe(num);
        System.out.println(addition(10, 7));
    }

    private void soe(int num) {
        boolean[] arr = new boolean[num + 1];
        for (int i = 2; i * i <= num; i++) {
            if (!arr[i]) {
                for (int j = i * i; j <= num && !arr[j]; j += i)
                    arr[j] = !arr[j];
            }
        }
        for (int i = 2; i < num; i++) {
            if (!arr[i]) System.out.print(i + " ");
        }
    }

    private void printPrime1(int num) {
        for (int i = 2; i < num; i++) {
            if (isPrime(i)) System.out.print(i + " ");
        }
    }

    private void printPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (isPrime(i))
                System.out.print(i + " ");
        }
    }

    private boolean isPrime(int i) {
        for (int j = 2; j * j <= i; j++) if (i % j == 0) return Boolean.FALSE;
        return Boolean.TRUE;
    }


    int addition(int a, int b) {
        while (b > 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }
}
