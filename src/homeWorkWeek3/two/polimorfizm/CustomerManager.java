package homeWorkWeek3.two.polimorfizm;

public class CustomerManager {
    private BaseLog logger;

    public CustomerManager(BaseLog logger){
        this.logger = logger;
    }
    public void add(){
        System.out.println("Musteri eklendi");
        //DataBaseLogger logger = new DataBaseLogger();
        //logger.Log("log mesaji");
        this.logger.log("log mesaji");
    }
}
