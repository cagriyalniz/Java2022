package homeWorkWeek3.two.override;

public class OgretmenKrediManager extends BaseKrediManager{
    public void onayla(double tutar){
        System.out.println(tutar + " degerinde kredi onaylandi");
    }

    //final olduğu için override edilemiyor
/*    public void hesapla(double tutar){
        return tutar*1.3;
    }*/
}
