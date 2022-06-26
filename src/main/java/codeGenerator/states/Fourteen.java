package codeGenerator.states;

import scanner.token.Token;

public class Fourteen extends State{
    protected Fourteen(Context context) {
        super(context);
    }

    @Override
    public void next(Token next) {
        super.getContext().getCodeGenerator().save();
    }
}
