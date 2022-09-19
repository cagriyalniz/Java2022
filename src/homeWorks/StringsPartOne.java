package homeWorks;

public class StringsPartOne {
    public static void main(String[] args) {
        String mesaj = "bugün hava cool!";

        System.out.println(mesaj);
        System.out.println("eleman sayisi: " + mesaj.length());
        System.out.println("5. eleman: " + mesaj.charAt(4));
        System.out.println(mesaj.concat("Brrrrrr"));
        System.out.println(mesaj.startsWith("b"));
        if (mesaj.endsWith("!") == true)
                System.out.println(mesaj.charAt(mesaj.length() -1));
        
        char[] karakterler = new char[5];
        mesaj.getChars(0,5,karakterler,0);
        System.out.println(karakterler);

        System.out.println(mesaj.indexOf("av"));
        System.out.println(mesaj.lastIndexOf("o"));
    }
}
