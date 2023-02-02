import java.util.*;
public class OddEven{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the Number:");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("This Number is:" +num);
        }else{
            System.out.println("This Number is:" +num);
        }
        sc.close();
    }
}