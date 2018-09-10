import java.util.Scanner;
class Adder {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number1: ");
        int x = sc.nextInt();
        System.out.print("Enter number2: "); 
        int y = sc.nextInt();
        int ans = x+y; 
        System.out.print("Answer: "+ans);
        
    }
}