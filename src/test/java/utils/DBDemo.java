package utils;

import java.util.Arrays;

public class DBDemo {
    // runtime arguments
    // runtime environmental variable

    public static void main(String[] args) {
        System.out.println(ConfigReader.getProperty("dbank.db.username"));
        System.out.println(Arrays.toString(args));
     //   System.out.println(args[0]);


        // get VM args(options)
        String pass = System.getProperty("db.pass");
        System.out.println(pass);

        // I also make sure our team meets compliance. One of them is to make sure
        // password are not hard coded in the config files
        // to overcome this I use VM options for all passwords like db




    }
}
