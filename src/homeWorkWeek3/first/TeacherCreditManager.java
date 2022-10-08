package homeWorkWeek3.first;

public class TeacherCreditManager extends BaseCreditManager implements ICreditManager{
    @Override
    public void Calculate() {
        System.out.println("Ogretmen kredisi hesaplandi");
    }

    public void Save(){
        System.out.println("ogretmen kaydedildi");
    }
}
