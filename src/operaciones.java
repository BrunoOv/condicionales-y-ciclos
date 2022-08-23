public class operaciones {

    public static void main(String[] args) {

        float operando1, operando2;
        int i=0;
        String cadena1;
        while (args[i]!=null) {

            cadena1 = args[i];
            operando1=Float.parseFloat(args[i+1]);
            operando2=Float.parseFloat(args[i+2]);
            if (cadena1.equals("SUMA")) {

                System.out.print(operando1 + " + " + operando2 + " = ");
                System.out.println(operando1 + operando2);

            }
            if (cadena1.equals("RESTA")) {

                System.out.print(operando1+" - "+operando2+" = ");
                System.out.println(operando1-operando2);


            }
            if (cadena1.equals("MULTIPLICACION")) {

                System.out.print(operando1 + " * " + operando2 + " = ");
                System.out.println(operando1 * operando2);


            }
            if (cadena1.equals("DIVISION")) {

                System.out.print(operando1+" / "+operando2+" = ");
                System.out.println(operando1/operando2);

            }
        i=i+3;
        }

    }
}