import javax.naming.Name;

public class Hogwarts {

       public static void main(String[] args) {

        Gryffindor harryPotter = new Gryffindor("Гарри", "Поттер", 100, 100, 100, 100, 100);
        Gryffindor hermioneGranger = new Gryffindor("Гермиона", "Грейнджер", 100, 100, 100, 100, 90);
        Gryffindor ronWeasley = new Gryffindor("Рональд", "Уизли", 100, 90, 100, 90, 80);

        Slytherin dracoMalfoy = new Slytherin("Драко", "Малфой", 90, 95, 100, 90, 100, 90, 100);
        Slytherin grahamMontague = new Slytherin("Грэхэм", "Монтегю", 80, 70, 70, 50, 30, 50, 30);
        Slytherin gregoryGoyle = new Slytherin("Грегори", "Гойл", 70, 50, 70, 40, 30, 40, 30);

        Hufflepuff zachariahSmith = new Hufflepuff("Захария", "Смит", 70, 70, 90, 70, 90);
        Hufflepuff cedricDiggory = new Hufflepuff("Седрик", "Диггори", 100, 100, 100, 100, 90);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Джастин", "Финч-Флетчли", 70, 90, 60, 90, 60);

        Ravenclaw zhouChang = new Ravenclaw("Чжоу", "Чанг", 80, 60, 60, 50, 60, 50);
        Ravenclaw padmaPatil = new Ravenclaw("Падма", "Патил", 70, 50, 30, 50, 30, 50);
        Ravenclaw marcusBelby = new Ravenclaw("Маркус", "Белби", 50, 80, 50, 30, 50, 30);


        //Student.selectTopStudentOnFacultate(harryPotter, hermioneGranger);

        //Student.addTotalPoint(gregoryGoyle);


       //Student.selectTopStudent(gregoryGoyle, dracoMalfoy);

        //Student.printStudent(hermioneGranger);

    }
}
