import java.util.Arrays;

public class Opskrift {
    String title;
    String[] ingredients;
    String procedure;
    boolean vegetarisk;

    public Opskrift(String title, String[] ingredients, String procedure, boolean vegetarisk) {
        this.title = title;
        this.ingredients = ingredients;
        this.procedure = procedure;
        this.vegetarisk = vegetarisk;
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
