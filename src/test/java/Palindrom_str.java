public class Palindrom_str {

    public  boolean palindrom(String str) {
        int i = 0;
        int j = str.length() - 1;

        while (i < j) {

            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }

        return true;
    }
public static void main (String[] args){
        Palindrom_str p=new Palindrom_str();
        System.out.println(p.palindrom("ABB"));
}
}
