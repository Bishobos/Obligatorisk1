package library;

public class Video extends LoanItems {
    public Video(String title){
        super(title);
    }

    @Override
    public String toString(){
        return "video   " + this.title;
    }
}
