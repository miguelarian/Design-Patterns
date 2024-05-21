package com.miguelvela;

public class AddOperation implements OperationChain {

    public static final String ADD = "add";
    private OperationChain nextChain;

    @Override
    public OperationChain setNextChain(OperationChain nextChain) {
        this.nextChain = nextChain;
        return this.nextChain ;
    }

    @Override
    public void calculate(MathOperation operation) {
        if (!operation.getOperation().equals(ADD)) {
            nextChain.calculate(operation);
            return;
        }

        System.out.println("Addition operation");
        System.out.println(
                operation.getOperator1() +
                " + " +
                operation.getOperator2() +
                " = " +
                (operation.getOperator1() + operation.getOperator2()));
    }
}
