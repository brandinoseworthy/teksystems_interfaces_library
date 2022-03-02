public class LibrayUserAccounts {
    // fields
    protected String name;
    protected int age;
    protected String bookType;

    // constructor

    public LibrayUserAccounts(String name, int age, String bookType) {
       this.name = name;
        this.age = age;
        this.bookType = bookType;
    }





    // getters and setters
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }
}
