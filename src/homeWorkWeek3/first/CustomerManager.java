package homeWorkWeek3.first;

public class CustomerManager {

    private Customer _customer;
    private ICreditManager _creditManager;
    public CustomerManager(Customer customer, ICreditManager creditManager){
        _customer = customer;
        _creditManager = creditManager;
        System.out.println("constructer for customer manager");
    }

    public void Save(){
        System.out.println("Musteri kaydedildi: " );
    }

    public void Delete(){
        System.out.println("Musteri silindi: " );
    }

    public void GiveCredit(){
        _creditManager.Calculate();
        System.out.println("kredi hesaplandi");
    }
}
