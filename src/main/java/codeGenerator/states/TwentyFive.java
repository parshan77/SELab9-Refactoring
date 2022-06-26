package codeGenerator.states;

import scanner.token.Token;

public class TwentyFive extends State{
    protected TwentyFive(Context context) {
        super(context);
    }

    @Override
    public void next(Token next) {
        super.getContext().getCodeGenerator().popClass();
    }
}
