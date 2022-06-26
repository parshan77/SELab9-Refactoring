package codeGenerator.states;

import scanner.token.Token;

public class Two extends State{

    protected Two(Context context) {
        super(context);
    }

    @Override
    public void next(Token next) {
        super.getContext().getCodeGenerator().pid(next);
    }
}
