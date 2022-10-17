package homeWorkWeek3.two.innerClassAndStatic;

public class Main {
    public static void main(String[] args) {
        ProductManager pM = new ProductManager();
        Product pdct = new Product();
        pdct.name = "computer";
        pdct.price = 10000;
        pdct.id = 1;

        pM.add(pdct);

    }
}
