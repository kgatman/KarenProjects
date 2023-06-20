package org.khatman.karen;

public class Stars {
    String s = "*";
    public void runStars(){
        for(int i = 1; i<10; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(s);
            }
            System.out.println(); //to force it to a new line
        }
    }
}
