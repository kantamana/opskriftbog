import java.util.Arrays;

public class Main {
    public static void main() {

        //opskrifter oprettet af forskellige brugere
        Opskrift[] opskrifter = new Opskrift[5];
        opskrifter[0] = new Opskrift("Donut", new String[]{"mælk", "mel", "sukker"}, "lav donuts", true);
        opskrifter[1] = new Opskrift("lassagne", new String[]{"kød", "pasta", "tomat"}, "kom i et fad", false);
        opskrifter[2] = new Opskrift("pizza", new String[]{"tomat", "ost", "dej"}, "put på pizza", true);
        opskrifter[3] = new Opskrift("thaifood", new String[]{"broccoli", "bambus", "ris"}, "steg på panden", false);
        opskrifter[4] = new Opskrift("Boller i karry", new String[]{"fløde", "køb", "karry"}, "rør det sammen", true);

        //Valgte opskrifter af brugeren
        Opskrift[] chosenRecipes = new Opskrift[2];
        chosenRecipes[0] = opskrifter[0];
        chosenRecipes[1] = opskrifter[1];

        //Inkøbskurv med ingredienser til valgte opskrifter
        String[] groceries = new String[chosenRecipes.length];
        for (int i = 0; i < groceries.length; i++) {
            groceries[i] = Arrays.toString(chosenRecipes[i].getIngredients());

        }

        System.out.print(Arrays.toString(groceries));

        // Trying out OpskriftSamling
        OpskriftSamling samling = new OpskriftSamling(opskrifter);
        System.out.println(Arrays.toString(samling.getOpskriftWithoutIngredient("mel")));

    }
    }