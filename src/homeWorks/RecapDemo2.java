package homeWorks;
//Arrays
public class RecapDemo2 {
    public static void main(String[] args) {

        double[] myList = {1.2, 1.3, 4.5, 6.3};
        int total = 0;
        double max = myList[0];
        for(double nmbr:myList){
            total += nmbr;
            if(nmbr > max)
                max = nmbr;
        }
        System.out.println("total: " + total + " max " + max);
    }
}
