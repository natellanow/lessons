package task06ClimbersGroup;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    Mountain Elbrus = new Mountain("Эльбрус","Россия",5643);
    Mountain Ushba = new Mountain("Ушба", "Грузия", 4700);
    Mountain Beluha = new Mountain("Белуха", "Россия", 4506);

    Climber Grigoriy = new Climber("Григорий","Санкт-Петербург");
    Climber Valentin = new Climber("Валентин", "Москва");
    Climber Alexandr = new Climber("Александр", "Архангельск");
    Climber Ivan = new Climber("Иван", "Красноярск");
    Climber Julia = new Climber("Юлия", "Самара");


    Group group01 = new Group(Elbrus, false);
       group01.addClimber(Grigoriy);
       group01.addClimber(Valentin);
       group01.addClimber(Alexandr);

    Group group02 = new Group(Ushba, true);
       group02.addClimber(Ivan);
       group02.addClimber(Julia);

    Group group03 = new Group(Beluha, true);
       group03.addClimber(Grigoriy);
       group03.addClimber(Julia);

       System.out.println(Arrays.toString(group01.getClimbers()));
       System.out.println(group02.isOpen());


}
