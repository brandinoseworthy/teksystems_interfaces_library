import java.sql.SQLOutput;

public class LibraryInterfaceDemo {

    public static void main(String[] args) {

        KidUsers kid1 = new KidUsers("Damon", 10, "Kids");
        KidUsers kid2 = new KidUsers("Kai", 18, "Fiction");

        kid1.registerAccount2();
        kid1.requestBook2();
        System.out.println("---");
        kid2.registerAccount2();
        kid2.requestBook2();
        System.out.println("---");


//        System.out.printf("%s registration message is: %s\n", kid1.name, kid1.registerAccount());
//        System.out.printf("%s book request message is: %s\n", kid1.name, kid1.requestBook());

//        System.out.println("-------------------------------------");
//
////        System.out.printf("%s registration message is: %s\n", kid2.name, kid2.registerAccount());
////        System.out.printf("%s book request message is: %s\n", kid2.name, kid2.requestBook());
//
//        System.out.println("-------------------------------------");
//        System.out.println("--------------------------------------");

        AdultUsers adult1 = new AdultUsers("Kory",5, "Kids");
        AdultUsers adult2 = new AdultUsers("Jerrell",23, "Fiction");

        adult1.registerAccount2();
        adult1.requestBook2();
        System.out.println("---");
        adult2.registerAccount2();
        adult2.requestBook2();

//        System.out.printf("%s registration message is: %s\n", adult1.name, adult1.registerAccount());
//        System.out.printf("%s book request message is: %s\n", adult1.name, adult1.requestBook());

//        System.out.println("--------------------------------------");

//        System.out.printf("%s registration message is: %s\n", adult2.name, adult2.registerAccount());
//        System.out.printf("%s book request message is: %s\n", adult2.name, adult2.requestBook());


    } // end method

} // end class
