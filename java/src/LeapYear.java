import java.util.*;
public class LeapYear {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int year = sc.nextInt();
    if(year%4==0){
    if(year%100==0){
        if(year%400==0){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
    else{
        System.out.println(false);
    }
    }else{
        System.out.println(false);
    }
    sc.close();
    }
    
}

