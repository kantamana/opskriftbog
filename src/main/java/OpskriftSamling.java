import java.util.Arrays;

public class OpskriftSamling {
    private Opskrift[] opskrifter;

    public OpskriftSamling(Opskrift[] opskrifter) {
        this.opskrifter = opskrifter;
    }

    public Opskrift[] getOpskrifter() {
        return opskrifter;
    }

    public void setOpskrifter(Opskrift[] opskrifter) {
        this.opskrifter = opskrifter;
    }

    public Opskrift[] getOpskriftWithoutIngredient (String keyword){
        Opskrift[] retval = new Opskrift[9999];
        int counter = 0;

        for (int opskriftIndex = 0; opskriftIndex < getOpskrifter().length; opskriftIndex++) {
            Opskrift opskrift = getOpskrifter()[opskriftIndex];
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

    //Valgte opskrifter af brugeren
    public Opskrift[] chosenRecipes() {
        Opskrift[] chosenRecipes = new Opskrift[3];
        chosenRecipes[0] = getOpskrifter()[0];
        chosenRecipes[1] = getOpskrifter()[1];
        chosenRecipes[2] = getOpskrifter()[2];

        return chosenRecipes;
    }

    //Inkøbskurv med ingredienser til valgte opskrifter
    public String[] groceries() {
        Opskrift[] chosenRecipes = chosenRecipes();
        String[] groceries = new String[chosenRecipes.length];
        for (int i = 0; i < groceries.length; i++) {
            groceries[i] = Arrays.toString(chosenRecipes[i].getIngredients());
        }
        return groceries;
    }
    }