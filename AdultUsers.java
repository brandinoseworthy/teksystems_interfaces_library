public class AdultUsers extends LibrayUserAccounts implements LibraryUserI {

 // constructors

   public AdultUsers(int age, String bookType){
       super(age, bookType);
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
        if (bookType.equals("FIction"))
            return "Book Issued successfully, please return the book within 7 days.";
        else
            return  "Oops... you are only allowed to request adult Fiction books.";
    }
} // end class
