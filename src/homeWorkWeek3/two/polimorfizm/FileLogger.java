package homeWorkWeek3.two.polimorfizm;

public class FileLogger extends BaseLog{
    public void log(String message){
        System.out.println("File to database: " + message);
    }
}
