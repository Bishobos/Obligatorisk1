package library;

/**
 * LoanItem is a superclass of items.<br>
 * <strong>Has the attribute:</strong>
 * {@link LoanItems#title}<br>
 * <strong>Has methods:</strong><br>
 * {@link #LoanItems}<br>
 * {@link #LoanItems(String)}<br>
 * {@link #toString}
 */

public class LoanItems {
    /**
     * Title of the Item
     */
    String title;

    /**
     * A default constructor for LoanItems. Is not used.
     */
    public LoanItems(){
        this.title = "title";
    }

    /**
     * Another constructor for LoanItems.
     * @param title Sets the title of the item.
     */
    public LoanItems(String title){
        this.title = title;
    }

    /**
     * toString overrides the to String method with a different format.
     * @return Formatted String containing type and title.
     */
    @Override
    public String toString(){
        return "Type\t" + this.title;
    }
}
