
/*
 1
 23
 456
 78910
 */

public class floydtriangle {
    public static void main(String[] args) {
        int number = 2;
        for(int i = 0 ; i <=4;i++ ){
            for(int j = 0 ; j<=i;j++){
                System.out.print(number+" ");
                number=number+2;
            }
            System.out.println("");
        }
        
    }
    
}
