import java.util.Arrays;

public class Main {
    public static void main() {

        //recipes oprettet af forskellige brugere
        Recipe[] recipes = new Recipe[5];
        recipes[0] = new Recipe("Donut", new String[]{"mælk", "mel", "sukker"}, "lav donuts", true);
        recipes[1] = new Recipe("lassagne", new String[]{"kød", "pasta", "tomat"}, "kom i et fad", false);
        recipes[2] = new Recipe("pizza", new String[]{"tomat", "ost", "dej"}, "put på pizza", true);
        recipes[3] = new Recipe("thaifood", new String[]{"broccoli", "bambus", "ris"}, "steg på panden", false);
        recipes[4] = new Recipe("Boller i karry", new String[]{"fløde", "køb", "karry"}, "rør det sammen", true);


        RecipeCollection basket = new RecipeCollection(recipes);
        System.out.println("Inkøb: " + Arrays.toString(basket.groceries()));

        // Trying out OpskriftSamling
        RecipeCollection chosenRecipes = new RecipeCollection(recipes);
       System.out.println(Arrays.toString(chosenRecipes.getOpskriftWithoutIngredient("mel")));

    }
    }