package homeWorkWeek2.classes.fieldAttiribute;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.name = "laptop";
        System.out.println(product.name);
        product.id = 1;
        product.description = "ikinci el";
        product.price = 15000;
        product.stock = 18;

        ProductManager pm = new ProductManager();
        pm.Add(product);
    }
}
