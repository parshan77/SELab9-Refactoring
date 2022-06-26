package codeGenerator.states;

import scanner.token.Token;

public class ThirtyThree extends State{
    protected ThirtyThree(Context context) {
        super(context);
    }

    @Override
    public void next(Token next) {
        super.getContext().getCodeGenerator().call();
    }
}
