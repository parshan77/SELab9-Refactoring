package codeGenerator.states;

import scanner.token.Token;

public class Five extends State{

    protected Five(Context context) {
        super(context);
    }

    @Override
    public void next(Token next) {
        super.getContext().getCodeGenerator().intpid(next);
    }
}
