package codeGenerator.states;

import scanner.token.Token;

public class Twelve extends State{
    protected Twelve(Context context) {
        super(context);
    }

    @Override
    public void next(Token next) {
        super.getContext().getCodeGenerator().mult();
    }
}
