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
        Recipe[] returnValue  = new Recipe[recipes.length + 1];
        for (int i = 0; i < recipes.length; i++) {
            returnValue[i] = recipes[i];
        }
        returnValue[returnValue.length -1] = recipe;
        recipes = returnValue;
    }
    /*public RecipeCollection getRecipesMinimumRating(int ratingAsStars) {
        // Dette er ikke i overenstemmelse med frozen zone og bliver derfor ikke brugt
        if (ratingAsStars > 5 || ratingAsStars < 0 ) {
            System.out.println("invalid argument: rating must be from 0 to 5");
            return null;
        }
        double desiredRating = ratingAsStars;
        Recipe[] desiredRecipes = new Recipe[recipes.length];
        int counter = 0;
        for (Recipe recipe: recipes) {
            if (recipe.getRating() >= desiredRating ) {
                desiredRecipes[counter] = recipe;
                counter ++;
            }
        }
        return new RecipeCollection(Arrays.copyOfRange(desiredRecipes, 0, counter));

    }*/

    public RecipeCollection getHighestRecipesOfType(String type) {
        double WorldRecordRating = 0.;
        Recipe[] desiredRecipes = new Recipe[recipes.length];
        int counter = 0;
        for (Recipe recipe: recipes) {
            if (recipe.getDishType() == type && recipe.getRating() >= WorldRecordRating) {
                desiredRecipes[0] = recipe;
                counter ++;
                WorldRecordRating = recipe.getRating();
            }
        }
        return new RecipeCollection(Arrays.copyOfRange(desiredRecipes, 0, counter));
    }

    public void setRecipes(Recipe[] recipes) {
        this.recipes = recipes;
    }

    public Recipe[] getRecipesWithoutIngredient (String keyword){
        Recipe[] returnValue = new Recipe[recipes.length];
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
                returnValue[counter] = recipe;
                counter++;
            }
        }

        return Arrays.copyOfRange(returnValue, 0, counter);
    }

/*    //Valgte opskrifter af brugeren
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
    }*/



    String[] getRecipeNames() {
        String[] recipeNames = new String[getRecipes().length];
        for (int i = 0; i < recipeNames.length; i++) {
            recipeNames[i] = getRecipes()[i].title;
        }
        return recipeNames;
    }

    //Returner vegetariske opskrifter
    public Recipe[] vegetarianRecipes(RecipeCollection recipes) {
        Recipe[] vegetarianRecipes = new Recipe[recipes.getRecipes().length]; //laver en ny tom liste
        int counter = 0;


        //Tilføjer opskriften til den tomme liste, hvis den er vegetarisk
        for (int i = 0; i < recipes.getRecipes().length; i++ ) {
            if (recipes.getRecipes()[i].vegetarian) {
                vegetarianRecipes[counter] = recipes.getRecipes()[i];
                counter++;
            }
        }
        //fjerner nulls fra listen
        vegetarianRecipes = Arrays.copyOfRange(vegetarianRecipes, 0, counter);

        return vegetarianRecipes;
    }

}