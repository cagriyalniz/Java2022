package homeWorks;

public class Vowels {

    private static void check(char ch, char[] vowels){
        for(char c : vowels){
            if(c == ch){
                System.out.println("yes");
                return ;
            }
        }
        System.out.println("not");
    }

    public static void main(String[] args) {
        char[] kalinV = {'a', 'ı', 'o', 'u'};
        char[] inceV = {'e', 'i', 'ö', 'ü'};
        char vowOne = 'o';
        char vowTwo = 'ü';
        char vowThree = 'g';

        check(vowOne, inceV);
        check(vowOne, kalinV);
        check(vowTwo, inceV);
        check(vowTwo, kalinV);
        check(vowThree, inceV);
        check(vowThree, kalinV);


    }
}
