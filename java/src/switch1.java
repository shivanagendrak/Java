import java.util.*;
public class switch1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        switch(button)
        {
            case 1:
            System.out.println("Apple Juicee");
            break;
            case 2 :
            System.out.println("Mango Juice");
            break;
            case 3:
            System.out.println("Banana Juice");
            break;
            case 4:
            System.out.println("Strawberry Juice");
            break;
            default:
            System.out.println("Invalid Input");
        }
        


     }


}

