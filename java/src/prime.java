import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        
        int flag= 0;
        for(int i = 2; i<number;i++){
            if(number%i==0){
            flag = 1;
            }
            
            
            
        }
        if (flag == 0){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
    }
    
}
