import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main() {

        //recipes oprettet af forskellige brugere
        RecipeCollection recipeCollection = new RecipeCollection(new Recipe[] {
        new Recipe("Donut", new String[]{"mælk", "mel", "sukker"}, "lav donuts", true, "Dessert"),
        new Recipe("lassagne", new String[]{"kød", "pasta", "tomat"}, "kom i et fad", false, "Hovedret"),
        new Recipe("pizza", new String[]{"tomat", "ost", "dej"}, "put på pizza", true, "Hovedret"),
        new Recipe("thaifood", new String[]{"broccoli", "bambus", "ris"}, "steg på panden", false, "Forret"),
        new Recipe("Boller i karry", new String[]{"fløde", "køb", "karry"}, "rør det sammen", true, "Hovedret")}
        );
        //System.out.println("Inkøb: " + Arrays.toString(recipeCollection.groceries()));

        // Trying out OpskriftSamling

        System.out.println(Arrays.toString(recipeCollection.vegetarianRecipes(recipeCollection)));


        recipeCollection.getRecipes()[0].addComment(new Comment("nice", 5));
        recipeCollection.getRecipes()[0].addComment(new Comment("nice", 1));
        recipeCollection.getRecipes()[0].addComment(new Comment("nice", 2));

        System.out.println(recipeCollection.getRecipes()[0].rating);

        // System.out.println(Arrays.toString(chosenRecipes.getOpskriftWithoutIngredient("mel")));

        UserInterface ui = new UserInterface(recipeCollection);
        //ui.addRecipe();
        ui.fetchGroceryList();




    }

}