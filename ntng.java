import java.util.*;
public class ntng
{
     public static void main(String args[]);
       {
          Scanner sc = new Scanner(System.in);
          System.out.println("********** Menu **********");
          System.out.println("     1 : Find area        ");
          System.out.println("     2 : Find volume      ");
          System.out.println();
          System.out.println("  Enter ur choice 1 / 2   ");
          int c = sc.nextInt();
          switch(c)
           {    
               case 1:
                         System.out.println("Enter radius");
                         int r = sc.nextInt();
                         double l = 3.14*r*r;
                         System.out.println(l);
                         break;
               case 2:
                         System.out.println("Enter radius");
                         int ra = sc.nextInt();
                         System.out.println("Enter height");
                         int h = sc.nextInt();
                         double v = 3.14 * ra * ra * h ;
                         System.out.println(v);
                         break;
              default:
                         System.out.println(" Invalid Option ");
           }
        sc.close();
       }
}
