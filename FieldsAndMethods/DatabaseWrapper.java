package FieldsAndMethods;

public class DatabaseWrapper {
    static String url = "jdbc:mysql://localhost:3306/mydb";

    static DatabaseWrapper getDatabase(){
        System.out.println("Getting DB");
        return null;
    }

    public static void main(String[] args){
        System.out.println(getDatabase().url);
    }
}

//url is a static field, so it can be accessed directly using the class method getDatabase() without needing an instance of DatabaseWrapper.