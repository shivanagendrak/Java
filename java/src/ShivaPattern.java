public class ShivaPattern {
    public static void main(String[] args) {
        /*


 * * * * *
 * 
 * * * * *
         *
 * * * * * 



 */
        
            for (int i = 0 ; i < 3 ; i++){
                for( int j = 0; j < 4 ; j++)
                {
                    if (i == 0 || i == 2 || j == 0)
                  System.out.print("* ");  
                }
                System.out.println("");
            }
            for (int k = 0 ; k < 2 ; k++ ){
                for (int m = 0 ; m < 4; m++){
                    if ( k == 1 || m == 3 ){
                        System.out.print("* " );
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                System.out.println("");
            }
            System.out.println();
                /*     

 *     *
 *     *
 * * * *
 *     *
 *     *
 
 */

         for(int i = 0 ; i <= 4 ; i ++ )
        {
            for(int j = 0 ; j <=3; j++)
            {
                if (i == 2){
                    System.out.print("* ");
                }
                else if (i == 0 && j == 3 ){
                    System.out.print("* ");
                }
                else if (i == 1 && j == 3 ){
                    System.out.print("* ");
                }
                else if (i == 3 && j == 3 ){
                    System.out.print("* ");
                }
                else if (i == 4 && j == 3 ){
                    System.out.print("* ");
                }
                else if (i == 0 && j == 0 ){
                    System.out.print("* ");
                }
                else if (i == 1 && j == 0 ){
                    System.out.print("* ");
                }
                else if (i == 3 && j == 0 || i == 4 && j == 0 ){
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
System.out.println("");

        /*


* * * * * 
    *
    *
    *
* * * * *

 */
   for (int i = 0 ; i <= 4 ; i++ ){
    for(int j = 0 ; j <= 4 ; j++){
        if (i == 1 && j == 0 || i == 1 && j == 1 || i == 1 && j == 3 || i == 1 && j == 4  ){
            System.out.print("  ");
        }
        else if (i == 2 && j == 0 || i == 2 && j == 1 || i == 2 && j == 3 || i == 2 && j == 4 )
        {
            System.out.print("  ");
        }
        else if (i == 3 && j == 0 || i == 3 && j == 1 || i == 3 && j == 3 || i == 3 && j == 4 )
        {
            System.out.print("  ");
        }
        else{
            System.out.print("* ");
        }
        
    }
    System.out.println("");
   }

   System.out.println("");

   /*
   *            *
     *        *
       *    *
          *
    */
    }

    
}
