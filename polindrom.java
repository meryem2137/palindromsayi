public class polindrom{
    static boolean ispolindrom(int number){
        int sayi = number, reversenumber = 0, sonbasamak;
        while(sayi!=0) {

            sonbasamak = sayi % 10;
            reversenumber = (reversenumber * 10) + sonbasamak;
            sayi /= 10;
        }if(reversenumber==number) {
            return true;
        }else {
            return false;}
    }


    public static void main(String[] args) {
       System.out.print(ispolindrom(255));












        }}




















//www.patika.dev



































































