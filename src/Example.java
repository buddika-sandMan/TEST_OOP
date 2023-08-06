interface Reload{}

class Soilder{
    private int id;
    private String name;

    public Soilder() {
    }

    public Soilder(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Soilder{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

abstract class Gun{
    abstract public void fire();

    abstract public void shoot(Gun gun, Soilder soilder);

}

class Ak47 extends Gun implements Reload{
    public void fire(){
        System.out.println("Ak47");
    }
    public void shoot(Gun gun, Soilder soilder){
        System.out.println(soilder);
        gun.fire();
    }
}

class Uzi extends Gun implements  Reload{
    public void fire(){
        System.out.println("Uzi");
    }
    public void shoot(Gun gun, Soilder soilder){
        System.out.println(soilder);
        gun.fire();
    }
}

class Example{
    public static void main(String[] args) {

        Soilder soilder1 = new Soilder(001,"Jemmy");
        Soilder soilder2 = new Soilder(002,"Fabian");

        Gun ak47 = new Ak47();
        Gun uzi = new Uzi();

        ak47.shoot(ak47,soilder2);

    }
}