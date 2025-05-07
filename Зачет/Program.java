/* Зачетное задание "Пример использования Иерархии классов в Java"
    В данной программе мы можем записать Имена автомобилей и 
    с помощью классов получить ранее введееннные характеристики
    Sorokoumov
 */
public class Program{
      
    public static void main(String[] args) {
             
        Car FirstCar = new Car("LadaCalina");                                      // с помощью  класса Car мы получим имя автомобиля
        FirstCar.display();
        Car SecondCar = new Tip("NissanXtaril", "Crossover");                  // с помощью класса Tip мы получим имя и тип автомобиля
        SecondCar.display();
        Car FirdCar = new Transmission("LadaNiva","Crossover", "Mechanical",150);   // с помощью класса Tramsmission мы получим имя, тип, тип трансмиссии и макс скорость
        FirdCar.display();
        
    }
}
// Данный класс получает имя автомобиля а после по средствам public getName() позволяет возвращать имя в другие классы 
class Car {
    private String name; 
    public String getName() { return name; }
    public Car(String name){
     
        this.name=name;
    }
  
    public void display(){
        System.out.printf("Car %s\n", name);
    }
}
// Данный класс получает имя и тип возвращает имя через класс Сar и возвращает Имя и Тип
class Tip extends Car{
    private String tip;
    
    public Tip(String name, String tip) {
        
        super(name);
        this.tip = tip;
        
    }
    public String getTip(){ return tip; }
    public void display(){
         
        System.out.printf("This car: %s this: %s\n",super.getName(),tip);
    }
}
// Данный класс получает имя из класса Car и возвращает Имя Тип Транссмиссию и Скорость
class Transmission extends Car{    

    private String trans;
    private float speed;
    private String tip;
    

    public Transmission(String name, String tip, String trans, float speed) {
        super(name);
        this.trans=trans;
        this.speed=speed;
        this.tip=tip;
            if (name == "LadaNiva") {
                System.out.printf("Please do not accelerate in this car. ");
            }
        

    }
       
    public void display(){
           
        System.out.printf("This car: %s and %s have transmission: %s Max speed: %s  \n", super.getName(), tip, trans,speed);
       
    }
     
    public String getTrans(){ return trans; }
    public float getSpeed(){ return speed; }
}
