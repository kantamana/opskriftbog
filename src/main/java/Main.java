import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main() {

        //recipes oprettet af forskellige brugere
        RecipeCollection recipeCollection = new RecipeCollection(new Recipe[] {
        new Recipe("Donut", new String[]{"mælk", "mel", "sukker"}, "lav donuts", true),
        new Recipe("lassagne", new String[]{"kød", "pasta", "tomat"}, "kom i et fad", false),
        new Recipe("pizza", new String[]{"tomat", "ost", "dej"}, "put på pizza", true),
        new Recipe("thaifood", new String[]{"broccoli", "bambus", "ris"}, "steg på panden", false),
        new Recipe("Boller i karry", new String[]{"fløde", "køb", "karry"}, "rør det sammen", true)}
        );
        System.out.println("Inkøb: " + Arrays.toString(recipeCollection.groceries()));

        // Trying out OpskriftSamling

        // System.out.println(Arrays.toString(chosenRecipes.getOpskriftWithoutIngredient("mel")));

        UserInterface ui = new UserInterface(recipeCollection);
        ui.addRecipe();

    }

}