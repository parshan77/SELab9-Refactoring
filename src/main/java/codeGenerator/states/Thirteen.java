package codeGenerator.states;

import scanner.token.Token;

public class Thirteen extends State{

    protected Thirteen(Context context) {
        super(context);
    }

    @Override
    public void next(Token next) {
        super.getContext().getCodeGenerator().label();
    }
}
