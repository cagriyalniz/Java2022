package homeWorks;

public class SwitchDemo {
    public static void main(String[] args) {
        char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("mükemmel geçtiniz");
                break;
            case 'B':
            case 'C':
                System.out.println("geçtiniz");
                break;
            case 'D':
                System.out.println("son anda geçtiniz");
                break;
            case 'F':
                System.out.println("kaldınız");
                break;
            default:
                System.out.println("hatali not girişi!");
        }
    }
}
