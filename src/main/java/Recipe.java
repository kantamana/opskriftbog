import java.util.Arrays;

public class Recipe {
    String title;
    String[] ingredients;
    String procedure;
    boolean vegetarian;
    double rating;
    int numberOfRatings;
    String[] comments;

    public Recipe(String title, String[] ingredients, String procedure, boolean vegetarian) {
        this.title = title;
        this.ingredients = ingredients;
        this.procedure = procedure;
        this.vegetarian = vegetarian;
    }

    @Override
    public String toString() {
        return String.format("""
                Opskrift: %s
                Ingredienser: %s
                Fremgangsmåde: %s
                """, title, Arrays.toString(getIngredients()), procedure);
    }
    public String[] getIngredients(){
        return ingredients;
    }
}
