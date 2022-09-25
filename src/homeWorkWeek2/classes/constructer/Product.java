package homeWorkWeek2.classes.constructer;

public class Product {
    public int id;
    public String name;
    private String code;

    public Product(int id, String name) {
        this.id = id;
        this.name = name;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        char[] c;
        String code;
        c = this.name.toCharArray();
        code = c[0] + String.valueOf(this.getId());
        return code;
    }


}
