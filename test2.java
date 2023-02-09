public class test2{
        public static void main (String[] args) {

       //nested loop

       //Outer loop
         for (int i = 1; i <= 3; i++) {
             System.out.println("Outer: " + i);

       //Inner loop
         for (int j = 2; j <= 6 ; j++) {
             System.out.println("Inner: " + j);
         }
         }

         String [] cars = {"pride" , "Samand" , "Persia" , "Quick"};
         for (int x = 0; x < cars.length; x++)  {
             System.out.println(cars[x]);
    }
}
}