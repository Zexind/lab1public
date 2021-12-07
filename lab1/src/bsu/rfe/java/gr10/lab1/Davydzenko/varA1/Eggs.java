package bsu.rfe.java.gr10.lab1.Davydzenko.varA1;

public class Eggs extends Food {
    private String fill;

    public Eggs(String amount) {
        super("Яйца");
        this.fill = amount;
    }

    public void consume() {
        System.out.println(this + "съедено");
    }

    public String getFill() {
        return fill;
    }
    public void setFill(String fill) {
        this.fill = fill;
    }

    public boolean equals(Object arg0) {
        if (super.equals(arg0)) {
            if (!(arg0 instanceof Eggs)) return false;
            return fill.equals(((Eggs) arg0).fill);
        } else
            return false;
    }

    public String toString() {
        return super.toString() + " количеством '" + fill.toUpperCase() + "'";
    }
}
