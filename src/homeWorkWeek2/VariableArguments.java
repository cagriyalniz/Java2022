package homeWorkWeek2;

public class VariableArguments {
    public static void main(String[] args) {
        int calc = calculator('+', 12 , 6, 7);
        System.out.println(calc);
    }

    public static int calculator(char c, int... nmbrs){
        if(c == '+'){
            int sum = 0;
            for(int nmb:nmbrs){
                sum+= nmb;
            }
            return sum;
        }
        else if (c == '-'){
            int extrac = 0;
            for(int nmb: nmbrs){
                extrac -= nmb;
            }
            return extrac;
        }
        return 0;

    }
}
