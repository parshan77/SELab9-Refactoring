package codeGenerator.states;

import scanner.token.Token;

public class Sixteen extends State{
    protected Sixteen(Context context) {
        super(context);
    }

    @Override
    public void next(Token next) {
        super.getContext().getCodeGenerator().jpf_save();
    }
}
