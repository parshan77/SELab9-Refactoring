package codeGenerator.states;

import scanner.token.Token;

public class One extends State {

    public One(Context context) {
        super(context);
    }

    @Override
    public void next(Token token) {
        this.context.getCodeGenerator().checkID();
    }
}
