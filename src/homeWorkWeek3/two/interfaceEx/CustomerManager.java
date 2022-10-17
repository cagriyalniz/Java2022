package homeWorkWeek3.two.interfaceEx;

public class CustomerManager {
    private ICustomerDal customerDal;

    public CustomerManager(ICustomerDal ICustDal){
        this.customerDal = ICustDal;
    }
    public void add(){
        //customerDal.add();
        customerDal.add();
    }
}
