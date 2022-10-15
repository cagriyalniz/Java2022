package homeWorkWeek3.two.polimorfizm;

public class EmailLogger extends BaseLog{
    public void log(String message){
        System.out.println("Mail to database: " + message);
    }
}
