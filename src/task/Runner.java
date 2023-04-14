package task;

public class Runner {
    public static void main(String[] args) {
       final Material steel = new Material("steel", 7850);

        Subject subject = new Subject("wire", steel, 0.03);

        System.out.println(subject);

        final Material copper = new Material("copper", 8500);

        subject.setMaterial(copper);

        System.out.println(subject);
        System.out.println("The wire mass is "+ subject.getMass() + "kg");

    }
}
