import java.util.Objects;

public class Student {
    private final String name;
    private final String surname;

    private int magicPower;
    private int transgressionDistance;

    public Student(String name, String surname, int magicPower, int transgressionDistance) {
        this.name = name;
        this.surname = surname;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    @Override
    public String toString() {
        return "Данные студента: " +
                "Имя - " + name +
                ", Фамилия - " + surname +
                ". Характеристики: мощность магии - " + magicPower +
                ", дальность трансгрессии - " + transgressionDistance +
                ", ";
    }

}


