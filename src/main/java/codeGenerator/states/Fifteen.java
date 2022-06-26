package codeGenerator.states;

import scanner.token.Token;

public class Fifteen extends State{
    protected Fifteen(Context context) {
        super(context);
    }

    @Override
    public void next(Token next) {
        super.getContext().getCodeGenerator()._while();
    }
}
