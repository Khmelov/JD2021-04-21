package by.it.nikitko.calc;


abstract class Var implements Operation {




    @Override
    public Var add(Var other) throws CalcException {
        throw new CalcException(ConsoleRunner.manager.get(Messages.OPERATION_ADDITIONS)+" " + this + "+" + other +
                ConsoleRunner.manager.get(Messages.IS_IMPOSSIBLE));

    }

    @Override
    public Var sub(Var other) throws CalcException {
        throw new CalcException(ConsoleRunner.manager.get(Messages.OPERATION_SUBTRACTION)+" " + this + "-" + other +
                ConsoleRunner.manager.get(Messages.IS_IMPOSSIBLE));

    }

    @Override
    public Var mul(Var other) throws CalcException {
        throw new CalcException(ConsoleRunner.manager.get(Messages.OPERATION_MULTIPLICATION)+" " + this + "*" + other +
                ConsoleRunner.manager.get(Messages.IS_IMPOSSIBLE));

    }

    @Override
    public Var div(Var other) throws CalcException {
        throw new CalcException(ConsoleRunner.manager.get(Messages.OPERATION_DIVISION)+" " + this + "/" + other +
                ConsoleRunner.manager.get(Messages.IS_IMPOSSIBLE));

    }
}
