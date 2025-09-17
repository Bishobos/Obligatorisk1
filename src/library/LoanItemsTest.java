package library;

/**
 * LoanItemTest contains our main method and hence runs the program.
 * <strong>Has Methods</strong><br>
 * {@link #main(String[])}<br>
 * {@link #mainWrapper()}
 */

public class LoanItemsTest {
    /**
     * main is the main string and runs the program.
     * @param args
     */
    public static void main(String[] args){
        mainWrapper();
    }

    /**
     * mainWrapper contains all the valid code and exists to keep {@link #main(String[])} as empty as possible.
     */
    public static void mainWrapper(){
        InventoryHelper helper = new InventoryHelper();
        LoanItems[] items = helper.makeInventory();
        helper.showInventory(items);
    }
}
