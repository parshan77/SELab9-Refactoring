package codeGenerator.states;

import scanner.token.Token;

public class TwentyFour extends State{
    protected TwentyFour(Context context) {
        super(context);
    }

    @Override
    public void next(Token next) {
        super.getContext().getCodeGenerator().defMethod();
    }
}
