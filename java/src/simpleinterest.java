import java.util.*;
public class simpleinterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Priciple Amount: ");
         float principle = sc.nextFloat();
         System.out.print("Enter Rate of Interest(%): ");
         float ROI = sc.nextFloat();
         System.out.print("Enter Time(Years): ");
         float time = sc.nextFloat();
         float SI;
         SI = (principle*ROI*time)/100;
         System.out.println("Your Simple Interest: "+SI);
         System.out.println("The Total You have to Pay($): "+(SI+principle));

    }
    
}
