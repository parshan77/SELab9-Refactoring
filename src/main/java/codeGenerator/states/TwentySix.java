package codeGenerator.states;

import scanner.token.Token;

public class TwentySix extends State{
    protected TwentySix(Context context) {
        super(context);
    }

    @Override
    public void next(Token next) {
        super.getContext().getCodeGenerator().extend();
    }
}
