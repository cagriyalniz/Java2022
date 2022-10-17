package homeWorkWeek3.two.abstractClass.demo;

public class Main {
    public static void main(String[] args) {
//        OracleDbManager odbMngr = new OracleDbManager(); sıkıntılı

        CustomerManager cMan = new CustomerManager();
        cMan.dBMngr = new OracleDbManager();//strategy pattern
        cMan.getCustomer();
        cMan.dBMngr = new SqlDbManager();//strategy pattern
        cMan.getCustomer();
    }
}
