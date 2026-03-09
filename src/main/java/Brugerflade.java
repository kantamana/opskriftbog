public class Brugerflade {
    OpskriftSamling allRecipes;
    OpskriftSamling chosenRecipes;
    OpskriftSamling basket;

    public Brugerflade(OpskriftSamling allRecipes) {
        this.allRecipes = allRecipes;
    }

    public OpskriftSamling getAllRecipes() {
        return allRecipes;
    }

    public OpskriftSamling getChosenRecipes() {
        return chosenRecipes;
    }

    public OpskriftSamling getBasket() {
        return basket;
    }

    public void setAllRecipes(OpskriftSamling allRecipes) {
        this.allRecipes = allRecipes;
    }

    public void setChosenRecipes(OpskriftSamling chosenRecipes) {
        this.chosenRecipes = chosenRecipes;
    }

    public void setBasket(OpskriftSamling basket) {
        this.basket = basket;
    }
}
