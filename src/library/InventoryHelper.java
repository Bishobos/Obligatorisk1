package library;

/**
 * InvetoryHelper registers and shows items in inventory.
 * This makes Use of {@link InputHelper} to request user inputs. <br>
 *
 *<strong>Has methods:</strong><br>
 * {@link #makeInventory()} which registers an inventory.<br>
 * {@link #showInventory(LoanItems[])} which shows an inventory.
 */

public class InventoryHelper {
    //Makes an object of type InputHelper
    InputHelper helper = new InputHelper();

    /**
     * Make inventory prompts the user to register inventory items using {@link InventoryHelper}.
     * @return array of objects of types {@link Book} and {@link Video}.
     */
    public LoanItems[] makeInventory(){
        LoanItems[] items = new LoanItems[helper.userInputInt()];

        int i = 0;
        while (i < items.length){
            System.out.println("ITEM no. " + (i+1));
            //ask for type
            String type = helper.userInputType();
            //ask for title
            String title = helper.userInputTitle();

            if (type.equalsIgnoreCase("Book")){
                items[i] = new Book(title);
            }if (type.equalsIgnoreCase("Video")){
                items[i] = new Video(title);
            }
            i++;
        }
        System.out.println("You have registered " + items.length + " items.");
        return items;
    }

    /**
     * showInventory prints an input inventory array using the items' own toString method.
     * @param items an array of {@link Book} and/or {@link Video}
     */
    public void showInventory(LoanItems[] items){
        System.out.println("LIST OF LOAN ITEMS:\n" +
                "-------------------\n" +
                "ID  TYPE\tTITLE");
        for (int i = 0; i < items.length; i++) {
            System.out.println((i+1) + "\t" + items[i]);
        }

    }
}
