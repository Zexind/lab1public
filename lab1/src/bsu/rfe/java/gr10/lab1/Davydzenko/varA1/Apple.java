package bsu.rfe.java.gr10.lab1.Davydzenko.varA1;

public class Apple extends Food {
    public Apple(String size) {
        super("������");
        this.size = size;
    }
    public void consume() {
        System.out.println(this + " �������");
    }
    public String toString() {
        return super.toString() + " ������� '" + size.toUpperCase() + "'";
    }
    public boolean equals(Object arg0) {
        if (super.equals(arg0)) {
            if (!(arg0 instanceof Apple)) return false;
            return size.equals(((Apple)arg0).size);
        } else
            return false;
    }

    private String size;
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }
}