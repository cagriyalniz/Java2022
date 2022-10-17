package homeWorkWeek3.two.interfaceEx;

public class MySqlCustomerDal implements ICustomerDal{

    @Override
    public void add() {
        System.out.println("My SQL db added");
    }
}
