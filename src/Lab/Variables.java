package Lab;

public class Variables {
   static int x = 0;
   static int y = 0;
   // if there is a static method we have to use static variables
   static int add(){
       return x+y;
   }

   static int multiply(){
       return x*y;
   }

   Variables(int x, int y){
       Variables.x = x;
       Variables.y = y;
   }




}
