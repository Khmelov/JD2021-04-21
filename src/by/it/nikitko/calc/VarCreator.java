package by.it.nikitko.calc;

public class VarCreator {
    private VarCreator() {
    }

    static Var createVar(String expression) throws CalcException {
        expression = expression.replaceAll("\\s+", "");

        if (expression.matches(Patterns.SCALAR))
            return new Scalar(expression);
        if (expression.matches(Patterns.VECTOR))
            return new Vector(expression);
        if (expression.matches(Patterns.MATRIX)) {
            return new Matrix(expression);
        } else {
            if (VarRepo.contain(expression)) {
                return VarRepo.load(expression);
            } else {
                throw new CalcException(ConsoleRunner.manager.get(Messages.INCORRECT_EXPRESSION));
            }
        }
    }
}
