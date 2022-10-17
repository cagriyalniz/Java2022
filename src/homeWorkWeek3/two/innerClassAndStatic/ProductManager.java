package homeWorkWeek3.two.innerClassAndStatic;

public class ProductManager {
    public void add(Product pd){
/*        ProductValidator val = new ProductValidator();
        if(val.isValid(pd))
            System.out.println("eklendi");
        else
            System.out.println("eklenemedi, urun bilgileri yetersiz");*/
        if(ProductValidator.isValid(pd))
            System.out.println("eklendi");
        else
            System.out.println("eklenemedi, urun bilgileri yetersiz");

    }
}
