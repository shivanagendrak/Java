import java.util.*;
public class SumofNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1 ; i <=n;i++){
            System.out.print(i+"+");
            sum = sum + i;
        }
        System.out.println();
        System.out.println("Total Sum of n Natural Numbers:"+sum);
    }
    
}
