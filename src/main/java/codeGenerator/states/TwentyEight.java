package codeGenerator.states;

import scanner.token.Token;

public class TwentyEight extends State{
    protected TwentyEight(Context context) {
        super(context);
    }

    @Override
    public void next(Token next) {
        super.getContext().getCodeGenerator().defVar();
    }
}
