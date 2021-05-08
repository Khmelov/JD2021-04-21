package by.it._examples_.stain.jd01_03;

public class InOut {
    static double[] getArray(String line) {
        String[] stringArray = line.split(" ");
        double[] result = new double[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            result[i] = Double.parseDouble(stringArray[i]);
        }
        return result;
    }
    static void printArray(double[]array){
        for(double element : array){
            System.out.print(element+" ");
        }
        System.out.println();
    }
    static void printArray(double[] array, String name, int columnCount){
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%s[% -3d]=%-10.4f ",name,i,array[i]);
            if((i+1)%columnCount==0 || i+1 == array.length)
                System.out.println( );
        }
    }




}
