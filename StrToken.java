import java.util.Scanner;
import java.util.StringTokenizer;

class StrToken {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value:");
        String val = sc.next();
        int sum = 0;
        int num;
        StringTokenizer tk = new StringTokenizer(val, "+");
        System.out.println("Numbers:");
        while(tk.hasMoreTokens()) {
            num = Integer.parseInt(tk.nextToken());
            System.out.println(num);
            sum = sum + num;
        }
        System.out.println("Sum:");
        System.out.println(sum);
    }

}
