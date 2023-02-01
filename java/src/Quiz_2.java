import java.util.*;//For Scanner Function we have to import the utils
public class Quiz_2 {
    public static void main(String[] args)
    {
        //This Function is used for  Input Function in Java (Scanner)
        Scanner sc = new Scanner(System.in);
            String Name = sc.next();
            //When we use only next function it takes only one token of its datatype
            System.out.println(Name);
            String name2 = sc.nextLine();
            // For Whole String we have to use nextLine()
            //For Interget Values  = nextInt();
            //For Double Values = nextDouble();
            //For Float values = nextFloat();
            System.out.println(name2);
            sc.close(); 
    }
   
}
