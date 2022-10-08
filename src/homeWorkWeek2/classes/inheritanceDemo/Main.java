package homeWorkWeek2.classes.inheritanceDemo;

public class Main {
    public static void main(String[] args) {

        OgretmenKrediManager ogr = new OgretmenKrediManager();
        ogr.Hesapla();
        TarimKrediManager trm = new TarimKrediManager();
        trm.Hesapla();

        KrediUI kui = new KrediUI();
        kui.KrediHesapla(ogr);
        kui.KrediHesapla(trm);
        kui.KrediHesapla(new AskerKrediManager());
    }
}
