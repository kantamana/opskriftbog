public class Brugerflade {
    OpskriftSamling available;
    OpskriftSamling chosen;
    OpskriftSamling basket;

    public Brugerflade(OpskriftSamling available, OpskriftSamling chosen, OpskriftSamling basket) {
        this.available = available;
        this.chosen = chosen;
        this.basket = basket;
    }

    public Brugerflade(OpskriftSamling available) {
        this.available = available;
    }

    public OpskriftSamling getAvailable() {
        return available;
    }

    public OpskriftSamling getChosen() {
        return chosen;
    }

    public OpskriftSamling getBasket() {
        return basket;
    }

    public void setAvailable(OpskriftSamling available) {
        this.available = available;
    }

    public void setChosen(OpskriftSamling chosen) {
        this.chosen = chosen;
    }

    public void setBasket(OpskriftSamling basket) {
        this.basket = basket;
    }
}
