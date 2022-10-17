package homeWorkWeek3.two.interfaceEx;

public class Main {
    public static void main(String[] args) {
        ICustomerDal cDal = new MySqlCustomerDal();
        cDal.add();

        //CustomerManager cM = new CustomerManager();
        //cM.customerDal = new MySqlCustomerDal();
        //cM.add();

        CustomerManager cM = new CustomerManager(new OracleCustomerDal());
        cM.add();
    }
}
