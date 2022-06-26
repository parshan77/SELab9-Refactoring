package codeGenerator.states;

import scanner.token.Token;

public class TwentyThree extends State{
    protected TwentyThree(Context context) {
        super(context);
    }

    @Override
    public void next(Token next) {
        super.getContext().getCodeGenerator().defClass();
    }
}
