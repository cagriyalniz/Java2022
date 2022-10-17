package homeWorkWeek3.two.abstractClass;

public class Main {
    public static void main(String[] args) {
        GameCalculator []gar = new GameCalculator[]{new ManCalculator(), new WomanCalculator()};
        for (GameCalculator ar: gar){
            ar.hesapla();
            ar.finish();
        }
    }
}
