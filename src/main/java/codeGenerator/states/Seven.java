package codeGenerator.states;

import scanner.token.Token;

public class Seven extends State{
    protected Seven(Context context) {
        super(context);
    }

    @Override
    public void next(Token next) {
        super.getContext().getCodeGenerator().call();
    }
}
