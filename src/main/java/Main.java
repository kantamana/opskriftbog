import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main() {

        //recipes oprettet af forskellige brugere
        RecipeCollection recipeCollection = new RecipeCollection(new Recipe[] {
        new Recipe("Gode donuts", new String[]{"mælk", "mel", "sukker"}, "lav donuts", true, "Dessert"),
        new Recipe("lassagne", new String[]{"kød", "pasta", "tomat"}, "kom i et fad", false, "Hovedret"),
        new Recipe("pizza", new String[]{"tomat", "ost", "dej"}, "put på pizza", true, "Hovedret"),
                new Recipe("Dårlige donuts", new String[]{"mælk", "mel", "sukker"}, "lav donuts", true, "Dessert"),
        new Recipe("Boller i karry", new String[]{"fløde", "køb", "karry"}, "rør det sammen", true, "Hovedret")}

        );


        recipeCollection.getRecipes()[0].addComment(new Comment("nice", 5));
        recipeCollection.getRecipes()[0].addComment(new Comment("nice", 1));
        recipeCollection.getRecipes()[0].addComment(new Comment("nice", 2));

        //TESTING

        int counter = 0;
        while (counter < 50) {
            recipeCollection.getRecipes()[0].addComment(new Comment("nice", 5));
            counter ++;
        }
        int counter2 = 0;
        while (counter2 < 50) {
            recipeCollection.getRecipes()[3].addComment(new Comment("skrald", 5));
            counter2 ++;
        }

        System.out.println(recipeCollection.getRecipes()[0].rating);

        System.out.println(recipeCollection.getRecipes()[0]);

        UserInterface ui = new UserInterface(recipeCollection);
        //ui.addRecipe();
        //ui.fetchGroceryList();
        ui.getHighestRecipesOfType();




    }

}