package homeWorkWeek2;

public class MetothWithParam {
    public static void main(String[] args) {
        String msg = "hello everyone!";
        int total = 0;
        msg.substring(2,msg.length());

        String newMsg = msg.substring(2,msg.length());
        total = sum(7, 3);
    }

    public  static void add(){
        System.out.println("added");
    }

    public  static void delete(){
        System.out.println("deleted");
    }

    public  static void update(){
        System.out.println("updated");
    }

    public static int sum(int nmb1, int nmb2){
        return nmb1 + nmb2;
    }
}
