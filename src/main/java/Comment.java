public class Comment {
    private String comment;
    private int rating;


    //Konstruktør
    public Comment(String comment, int rating) {
        this.comment = comment;
        this.rating = rating;
    }

    public String toString(){
        if (rating == 1) {
        return String.format("""
                %s: %s stjerne
                """, comment, rating);}
        return String.format("""
                %s: %s stjerner
                """, comment, rating);
    }

    public int getRating() {
        return rating;
    }
}
