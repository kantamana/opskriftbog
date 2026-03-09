import java.util.Arrays;

public class OpskriftSamling {
    public Opskriftsbog[] opskrifter;

    public OpskriftSamling(Opskriftsbog[] opskrifter) {
        this.opskrifter = opskrifter;
    }


    public Opskriftsbog[] getOpskriftWithoutIngredient(String keyword) {
        Opskriftsbog[] retval = new Opskriftsbog[9999];
        int counter = 0;

        for (int opskriftIndex = 0; opskriftIndex < opskrifter.length; opskriftIndex++) {
            Opskriftsbog opskrift = opskrifter[opskriftIndex];
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
