package codeGenerator.states;

import scanner.token.Token;

public class ThirtyOne extends State{
    protected ThirtyOne(Context context) {
        super(context);
    }

    @Override
    public void next(Token next) {
        super.getContext().getCodeGenerator().call();
    }
}
