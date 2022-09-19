package homeWorks;

public class StringsPartTwo {
    public static void main(String[] args) {
        String mesaj = " Bugün hava çok güzel  ";

        System.out.println(mesaj.replace((char) 32,'~'));
        String yeniMesaj = mesaj.replace((char) 32,'~');
        System.out.println(mesaj.substring(2, 6));
        for(String kelime : mesaj.split(" ")){
            System.out.println(kelime);
        }
        System.out.println(mesaj.trim());
    }
}
