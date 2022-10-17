package homeWorkWeek3.two.innerClassAndStatic;

public class ProductValidator {
    public static boolean isValid(Product pd){
        if(pd.price > 0 && !pd.name.isEmpty())
            return true;
        else
            return false;
    }

    public static class AnotherClass{
        public static void delete(){
            System.out.println("delete funct in AnotherClass class");
        }
    }
}
