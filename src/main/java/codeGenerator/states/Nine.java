package codeGenerator.states;

import scanner.token.Token;

public class Nine extends State{
    protected Nine(Context context) {
        super(context);
    }

    @Override
    public void next(Token next) {
        super.getContext().getCodeGenerator().assign();
    }
}
