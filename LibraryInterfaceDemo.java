import java.sql.SQLOutput;

public class LibraryInterfaceDemo {

    public static void main(String[] args) {

        KidUsers Damon = new KidUsers(10, "Kids");
        KidUsers Kai = new KidUsers(18, "Fiction");

        System.out.printf("Damon's registration message is: %s\n", Damon.registerAccount());
        System.out.printf("Damon's book request message is: %s\n", Damon.requestBook());

        System.out.println("-------------------------------------");

        System.out.printf("Kai's registration message is: %s\n", Kai.registerAccount());
        System.out.printf("Kai's book request message is: %s\n", Kai.requestBook());

        System.out.println("-------------------------------------");
        System.out.println("--------------------------------------");

        AdultUsers Kory = new AdultUsers(5, "Kids");
        AdultUsers Jerrell = new AdultUsers(23, "Fiction");

        System.out.printf("Kory's registration message is: %s\n", Kory.registerAccount());
        System.out.printf("Kory's book request message is: %s\n", Kory.requestBook());

        System.out.println("--------------------------------------");

        System.out.printf("Jerrell's registration message is: %s\n", Jerrell.registerAccount());
        System.out.printf("Jerrell's book request message is: %s\n", Jerrell.requestBook());


    } // end method

} // end class
