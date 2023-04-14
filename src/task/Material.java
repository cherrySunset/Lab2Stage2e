package task;

public class Material {

    private final String name;
    private final double density;

    public Material(String name, double density) {
        this.name = name;
        this.density = density;
    }

    public Material() {
        this( "",0);
    }


    public double getDensity() {
        return density;
    }

      public String getName() {
        return name;
    }

    public String toString() {
        return name + ";" + density;
    }


}
