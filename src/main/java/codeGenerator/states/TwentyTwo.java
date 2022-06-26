package codeGenerator.states;

import scanner.token.Token;

public class TwentyTwo extends State{
    protected TwentyTwo(Context context) {
        super(context);
    }

    @Override
    public void next(Token next) {
        super.getContext().getCodeGenerator().not();
    }
}
