package codeGenerator.states;

import scanner.token.Token;

public class TwentySeven extends State{
    protected TwentySeven(Context context) {
        super(context);
    }

    @Override
    public void next(Token next) {
        super.getContext().getCodeGenerator().defField();
    }
}
