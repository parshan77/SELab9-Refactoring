package codeGenerator.states;

import scanner.token.Token;

public class Thirty extends State{
    protected Thirty(Context context) {
        super(context);
    }

    @Override
    public void next(Token next) {
        super.getContext().getCodeGenerator().defParam();
    }
}
