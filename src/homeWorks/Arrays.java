package homeWorks;

public class Arrays {
    public static void main(String[] args) {

        String[] ogrenciler = new String[3];
        ogrenciler[1] = "cagri";
        ogrenciler[2] = "cagri2";
        ogrenciler[3] = "cagri3";

        for(int i = 0; i< ogrenciler.length; i++){
            System.out.println(ogrenciler[i]);
        }

        for(String ogreci:ogrenciler){
            System.out.println(ogreci);
        }
    }
}
