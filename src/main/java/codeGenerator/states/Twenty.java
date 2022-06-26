package codeGenerator.states;

import scanner.token.Token;

public class Twenty extends State{
    protected Twenty(Context context) {
        super(context);
    }

    @Override
    public void next(Token next) {
        super.getContext().getCodeGenerator().less_than();
    }
}
