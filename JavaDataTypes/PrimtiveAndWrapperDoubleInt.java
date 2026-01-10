package JavaDataTypes;

public class PrimtiveAndWrapperDoubleInt {
    public static void main(String[] args){
        String str = "10";
        int iVal = 0;
        Double dVal = 0.0;

        try{
            iVal = Integer.parseInt(str, 2);
            if((dVal = Double.parseDouble(str)) == iVal){
                System.out.println("Equal");
            }
        }catch(NumberFormatException e){
            System.out.println("Exception in parsing");
        }
        System.out.println(iVal+ " "+dVal);
    }
}

//Integer.parseInt(str, 2) parses the string "10" as a binary number, resulting in the integer value 2.
//Double.parseDouble(str) parses the string "10" as a decimal number, resulting in the double value 10.0.
//Integer.parseInt(str, 10) would parse the string "10" as a decimal number, resulting in the integer value 10.
//Integer.parseInt(str, 16) would parse the string "10" as a hexadecimal number, resulting in the integer value 16.
//Integer.parseInt(str, 8) would parse the string "10" as an octal number, resulting in the integer value 8.
////Integer.parseInt(str, 27) would throw a NumberFormatException because base 27 is not valid for parsing the string "10".