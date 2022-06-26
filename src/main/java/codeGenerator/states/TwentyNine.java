package codeGenerator.states;

import scanner.token.Token;

public class TwentyNine extends State{
    protected TwentyNine(Context context) {
        super(context);
    }

    @Override
    public void next(Token next) {
        super.getContext().getCodeGenerator().methodReturn();
    }
}
