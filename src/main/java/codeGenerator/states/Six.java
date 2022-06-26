package codeGenerator.states;

import scanner.token.Token;

public class Six extends State{
    protected Six(Context context) {
        super(context);
    }

    @Override
    public void next(Token next) {
        super.getContext().getCodeGenerator().startCall();
    }
}
