package codeGenerator.states;

import scanner.token.Token;

public class Four extends State{

    protected Four(Context context) {
        super(context);
    }

    @Override
    public void next(Token next) {
        super.getContext().getCodeGenerator().kpid(next);
    }
}
