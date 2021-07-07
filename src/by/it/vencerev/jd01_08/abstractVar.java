package by.it.vencerev.jd01_08;

import jdk.dynalink.Operation;

public interface abstractVar extends Operation {
    @Override
    String toString();

    Var div(Var other);

    Var mul(Var other);

    Var sub(Var other);

    Var add(Var other);
}
