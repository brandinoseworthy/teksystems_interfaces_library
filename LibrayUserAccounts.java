public class LibrayUserAccounts {
    // fields

    protected int age;
    protected String bookType;

    // constructor

    public LibrayUserAccounts(int age, String bookType) {
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
