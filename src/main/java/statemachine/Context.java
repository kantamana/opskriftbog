package statemachine;

public class Context {
    State state;
    public Context() {
        this.state = new MainMenu();
    }
}
