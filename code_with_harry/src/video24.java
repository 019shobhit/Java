public class video24 {
    public static void main(String[] args) {
        /*
        for (int i=0 ; i<=5 ; i++){
            System.out.print(i);
            System.out.println(" : Shobhit Love Vanshika");
            if (i==2){
                System.out.println("Loop ends");
                break;
            }
        }
         */
        /*
        int i = 0;
        while (i<=5){
            System.out.print(i);
            System.out.println(" : Shobhit Love Vanshika");
            i++;
            if (i==3){
                System.out.println("This loop ends");
                break;
            }
        }
         */

        int i = 0;
        do {i++;
            if(i==3){
                System.out.println("Loop ends");
                continue;
            }
            System.out.print(i);
            System.out.println(" : Shobhit Love Vanshika");

        }while (i<=5);

//        for (int i = 0 ; i<=5 ; i++){
//            if (i==2) {
//                System.out.println("Ending the loop");
//                continue;
//            }
//            System.out.print(i);
//            System.out.println("Shobhit Love Vanshika");
//        }
    }
}
