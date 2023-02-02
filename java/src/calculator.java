import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number:");
        int a = sc.nextInt();
        System.out.println("Enter the Second Number:");
        int b = sc.nextInt();
        System.out.println("Welcome to Calculator\nOptions:\n1.Addition\n2.Substraction\n3.Multiplication\n4.Division\n5.Modulo\n6.Power");
        System.out.println("Enter the Option you want:");
        int c = sc.nextInt();
        
        switch(c){
            case 1:System.out.println("The Addition of Two Numbers:"+(a+b));
            break;
            case 2:System.out.println("The Substraction of two Numbers:"+(a-b));
            break;
            case 3:System.out.println("The Multiplication of Two Numbers:"+(a*b));
            break;
            case 4:if(b==0){
                System.out.println("Invalid Division");
            }else{
                System.out.println("The Division of Two Numbers:"+(a/b));

            }
            break;
            case 5:if(b==0){
                System.out.println("Invalid Modulo or Remainder");
            }else{
                System.out.println("The Remainder of Two Numbers:"+(a%b));
            }
            break;
            case 6:System.out.println("The Power of Two Numbers: "+Math.pow(a,b));
            break;
            default:System.out.println("Invalid Option");
            System.out.println("THANK YOU");
        }
        sc.close();
        
    }

    
}
