package by.it.vencerev.jd01_08;

import jdk.dynalink.Operation;

abstract class Var implements abstractVar {

    @Override
    public String toString() {
        return "AbstractVar";
    }


    @Override
    public Var div(Var other) {
        System.out.println("Операция невозможна");
        return null;
    }

    @Override
    public Var mul(Var other) {
        System.out.println("Операция невозможна");
        return null;
    }

    @Override
    public Var sub(Var other) {
        System.out.println("Операция невозможна");
        return null;
    }

    @Override
    public Var add(Var other) {
        System.out.println("Операция невозможна");
        return null;
    }
}