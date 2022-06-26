package codeGenerator.states;

import scanner.token.Token;

public class Zero extends State{
    private Context context;

    public Zero(Context context) {
        super(context);
        this.context = context;
    }

    @Override
    public void next(Token next) {

    }
}
