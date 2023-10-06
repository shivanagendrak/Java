import java.util.*;
public class adult {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you Age");
        int Age = sc.nextInt();
        if (Age > 100){
            System.out.println("Invalid Input");
        }
        else if (Age > 18) {

            System.out.println("Adult");

        }
        else{
            System.out.println("Not Adult");
        }

    }
    
}
