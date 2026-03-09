public class UserInterface {
    RecipeCollection allRecipes;
    RecipeCollection chosenRecipes;
    RecipeCollection basket;

    public UserInterface(RecipeCollection allRecipes) {
        this.allRecipes = allRecipes;
    }

    public RecipeCollection getAllRecipes() {
        return allRecipes;
    }

    public RecipeCollection getChosenRecipes() {
        return chosenRecipes;
    }

    public RecipeCollection getBasket() {
        return basket;
    }

    public void setAllRecipes(RecipeCollection allRecipes) {
        this.allRecipes = allRecipes;
    }

    public void setChosenRecipes(RecipeCollection chosenRecipes) {
        this.chosenRecipes = chosenRecipes;
    }

    public void setBasket(RecipeCollection basket) {
        this.basket = basket;
    }
}
