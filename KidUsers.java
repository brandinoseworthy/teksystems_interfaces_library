public class KidUsers extends LibrayUserAccounts implements LibraryUserI{


    // constructor

    public KidUsers (int age, String bookType){
        super(age, bookType);
    }

    // methods

    @Override
    public String registerAccount() {
        if(age < 12){
            return "You have successfully registered under a Kids Account.";}
        if(age > 12) {
            return "Sorry, Age must be less than 12 to register as a kid";}
        return " ";
    }

    @Override
    public String requestBook() {
        if (bookType.equals("Kids"))
            return "Book Issued successfully, please return the book within 10 days.";
        else
            return  "Oops... you are only allowed to request kids books.";
    }
} // end class
