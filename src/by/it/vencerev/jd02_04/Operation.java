package by.it.vencerev.jd02_04;

interface Operation {
Var add(Var other) throws CalcException;
Var sub(Var other) throws CalcException;
Var mul(Var other);
Var div(Var other) throws CalcException;
}