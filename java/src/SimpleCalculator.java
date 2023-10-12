import java.util.*;
public class SimpleCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Simple Calculator");
        System.out.print("Enter First Number: ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();
        System.out.println(" 1 for Addition \n 2 for Substraction \n 3 for Multiplication\n 4 for Division \n 5 for Modulus \n Enter button");
        int button = sc.nextInt();
        switch(button){
            case 1 :
            System.out.println("Addition of a and b: ");
            System.out.println(a+b);
            break;
            case 2 :
            System.out.println("Substraction of a and b: ");
            System.out.println(a-b);
            break;
            case 3:
            System.out.println("Multiplication of a and b: ");
            System.out.println(a*b);
            break;
            case 4:
            System.out.println("Division of a and b: ");
            System.out.println(a/b);
            break;
            case 5:
            System.out.println("Modulus of a and b: ");
            System.out.println(a%b);
            break;
            default:
            System.out.println("Invalid Input, Please Try Again!");
            
        }
    }
    
}
