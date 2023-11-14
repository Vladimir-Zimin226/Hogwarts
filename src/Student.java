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

    /**
     * Метод подсчета общего балла конкретного студента
     */
    public static int addTotalPoint(Student student) {
        int totalPoint = 0;
        if (student.getClass() == Gryffindor.class) {
            totalPoint = student.getMagicPower() + student.getTransgressionDistance() + ((Gryffindor) student).getNobility() + ((Gryffindor) student).getCourage() + ((Gryffindor) student).getHonor();
        } else if (student.getClass() == Slytherin.class) {
            totalPoint = student.getMagicPower() + student.getTransgressionDistance() + ((Slytherin) student).getAmbition() + ((Slytherin) student).getDetermination() + ((Slytherin) student).getCunning() + ((Slytherin) student).getLustForPower();
        } else if (student.getClass() == Hufflepuff.class) {
            totalPoint = student.getMagicPower() + student.getTransgressionDistance() + ((Hufflepuff) student).getHonest() + ((Hufflepuff) student).getLoyal() + ((Hufflepuff) student).getHardworking();
        } else if (student.getClass() == Ravenclaw.class) {
            totalPoint = student.getMagicPower() + student.getTransgressionDistance() + ((Ravenclaw) student).getCreative() + ((Ravenclaw) student).getSmart() + ((Ravenclaw) student).getWise() + ((Ravenclaw) student).getWitty();
        }
        return totalPoint;
    }

    /**
     * Метод для сравнения учеников Хогвартса с акцентом на факультет
     */
    public static void selectTopStudentOnFacultate(Student student1, Student student2) {
        if (student1.getClass() == Gryffindor.class && student2.getClass() == Gryffindor.class) {
            System.out.println("Факультет Гриффиндор:");
        } else if (student1.getClass() == Slytherin.class && student2.getClass() == Slytherin.class) {
            System.out.println("Факультет Слизерин:");
        } else if (student1.getClass() == Hufflepuff.class && student2.getClass() == Hufflepuff.class) {
            System.out.println("Факультет Пуффендуй:");
        } else if (student1.getClass() == Ravenclaw.class && student2.getClass() == Ravenclaw.class) {
            System.out.println("Факультет Когтевран:");
        } else {
            System.out.println("Студенты разных факультетов");
        }
        if (addTotalPoint(student1) > addTotalPoint(student2)) {
            System.out.println(student1.getName() + " " + student1.getSurname() + " лучший ученик факультета, чем " + student2.getName() + " " + student2.getSurname());
        } else {
            System.out.println(student2.getName() + " " + student2.getSurname() + " лучший ученик факультета, чем " + student1.getName() + " " + student1.getSurname());
        }

    }

    /**
     * Сравнение любых учеников по силе магии и дальности трансгрессии
     */
    public static void selectTopStudent(Student student1, Student student2) {
        if (student1.getMagicPower() > student2.getMagicPower() && student1.getTransgressionDistance() > student2.getTransgressionDistance()) {
            System.out.println(student1.getName() + " " + student1.getSurname() + " лучше " + student2.getName() + " " + student2.getSurname() + " по силе магии и дальности трансгрессии");
        } else if (student2.getMagicPower() > student1.getMagicPower() && student2.getTransgressionDistance() > student1.getTransgressionDistance()) {
            System.out.println(student2.getName() + " " + student2.getSurname() + " лучше " + student1.getName() + " " + student1.getSurname() + " по силе магии и дальности трансгрессии");
        } else if (student1.getMagicPower() > student2.getMagicPower() && student1.getTransgressionDistance() < student2.getTransgressionDistance()) {
            System.out.println(student1.getName() + " " + student1.getSurname() + " лучше " + student2.getName() + " " + student2.getSurname() + " по силе магии, но хуже в трансгресии");
        } else {
            System.out.println(student2.getName() + " " + student2.getSurname() + " лучше " + student1.getName() + " " + student1.getSurname() + " по силе магии, но хуже в трансгресии");
        }
    }

    /**
     * Печать конкретного студента со всеми параметрами
     */
    public static void printStudent(Student student) {
        System.out.println("Информация о студенте: " + student);
    }

}


