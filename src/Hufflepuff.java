public class Hufflepuff extends Student {
    private int hardworking;
    private int loyal;
    private int honest;

    public Hufflepuff(String name, String surname, int magicPower, int transgressionDistance, int hardworking, int loyal, int honest) {
        super(name, surname, magicPower, transgressionDistance);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    @Override
    public String toString() {
        return "Факультет Пуфендуй. " + super.toString() +
                "трудолюбие - " + hardworking +
                ", верность -" + loyal +
                ", честность - " + honest +
                ". ";
    }
}
