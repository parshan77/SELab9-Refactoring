package codeGenerator.states;

import scanner.token.Token;

public class Eleven extends State{
    protected Eleven(Context context) {
        super(context);
    }

    @Override
    public void next(Token next) {
        super.getContext().getCodeGenerator().sub();
    }
}
