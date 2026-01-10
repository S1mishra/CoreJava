package IfElseAndSwitchInJava;

public class IfELseInSwitchDefaultBlock {
    public static void main(String[] args){
        var k = 9;
        var s = 5;
        switch(k){
            default:
                if(k == 10){
                    s = s*2;
                }
            else{
                s = s+4;
                break;
            }
            case 7:
                s= s+3;
        }
        System.out.println(s);
    }
    
}
