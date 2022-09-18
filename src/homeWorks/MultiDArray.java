package homeWorks;

public class MultiDArray {
    public static void main(String[] args) {
        String[][] sehirler = new String[2][2];
        sehirler[0][0] = "istanbul";
        sehirler[0][1] = "kocaeli";
        sehirler[1][0] = "artvin";
        sehirler[1][1] = "rize";

        for(int i = 0; i <= 1; i++){
            System.out.println("***********************");
            for(int j = 0; j <= 1; j++){
                System.out.println(sehirler[i][j]);
            }
        }
    }
}
