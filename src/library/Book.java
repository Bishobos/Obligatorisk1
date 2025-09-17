package library;

/**
 * Book is a class extended from {@link LoanItems}. <br>
 *
 * <strong>Has methods:</strong> <br>
 * {@link #Book(String)}<br>
 * {@link #toString()}
 */
public class Book extends LoanItems {
    /**
     * Constructor for book extended from {@link LoanItems}.
     * @param title Sets the title of the book.
     */
    public Book(String title){
        super(title);
    }

    /**
     *toString overrides the to String method with a different format.
     * @return Formatted string "book\t title"
     */
    @Override
    public String toString(){
        return "Book\t" + this.title;
    }
}
