/*
Зачетное задание 
пример использование иерархии классов
Sorokoumov A.P.
*/

//абстрактный класс млекопитающих
abstract class Milk {
    abstract void calculate();
}

// парнокоптыные наследуют млекопитающих
abstract class TwoCopt extends Milk {
    // Общие свойства парнокопытных
    private boolean herbivore;             // травоядное или всеядное
    private boolean hasHooves;             // есть копыты или нет
    private boolean hasHorns;              // есть рога или нет
    private double averageWeight;          // средний вес
    private String habitat;                // где обитают

    // конструктор
    public TwoCopt(boolean herbivore, boolean hasHooves,
                             boolean hasHorns, double averageWeight, String habitat) {
        this.herbivore = herbivore;
        this.hasHooves = hasHooves;
        this.hasHorns = hasHorns;
        this.averageWeight = averageWeight;
        this.habitat = habitat;
    }

    // общие методы травоядное или всеядное
    public boolean isHerbivore() {
        return herbivore;
    }
    // есть копыты или нет
    public boolean hasHooves() {
        return hasHooves;
    }
    // есть рога или нет
    public boolean hasHorns() {
        return hasHorns;
    }
    // средний вес
    public double getAverageWeight() {
        return averageWeight;
    }
    // где обитают
    public String getHabitat() {
        return habitat;
    }

    // методы для вывода инсформации
    public void printGeneralInfo() {
        System.out.println("Парнокопытное животное:");
        System.out.println("Травоядное: " + herbivore);
        System.out.println("Наличие копыт: " + hasHooves);
        System.out.println("Наличие рогов: " + hasHorns);
        System.out.println("Средний вес: " + averageWeight + " кг");
        System.out.println("Среда обитания: " + habitat);
    }
}

// клас корова
class Cow extends TwoCopt {
    private double tailHeight; // высота хвоста

    public Cow(double tailHeight) {
        // задаем параметры для коровы
        super(true, true, true, 700, "фермы, пастбища");
        this.tailHeight = tailHeight;
    }

    // вычисление скорости по высоте хвоста
    @Override
    void calculate() {
        double speed = tailHeight * 2.5; // вычисление
        System.out.println("Корова: скорость передвижения = " + speed);
    }
}

// класс баран
class Ram extends TwoCopt {
    private double hornLength; // длина рогов

    public Ram(double hornLength) {
        // задаем параметры доля барана
        super(true, true, true, 90, "горные пастбища");
        this.hornLength = hornLength;
    }

    // вычисляем возраст
    @Override
    void calculate() {
        int age = (int)(hornLength * 3); 
        System.out.println("Баран: возраст = " + age);
    }
}

// класс конь наследует напрямую от млекопитающих так как не парноко
class Horse extends Milk {
    private double maneLength; // длина гривы

    public Horse(double maneLength) {
        this.maneLength = maneLength;
    }

    // вычиляе пол по длине гривы 
    @Override
    void calculate() {
        String gender = (maneLength > 15) ? "женский" : "мужской";
        System.out.println("Конь: пол = " + gender);
    }
}

// главный класс
public class Main {
    public static void main(String[] args) {
        Cow cow = new Cow(10.0);
        Ram ram = new Ram(7.5);
        Horse horse = new Horse(20.0);

        //выводим общую инфу для коровы
        cow.printGeneralInfo();
        //вычисляем для коровы
        cow.calculate();

        System.out.println();

        // выводлим общую инфу для барана
        ram.printGeneralInfo();
        //вычиялем для барана
        ram.calculate();

        System.out.println();

        // вычисляем для барана пол, общих свойств парнокоптыных нет
        horse.calculate();
    }
}
