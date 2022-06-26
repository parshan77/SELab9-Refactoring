package codeGenerator.states;

import scanner.token.Token;

public class Ten extends State{
    protected Ten(Context context) {
        super(context);
    }

    @Override
    public void next(Token next) {
        super.getContext().getCodeGenerator().add();
    }
}
