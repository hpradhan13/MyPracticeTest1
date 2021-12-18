public class Palindrom_num {

    int sum = 0;
    int temp;

    public void isPalindrom(int i) {
        temp = i;
        while (i > 0) {
            int r = i % 10;
            sum = sum * 10 + r;
            i = i / 10;
        }

        if (temp == sum) {
            System.out.println("Number entered is Palindrom");
        }else
            System.out.println("Number is NOT Palindrom");
    }

    public static void main(String[] args) {
        Palindrom_num p = new Palindrom_num();
        p.isPalindrom(123454321);
    }
}
