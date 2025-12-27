package Loops;

class LocalShadowingInstanceInLoop {
    private int j;

    void show(){
        while(j<=5){
            for(int j = 1; j<=5;){
                System.out.println(j + " ");
                j++;
                //This whole operation is performed on local variable j
            }
            System.out.println("\n");
            j++;
            //This operation is performed on instance variable j
        }
    }

    public static void main(String[] args){
        new LocalShadowingInstanceInLoop().show();
    }
 
}