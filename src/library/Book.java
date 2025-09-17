package library;

public class Book extends LoanItems {
    public Book(String title){
        super(title);
    }

    @Override
    public String toString(){
        return "Book\t" + this.title;
    }
}
