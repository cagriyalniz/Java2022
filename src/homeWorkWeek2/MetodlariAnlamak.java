package homeWorkWeek2;
// Dont Repeat Yourself
public class MetodlariAnlamak {
    public static void main(String[] args) {
        findNumber(7);
        findNumber(6);
    }

    public static void findNumber(int search){
        int[] numbers = new int[] {1, 2, 5, 7, 9};

        boolean isHere = false;

        for(int nmb : numbers){
            if(nmb == search){
                isHere = true;
                break;
            }
        }

        if(isHere)
            message(search, " is here!");
        else
            message(search, " is not here :(");
    }

    public static void message(int nmbr, String msg){
        System.out.println(nmbr + msg);
    }
}
