import java.util.Arrays;

public class OpskriftSamling {
    public Opskrift[] opskrifter;

    public OpskriftSamling(Opskrift[] opskrifter) {
        this.opskrifter = opskrifter;
    }


    public Opskrift[] getOpskriftWithoutIngredient(String keyword) {
        Opskrift[] retval = new Opskrift[9999];
        int counter = 0;

        for (int opskriftIndex = 0; opskriftIndex < opskrifter.length; opskriftIndex++) {
            Opskrift opskrift = opskrifter[opskriftIndex];
            boolean containsIngredient = false;

            for (int ingrediensIndex = 0; ingrediensIndex < opskrift.ingredients.length; ingrediensIndex++) {
                String ingredient = opskrift.ingredients[ingrediensIndex];

                if (ingredient.contains(keyword)) {
                    containsIngredient = true;
                    break;
                }
            }

            if (!containsIngredient) {
                retval[counter] = opskrift;
                counter++;
            }
        }

        return Arrays.copyOfRange(retval, 0, counter);
    }
}
