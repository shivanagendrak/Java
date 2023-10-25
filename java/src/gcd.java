import java.util.*;
public class gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("First Input is: ");
        int a = sc.nextInt();
        System.out.print("Second Input is: ");
        int b = sc.nextInt();
        int gcd = 1;
        int min =(a>b)?b:a;
        for(int i = 1 ; i <=min;i++ ){
            if(a % i == 0 && b%i==0){
                gcd = i;
            }
             //System.out.println(gcd);

        }
        System.out.println("GCD is: "+ gcd);
        int lcm = 1;
        lcm = (a*b)/gcd;
        System.out.println("LCM is :"+lcm);
sc.close();
    }

    
}

