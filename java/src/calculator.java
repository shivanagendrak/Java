import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number:");
        int a = sc.nextInt();
        System.out.println("Enter the Second Number:");
        int b = sc.nextInt();
        System.out.println("Welcome to Calculator\nOptions:\n1.Addition\n2.Substraction\n3.Division\n4.Multiplication");
        System.out.println("Enter the Option you want:");
        int c = sc.nextInt();
        
        switch(c){
            case 1:System.out.println("The Addition of Two Numbers:"+(a+b));
            break;
            case 2:System.out.println("The Substraction of two Numbers:"+(a-b));
            break;
        }
        sc.close();
        
    }

    
}
