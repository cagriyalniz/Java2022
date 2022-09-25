package homeWorkWeek2.classes.reCapDemo1;

public class DortIslem {
    public int Topla(int s1, int s2){
        return s1 + s2;
    }
    public int Cikar(int s1, int s2){
        return s1 - s2;
    }
    public int Carp(int s1, int s2){
        return s1*s2;
    }
    public int Bolme(int s1, int s2){
        if(s2 != 0)
            return s1/s2;
        else{
            System.out.println("sayi sifira bolunmez");
            return 0;
        }
    }
}
