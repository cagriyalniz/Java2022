package homeWorks;

public class ReCapDemo1 {
    public static void main(String[] args) {
        int sayi1 = 20;
        int sayi2 = 25;
        int sayi3 = 3;
        //find max
        int max = sayi1;
        if(sayi2 > sayi1){
            max = sayi2;
        }
        if(sayi3 > sayi2){
            max = sayi3;
        }
        System.out.println(max);
    }
}
