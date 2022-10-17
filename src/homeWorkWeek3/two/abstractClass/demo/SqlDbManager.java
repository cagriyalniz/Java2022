package homeWorkWeek3.two.abstractClass.demo;

public class SqlDbManager extends BaseDbManager{
    @Override
    public void getData() {
        System.out.println("SQL'e eklendi");
    }
}
