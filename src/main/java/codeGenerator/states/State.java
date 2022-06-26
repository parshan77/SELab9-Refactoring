package codeGenerator.states;

import scanner.token.Token;

public abstract class State {
    private Context context;

    protected State(Context context) {
        this.context = context;
    }

    public abstract void next(Token next);

    public Context getContext() {
        return context;
    }
}
