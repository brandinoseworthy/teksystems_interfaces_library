public class AdultUsers extends LibrayUserAccounts implements LibraryUserI {

    // constructors

   public AdultUsers(String name, int age, String bookType){
       super(name, age, bookType);
   }

    // methods

    @Override
    public String registerAccount() {
        if (age > 12) {
            return "You have successfully registered under an Adult Account.";
        }
        if (age < 12) {
            return "Sorry, Age must be greater than 12 to register as an adult";
        }
        return " ";
    }

    @Override
    public String requestBook() {
        if (bookType.equals("Fiction")) {
            return "Book Issued successfully, please return the book within 7 days.";
        }
        else
            return  "Oops... you are only allowed to request adult Fiction books.";
    }

    @Override
    public void registerAccount2() {
        if (age > 12) {
            System.out.println("You have successfully registered under an Adult Account.");
        }
        if (age < 12) {
            System.out.println("Sorry, Age must be greater than 12 to register as an adult");
        }
    }

    @Override
    public void requestBook2() {
        if (bookType.equals("Fiction")) {
            System.out.println( "Book Issued successfully, please return the book within 7 days.");
        }
        else
            System.out.println("Oops... you are only allowed to request adult Fiction books.");

    }

} // end class
