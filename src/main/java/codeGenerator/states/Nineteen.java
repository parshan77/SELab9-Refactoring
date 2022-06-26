package codeGenerator.states;

import scanner.token.Token;

public class Nineteen extends State{
    protected Nineteen(Context context) {
        super(context);
    }

    @Override
    public void next(Token next) {
        super.getContext().getCodeGenerator().equal();
    }
}
