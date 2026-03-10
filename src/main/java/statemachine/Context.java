package statemachine;

public class Context {
    State state;
    public Context(State initialState) {
        this.state = initialState;
    }
}
