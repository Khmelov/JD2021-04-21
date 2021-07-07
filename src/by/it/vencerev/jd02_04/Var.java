package by.it.vencerev.jd02_04;

abstract class Var implements Operation {

    static Var createVar(String operand) {

        operand = operand.trim().replace(" ", "");
        if (operand.matches(Patterns.SCALAR)) {
            return new Scalar(operand);
        }
        if (operand.matches(Patterns.VECTOR)) {
            return new Vector(operand);
        }
        if (operand.matches(Patterns.MATRIX)) {
            return new Matrix(operand);
        }
        return null;
    }


    @Override
    public Var add(Var other) throws CalcException {
        System.out.println("Операция " + this + " и " + other + " не может быть выполена");
        return null;
    }

    @Override
    public Var sub(Var other) throws CalcException {
        System.out.println("Операция " + this + " и " + other + " не может быть выполена");
        return null;
    }

    @Override
    public Var mul(Var other) {
        System.out.println("Операция " + this + " и " + other + " не может быть выполена");
        return null;
    }

    @Override
    public Var div(Var other) throws CalcException {
        System.out.println("Операция " + this + " и " + other + " не может быть выполена");
        return null;
    }

    protected abstract double getValue();
}