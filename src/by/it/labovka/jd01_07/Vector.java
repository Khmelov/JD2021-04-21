package by.it.labovka.jd01_07;

import java.util.Arrays;

class Vector extends Var {
    double[] value ;

 public double[] getValue() {
  return value;
 }

 Vector(double[ ] value)
 {
this.value = value;
 }

 Vector(Vector vector)
 {
this.value = vector.getValue();
 }



 Vector(String strVector)
 {
  strVector.trim();
  String[] str = (strVector.substring(1,strVector.length()-1)).split(",");
  for (int i = 0; i <str.length ; i++) {
//   System.out.println(str[i]);
//   System.out.println(str.length);
  }
  double[] a = new double[str.length];
  for (int i = 1; i < str.length-1; i++) {
      a[i] = Double.parseDouble(str[i]);
     }
  this.value = a;


 }
 @Override
 public String toString() {
  StringBuilder sb = new StringBuilder("{");
  String delimeter = "";
  for(double s : value)
  {
   sb.append(delimeter).append(value.toString());
   delimeter = ", ";
  }
  sb.append("}");
  return sb.toString();
 }
}
