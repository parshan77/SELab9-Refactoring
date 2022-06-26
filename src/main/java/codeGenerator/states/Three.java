package codeGenerator.states;

import scanner.token.Token;

public class Three extends State{

    protected Three(Context context) {
        super(context);
    }

    @Override
    public void next(Token next) {
        super.getContext().getCodeGenerator().fpid();
    }
}
