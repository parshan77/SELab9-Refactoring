package codeGenerator.states;

import scanner.token.Token;

public class Eighteen extends State{
    protected Eighteen(Context context) {
        super(context);
    }

    @Override
    public void next(Token next) {
        super.getContext().getCodeGenerator().print();
    }
}
