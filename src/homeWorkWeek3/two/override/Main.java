package homeWorkWeek3.two.override;

public class Main {
    public static void main(String[] args) {
        BaseKrediManager []kar = new BaseKrediManager[]{new OgrenciKrediManager(), new OgretmenKrediManager()};

        for(BaseKrediManager bk: kar){
            bk.onayla();
        }
    }
}
