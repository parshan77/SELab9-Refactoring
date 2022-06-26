package codeGenerator.states;

import scanner.token.Token;

public class TwentyOne extends State{
    protected TwentyOne(Context context) {
        super(context);
    }

    @Override
    public void next(Token next) {
        super.getContext().getCodeGenerator().and();
    }
}
