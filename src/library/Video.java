package library;

/**
 * Book is a class extended from {@link LoanItems}. <br>
 *
 * <strong>Has methods:</strong> <br>
 * {@link #Video(String)}<br>
 * {@link #toString()}
 */
public class Video extends LoanItems {
    /**
     * Constructor for book extended from {@link LoanItems}.
     * @param title Sets the title of the video.
     */
    public Video(String title){
        super(title);
    }

    /**
     *toString overrides the to String method with a different format.
     * @return Formatted string "Video\t title"
     */
    @Override
    public String toString(){
        return "Video   " + this.title;
    }
}
