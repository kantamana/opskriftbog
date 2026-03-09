public class Opskriftsbog {
    String title;
    String ingredients;
    String procedure;
    boolean vegetarisk;

    public Opskriftsbog(String title, String ingredients, String procedure, boolean vegetarisk) {
        this.title = title;
        this.ingredients = ingredients;
        this.procedure = procedure;
        this.vegetarisk = vegetarisk;

    }

    public String toString() {
        return String.format("""
                Opskrift: %s
                Ingredienser: %s
                Fremgangsmåde: %s
                """, title, ingredients, procedure);
    }
}
