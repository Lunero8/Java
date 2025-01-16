public class main {
      public static void main (String[] args) {
            // Output
            System.out.print ("Hello World\n") ;
            System.out.println ("Hello World") ; // execute with nextline

            System.out.println (4+3) ;

            // Variable
            int a = 5 ;
            int b ;
            b = 8 ;

            System.out.println (a) ;
            System.out.println (b) ;
            System.out.println (a+b) ;
            System.out.println ("Value of a = " + a + " and value of b = " + b ) ;

            // Data types
            //Primitive types
            /*
                  byte - 1 [-128 to 127]
                  short - 2 
                  int - 4
                  long - 8 (L)
                  float - 4 (F)
                  double - 8
                  char - 2
                  boolean - 1 [true/false]
            */
            byte age = 30 ;
            System.out.println (age) ;
            int number = 1234567890 ;
            System.out.println (number) ;
            long number2 = 12345678900L ;
            System.out.println (number2) ;
            float pi = 3.14F ;
            System.out.println (pi) ;
            char letter = '@' ;
            System.out.println (letter) ;
            boolean ok = true ;
            System.out.println (ok) ;

            // Non-primitive types
            // there are different types of functions and method for non primitive types data
            // String
            String name ;
            name = "Sayem" ;
            System.out.println (name) ;
            String name2 = new String ("Sayem") ;
            System.out.println (name2) ;
            String name3 = name+name2 ;
            System.out.println (name3) ; 
            name3 = name + " and " + name2 ;
            System.out.println (name3) ;

            // functions and method for String
            // Length
            System.out.println (name.length()) ;
            int size ;
            size = name.length() ;
            System.out.println (size) ;
            // View index-wise charecters
            System.out.println (name.charAt(0)) ;
            char ch = name.charAt(0) ;
            System.out.println (ch) ;
            String s = String.valueOf(name.charAt(0)) ;
            System.out.println (s) ;
            // Replace specific charecter 
            name.replace('a', 'A') ;
            System.out.println (name) ;
            System.out.println (name.replace('a', 'A')) ;
            System.out.println (name) ;
            String newname = new String (name.replace('a', 'A')) ;
            System.out.println (newname) ;
            System.out.println (name) ;

            /*
            name = newname ;
            System.out.println (name) ;
            name = name+newname ;
            System.out.println (name) ;
            */

            // Sub-String
            // first index included , second index excluded
            System.out.println (name.substring(0,3)) ;
            String subname = new String (name.substring(3,5)) ;
            System.out.println (subname) ;

      }
}