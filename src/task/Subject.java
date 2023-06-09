package task;

public class Subject {
    private String name;
    private Material material;
    private double volume;


    public Subject(String name, Material material, double volume) {
        this.name = name;
        this.material = material;
        this.volume = volume;
    }

    public Subject() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getMass() {
        if (material != null) {
            return material.getDensity() * volume;
        }
        return 0;

    }

    public String toString() {
        return name + ";" + material + ";" + volume + ";" + getMass();
    }

    public static void main(String[] args) {
        System.out.println(new Subject("wire", null, 0));
    }

}
