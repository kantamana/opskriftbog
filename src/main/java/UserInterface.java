import java.util.Scanner;

public class UserInterface {
    private RecipeCollection allRecipes;
    private RecipeCollection chosenRecipes;
    private RecipeCollection basket;

    Scanner scan = new Scanner(System.in);

    public UserInterface(RecipeCollection allRecipes) {
        this.allRecipes = allRecipes;
    }

    public void addRecipe() {
        System.out.println("Tilføj navn på ret: ");
        String title = scan.nextLine();

        System.out.println("Hvor mange ingredienser indeholder retten? ");
        int numberOfIngredients = scan.nextInt();
        scan.nextLine();

        String[] ingredients = new String[numberOfIngredients];
        for (int i = 0 ; i < numberOfIngredients; i++) {
            System.out.println("Indtast ingrediensnummer: " + (i + 1));
            ingredients[i] = scan.nextLine();
        }
        System.out.println("Hvad er fremgangsmetoden for opskriften? ");
        String procedure = scan.nextLine();

        System.out.println("Er retten vegetarisk?\nSkriv 1 for ja eller 2 for nej");
        int vegetarian = scan.nextInt();
        boolean isVegetarian = vegetarian == 1;

        System.out.println("Hvilken type er retten?");
        String dishType = scan.nextLine();


        Recipe newRecipe = new Recipe(title, ingredients, procedure, isVegetarian, dishType);
        allRecipes.addRecipe(newRecipe);

        System.out.println("Du har oprettet denne ret:\n\n" + newRecipe);

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
