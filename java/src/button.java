import java.util.*;
public class button {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        if(button == 1){
            System.out.println("Hello");
        }else if(button == 2){
            System.out.println("Namaste");
        }else if(button == 3 ){
            System.out.println("bonjour");
        }else{
            System.out.println("Try Again Button Not Valid");
        }
        sc.close();
    }
    
}
