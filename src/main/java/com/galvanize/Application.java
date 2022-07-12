package com.galvanize;

public class Application {

    public static void main(String[] args) {
        if (args.length ==0){
            System.out.println("Please specify a name and email");
            System.exit(1);
        } else if (args.length == 1) {
            System.out.println("Please specify an email for " + args[0]);
            System.exit(1);
        }
        System.out.println(args[0] + " " + "<" + args[1] + ">");
    }
}
