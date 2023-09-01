
import java.util.Scanner;


public class Main
{
    public static void main(String[] args)  {
        
        // 1 a 
        if(6<6*5)
            System.out.println("Hello");
            System.out.println(" There");
            
        // Respuesta: Hello
        // there 
        
        /* 1 b*/
        
        int x=1, y=2, z=3;
        
        if(x>y)
        if(x<z)
            System.out.println("1111");
        else
            System.out.println("2222");
        //Respuesta: no imprime nada
        
        /**1 c*/
        
        int x=1, y=2, z=3;
        
        if(x < z)
            System.out.println("*");
        else if (x == z)
            System.out.println("&");
        else
            System.out.println("$");
            
        //Respuesta: *

        /**1 d*/
        
        int x=1, y=2, z=3;
        
        if(x<y)
            System.out.println("####");
        else
            System.out.println("&&&&");
            System.out.println("****");
        // Respuesta:  ####
       	   ****

        /**1 e*/
        
        int x=1, y=2, z=3;
        
        if(x>y)
            System.out.println("####");
        else {
            System.out.println("&&&&");
            System.out.println("****");
        }
        
        // Respuesta: &&&&
        ****

        /**1 f*/
        
        int a1=100; int a2=200;
        
        if(a1>100 && a2<=200)
            System.out.print(a1+" "+a2+" "+(a1+a2));
        else 
            System.out.print(a1+" "+a2+" "+(2*a1-a2));
            
        //Respuesta: 100 200 0

        /**1 g*/
        
        int x=1, y=2, z=3;
        
        if(++x > y++ || x-- > 0)
            z++;
        else
            z--;
        System.out.println(x+" "+y+" "+z);
        
        //Respuesta: 1 2 4

        /**1 h*/
        
        int x=1, y=2, z=3;
        
        if(x<y){
            System.out.println("####");
            System.out.println("****");
    }
        else
            System.out.println("&&&&");
            
        //Respuesta: ####
        ****

        /**1 h*/
        
        int x=1, y=2, z=3;
        
        if ('x' > 'y' || 66 > (int)('A'))
            System.out.println("#*#");
        
        //Respuesta: #*#

        /**1 i*/
        
        int x=1, y=2, z=3;
        
        if(x < z)
            System.out.println("*");
        else if (x==z)
            System.out.println("&");
        else
            System.out.println("$");
            
        //Respuesta: *

  }
}
