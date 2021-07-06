package by.it.stain.jd02_04;

class Scalar extends Var {
     private double value;

    public double getValue() {
        return value;
    }

    public Scalar(double value) {
         this.value = value;
     }
    public Scalar(Scalar otherScalar) {
        value = otherScalar.value;
    }
    public Scalar(String stringValue) {
        this.value = Double.parseDouble(stringValue);
    }


    @Override
    public Var add(Var other) throws CalcException {
         if (other instanceof Scalar) {
             double add = this.value+ ((Scalar) other).value;
             return new Scalar(add);
         }
         else{
             return other.add(this);
         }
    }

    @Override
    public Var sub(Var other) throws CalcException {
        if (other instanceof Scalar) {
            double sub = this.value- ((Scalar) other).value;
            return new Scalar(sub);
        }
        else{
            return new Scalar(-1).mul(other).add(this);
        }

    }

    @Override
    public Var mul(Var other) throws CalcException {
        if (other instanceof Scalar) {
            double mul = this.value* ((Scalar) other).value;
            return new Scalar(mul);
        }
        else{
            return other.mul(this);
        }
    }

    @Override
    public Var div(Var other) throws CalcException {
        if (other instanceof Scalar) {
            double div = this.value/ ((Scalar) other).value;
            return new Scalar(div);
        }
        else{
            return  super.div(other);
        }
    }

    @Override
     public String toString() {
         return Double.toString(value);
     }
 }
