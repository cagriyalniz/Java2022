package homeWorkWeek3.two.interfaceEx;

public class OracleCustomerDal implements ICustomerDal{
    @Override
    public void add() {
        System.out.println("Oracle Db added");
    }
}
