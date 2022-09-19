package homeWorks;

public class MiniProjectPrimeNum {
    public static int ftIsPrime(int n){
        if (n <= 1)
            return 0;
        else if (n == 2)
            return 1;
        else{
            int i = 2;
            while(i <= n/2){
                if(n%i == 0)
                    return 0;
                i++;
            }
            return 1;

        }
    }

    public static void main(String[] args) {
        int myNumber = 14;
        int myNumber2 = 13;

        if(ftIsPrime(myNumber) == 1)
            System.out.println("this number is prime: " + myNumber);
        else
            System.out.println("this number is not prime: " + myNumber);
        if(ftIsPrime(myNumber2) == 1)
            System.out.println("this number is prime: " + myNumber2);
        else
            System.out.println("this number is not prime: " + myNumber2);

    }
}
