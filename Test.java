public class Test {
    public static void main (String[] args) {
        int x = 80;
    System.out.println(x);
    //Esm
        String firstname = "Mohammad Mahdi";
                String lastname = " Rajabzadeh";
                String fullname = firstname + lastname;
                System.out.println (fullname);

 //Jam sade
        String myText = "Mathtime Easy";
        int s = 4444 + 2323;
        int o = 5;
        int y = 16;
        System.out.println(o + y);
        System.out.println(myText);
        System.out.println(s);

//jam pichide
        String myText2 = "Mathtime Hard";
        char LVL1 = 'A';
        int sum1 = 145 + 200;
        char LVL2 = 'B';
        int sum2 = sum1 + 500;
        char LVL3 = 'C';
        int sum3 = sum2 + sum1;
        System.out.println(myText2);
         System.out.println(LVL1);
           System.out.println(sum1);
            System.out.println(LVL2);
             System.out.println(sum2);
              System.out.println(LVL3);
                System.out.println(sum3);

        int myInt = 9;
        double  myDouble = myInt;
                System.out.println(myInt);
                    System.out.println(myDouble);

        double myDouble2 = 9.16d;
        int myInt2 = (int) myDouble2;
            System.out.println(myDouble2);
                System.out.println(myInt2);

        // Test java switch

        int day = 5;
         switch (day) {
             case 1:
                 System.out.println("Shanbe");
                 break;
             case 2:
                 System.out.println("Yekshanbe");
                 break;
             case 3:
                 System.out.println("Doshanbe");
                 break;
             default:
                 System.out.println("Dari Eshtebah mizani");
         }

         //test if..else
        int xo = 60;
        int yo = 20;
        if (xo > yo) {
            System.out.println("Halet Chetore?");
        } else if (xo < 80) {
            System.out.println("Gomsho");
        } else {
            System.out.println("Bye");


        }

        int j = 20;
          while ( j < 60) {
              System.out.println(j);
              j++;
          }
 }
}