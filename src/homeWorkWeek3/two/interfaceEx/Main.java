package homeWorkWeek3.two.interfaceEx;

public class Main {
    public static void main(String[] args) {
        ICustomerDal cDal = new MySqlCustomerDal();
        cDal.add();
    }
}
