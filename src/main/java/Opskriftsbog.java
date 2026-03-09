public class Opskriftsbog {
    String title;
    String ingredients;
    String procedure;

    public Opskriftsbog(String title, String ingredients, String procedure) {
        this.title = title;
        this.ingredients = ingredients;
        this.procedure = procedure;

    }

    public String toString() {
        return String.format("""
                Opskrift: %s
                Ingredienser: %s
                Fremgangsmåde: %s
                """, title, ingredients, procedure);
    }
}
