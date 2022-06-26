package codeGenerator.states;

import codeGenerator.CodeGenerator;
import scanner.token.Token;

public class Context {
    private CodeGenerator codeGenerator;
    private State current;

    public Context(CodeGenerator codeGenerator) {
        this.codeGenerator = codeGenerator;
        this.current = new Zero(this);
    }

    public void handle(Token token) {
        this.current.next(token);
    }

    public CodeGenerator getCodeGenerator() {
        return codeGenerator;
    }
}
