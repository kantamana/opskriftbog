import java.util.Arrays;
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

        System.out.println("Hvilken type er retten? \n1: forret, 2: hovedret, 3: dessert, 4: andet");
        int type = scan.nextInt();
        String dishType = "";
        if (type == 1) {
            dishType = "forret";
        }
        else if (type == 2) {
            dishType = "hovedret";
        }
        else if (type == 3) {
            dishType = "dessert";
        }
        else if (type == 4) {
            dishType = "andet";
        }


        Recipe newRecipe = new Recipe(title, ingredients, procedure, isVegetarian, dishType);
        allRecipes.addRecipe(newRecipe);

        System.out.println("Du har oprettet denne ret:\n\n" + newRecipe);

    }

    private int[] parseStringOfIntegers (String string) {
        String[] tokens = string.split(" ");
        int[] integers = new int[tokens.length];
        for (int i = 0; i < integers.length; i++) {
            integers[i] = Integer.parseInt(tokens[i]);
        }
        return integers;
    }

    public void fetchGroceryList () {
        String[] availableDishNames = allRecipes.getRecipeNames();
        for (int i = 0; i < availableDishNames.length; i++) {
            System.out.println(String.format("ret #%s: %s\n", i, availableDishNames[i]));
        }
        System.out.println("vælg fra listen de retter du vil have som tal med enkelt mellemrum imellem");

        int[] groceryIndicies = parseStringOfIntegers(scan.nextLine());

        for (int i = 0; i < groceryIndicies.length; i++) {
            System.out.println(Arrays.toString(allRecipes.getRecipes()[groceryIndicies[i]].ingredients));
        }
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
