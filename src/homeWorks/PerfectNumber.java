package homeWorks;

public class PerfectNumber {

    private static boolean isPerfect(int n){
        int i = 1;
        int sum = 0;
        while(i < n){
            if(n % i == 0)
                sum += i;
            i++;
        }
        if(sum == n)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

        int nmbr = 6;
        if(isPerfect(nmbr))
            System.out.println("this number is PERFECT!");
        else
            System.out.println(nmbr + " is not prfct :((((");
    }
}
