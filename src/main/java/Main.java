import java.util.Arrays;

public class Main {
    public static void main() {

        //opskrifter oprettet af forskellige brugere
        Opskriftsbog[] opskrifter = new Opskriftsbog[5];
        opskrifter[0] = new Opskriftsbog("Donut", new String[]{"mælk", "mel", "sukker"}, "lav donuts", true);
        opskrifter[1] = new Opskriftsbog("lassagne", new String[]{"mælk", "mel", "sukker"}, "lav donuts", false);
        opskrifter[2] = new Opskriftsbog("Donuts igen", new String[]{"mælk", "mel", "sukker"}, "lav donuts", true);
        opskrifter[3] = new Opskriftsbog("salat", new String[]{"mælk", "mel", "sukker"}, "lav donuts", false);
        opskrifter[4] = new Opskriftsbog("peber", new String[]{"mælk", "mel", "sukker"}, "lav donuts", true);

        //Valgte opskrifter af brugeren
        Opskriftsbog[] chosenRecipes = new Opskriftsbog[2];
        chosenRecipes[0] = opskrifter[0];
        chosenRecipes[1] = opskrifter[1];

        //Inkøbskurv med ingredienser til valgte opskrifter
        String[] groceries = new String[chosenRecipes.length];
        for (int i = 0; i < groceries.length; i++) {
            groceries[i] = Arrays.toString(chosenRecipes[i].getIngredients());

        }

        System.out.print(Arrays.toString(groceries));
    }
    }