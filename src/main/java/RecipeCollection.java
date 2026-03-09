import java.util.Arrays;

public class RecipeCollection {
    private Recipe[] recipes;

    public RecipeCollection(Recipe[] recipes) {
        this.recipes = recipes;
    }

    public Recipe[] getRecipes() {
        return recipes;
    }

    public void addRecipe (Recipe recipe) {
        Recipe[] retval  = new Recipe[recipes.length + 1];
        for (int i = 0; i < recipes.length; i++) {
            retval[i] = recipes[i];
        }
        retval[retval.length -1] = recipe;
        recipes = retval;
    }

    public void setRecipes(Recipe[] recipes) {
        this.recipes = recipes;
    }

    public Recipe[] getRecipesWithoutIngredient (String keyword){
        Recipe[] retval = new Recipe[recipes.length];
        int counter = 0;

        for (int recipeIndex = 0; recipeIndex < getRecipes().length; recipeIndex++) {
            Recipe recipe = getRecipes()[recipeIndex];
            boolean containsIngredient = false;

            for (int ingredientIndex = 0; ingredientIndex < recipe.ingredients.length; ingredientIndex++) {
                String ingredient = recipe.ingredients[ingredientIndex];

                if (ingredient.contains(keyword)) {
                    containsIngredient = true;
                    break;
                }
            }

            if (!containsIngredient) {
                retval[counter] = recipe;
                counter++;
            }
        }

        return Arrays.copyOfRange(retval, 0, counter);
    }

    //Valgte opskrifter af brugeren
    public Recipe[] chosenRecipes() {
        Recipe[] chosenRecipes = new Recipe[3];
        chosenRecipes[0] = getRecipes()[0];
        chosenRecipes[1] = getRecipes()[1];
        chosenRecipes[2] = getRecipes()[2];

        return chosenRecipes;
    }

    //Inkøbskurv med ingredienser til valgte opskrifter
    public String[] groceries() {
        Recipe[] chosenRecipes = chosenRecipes();
        String[] groceries = new String[chosenRecipes.length];
        for (int i = 0; i < groceries.length; i++) {
            groceries[i] = Arrays.toString(chosenRecipes[i].getIngredients());
        }
        return groceries;
    }
    }