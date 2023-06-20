package org.khatman.karen;

public class Word {
    private String[] x,y,z;

    public String[] getX() {
        return x;
    }
    public void setX(String x) {
        for (String s : this.x = x) {
        }

    }
    public String[] getY() {
        return y;
    }
    public void setY(String[] y) {
        this.y = y;
    }
    public String[] getZ() {
        return z;
    }
    public void setZ(String[] z) {
        this.z = z;
    }
    public int getWordLength(){
        return x.length + y.length + z.length;
    }
}
