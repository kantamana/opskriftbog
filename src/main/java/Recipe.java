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
        return String.format("""
                Opskrift: %s
                Ingredienser: %s
                Fremgangsmåde: %s
                Typeret: %s
                """, title, Arrays.toString(getIngredients()), procedure, dishType);
    }
    public String[] getIngredients(){
        return ingredients;
    }
    public String getDishType(){
        return dishType;
    }
}
