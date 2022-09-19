package homeWorks;

public class FindNumber {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 5, 7, 9};
        int findMe = 5;
        for(int i : numbers){
            if(i == findMe){
                System.out.println("your number is here");
                return ;
            }
        }
        System.out.println("your number is not here :(");
    }
}
