package homeWorkWeek3.two.polimorfizm;

public class Main {
    public static void main(String[] args) {
        //EmailLogger logger = new EmailLogger();
        //logger.Log("email log mesajı");

        BaseLog[] loggers = new BaseLog[] {new FileLogger(), new EmailLogger(), new DataBaseLogger(), new ConsolLogger()};
        for(BaseLog lo:loggers){
            lo.log("log mesaji");
        }

        CustomerManager custMan = new CustomerManager(new DataBaseLogger());
        custMan.add();
    }
}
