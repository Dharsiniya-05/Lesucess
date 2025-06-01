import java.util.Scanner;

public class RepeatedString{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = sc.nextInt();  
        int count= 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                count++;
            }
        }

        int repeat = n / s.length();
        int rem = n % s.length();

        int total =repeat*count;aa

        for (int i = 0; i < rem; i++) {
            if (s.charAt(i) == 'a') {
                total++;
            }
        }

        System.out.println(total);
    }
}
