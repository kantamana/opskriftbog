import java.util.Arrays;


public class Recipe {
    String title;
    String[] ingredients;
    String procedure;
    boolean vegetarian;
    String dishType;
    double rating;
    int numberOfRatings;
    Comment[] comments;

    public Recipe(String title, String[] ingredients, String procedure, boolean vegetarian, String dishType) {
        this.title = title;
        this.ingredients = ingredients;
        this.procedure = procedure;
        this.vegetarian = vegetarian;
        this.dishType = dishType;
    }

    @Override
    public String toString() {
        String kommentarer = "";

        if (comments != null) {
        for (Comment comment : comments) {
            kommentarer = kommentarer + "\n" + comment;
        }}
        boolean ratingUnlocked = false;


        if (getNumberOfRatings() > 50) {
            ratingUnlocked = true;
        }

        return String.format("""
                Opskrift: %s
                Rating: %s
                Ingredienser: %s
                Fremgangsmåde: %s
                Vegetarisk? %s
                Typeret: %s
                
                Kommentarer: %s
                """, title, ratingUnlocked ? getRating() : "((under 50 ratings))", Arrays.toString(getIngredients()),
                procedure, vegetarian ? "Ja" : "Nej", dishType, kommentarer);
    }
    public String[] getIngredients(){
        return ingredients;
    }
    public String getDishType(){
        return dishType;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getNumberOfRatings() {
        return numberOfRatings;
    }

    public void setNumberOfRatings(int numberOfRatings) {
        this.numberOfRatings = numberOfRatings;
    }

    public void addComment(Comment comment) {
        Comment[] newCommentList = new Comment[getNumberOfRatings() + 1];

        for (int i = 0; i < getNumberOfRatings(); i++) {
            newCommentList[i] = comments[i];
        }
        newCommentList[newCommentList.length - 1] = comment;
        comments = newCommentList;
        setNumberOfRatings(numberOfRatings + 1);
        updateRating();
    }

    public void updateRating(){
        double sum = 0;
        for (int i = 0; i < getNumberOfRatings(); i++) {
            sum += comments[i].getRating();
        }
        double mean = sum / getNumberOfRatings();
        this.rating = (double) Math.round(mean * 100)/100;
    }

}
