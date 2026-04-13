import java.util.Scanner;

public class SuperDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int k = sc.nextInt();
        sc.close();

        long sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        sum *= k;

        while (sum > 9) {
            long temp = 0;
            while (sum > 0) {
                temp += sum % 10;
                sum /= 10;
            }
            sum = temp;
        }
        System.out.println(sum);
    }
   
        
    
}
