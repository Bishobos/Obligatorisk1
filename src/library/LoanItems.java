package library;

public class LoanItems {
    String title;

    public LoanItems(){
        this.title = "title";
    }
    public LoanItems(String title){
        this.title = title;
    }

    @Override
    public String toString(){
        return "Type\t" + this.title;
    }
}
