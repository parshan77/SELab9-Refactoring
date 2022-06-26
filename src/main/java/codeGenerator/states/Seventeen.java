package codeGenerator.states;

import scanner.token.Token;

public class Seventeen extends State{
    protected Seventeen(Context context) {
        super(context);
    }

    @Override
    public void next(Token next) {
        super.getContext().getCodeGenerator().jpHere();
    }
}
