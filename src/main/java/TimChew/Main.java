package TimChew;
import java.util.Scanner;

class Ward {
    private String doctor;
    private byte places;
    private boolean is_avalible;

    private void set_doctor(String d){
        doctor = d;
    }
    private void set_places(byte p){
        places = p;
    }
    private void set_is_avalible(boolean i){
        is_avalible = i;
    }

    private String get_doctor(){
        return doctor;
    }
    private byte get_places(){
        return places;
    }
    private boolean get_is_avalible(){
        return is_avalible;
    }
    public Ward(){
        set_doctor("Семёныч");
        set_places((byte)5);
        set_is_avalible(true);
    }
    public Ward(int i){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя доктора");
        set_doctor(in.nextLine());
        System.out.println("Введите количество мест");
        set_places(in.nextByte());
        System.out.println("Есть ли места (да-true, нет-false)");
        set_is_avalible(in.nextBoolean());
    }

    public Ward(String d, byte p, boolean i){
        set_doctor(d);
        set_places(p);
        set_is_avalible(i);
    }

    public void show_data(){
        Scanner in = new Scanner(System.in);
        System.out.println("1. Вывести имя врача\n2. Вывести число коек\n3. Есть ли свободные места");
        switch(in.next()){
            case "1":
                System.out.println(get_doctor());
                break;
            case "2":
                System.out.println(get_places());
                break;
            case"3":
                System.out.println(get_is_avalible());
                break;
            default:
                System.out.println("Эээ. Некорректный ввод");
        }
    }
}

class WriterInfo {
    public void write_info(Ward w) {
        w.show_data();
    }
}

public class Main {
    public static void main(String[] args) {
        Ward num_1 = new Ward();
        WriterInfo w = new WriterInfo();
        boolean is_executed = false;
        Scanner in = new Scanner(System.in);
        while(!is_executed) {
            System.out.println("1. Обновить данные палаты\n2. Вывести данные палаты\n3. Завершить");
            switch(in.next()){
                case "1":
                    num_1 = new Ward(0);                    break;
                case "2":
                    w.write_info(num_1);
                    break;
                case"3":
                    is_executed = true;
                    break;
                default:
                    System.out.println("Эээ. Некорректный ввод");
            }
        }
    }
}