package homeWorkWeek3.first;

public abstract class BaseCreditManager implements ICreditManager {
    public abstract void Calculate();

    public void Save(){
        System.out.println("kaydedildi");
    }
}
