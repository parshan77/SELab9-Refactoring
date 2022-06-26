package codeGenerator.states;

import scanner.token.Token;

public class ThirtyTwo extends State{
    protected ThirtyTwo(Context context) {
        super(context);
    }

    @Override
    public void next(Token next) {
        super.getContext().getCodeGenerator().call();
    }
}
