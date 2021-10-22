import java.util.Scanner;

/* Администратор отеля */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hotel hotel = new Hotel(new Room[]{
                new Room(11, 2, true, true, true),
                new Room(12, 3, true, true, true),
                new Room(13, 2, true, true, true),
                new Room(14, 1, false, true, true),
                new Room(21, 4, false, false, false),
                new Room(22, 3, false, true, false),
                new Room(23, 4, false, false, false),
                new Room(24, 4, true, true, false),
                new Room(31, 4, true, true, true),
                new Room(32, 1, false, true, false),
                new Room(33, 1, false, false, false),
                new Room(34, 4, true, true, false)
        });
        String help = "*--------*\n" +
                "exit - выход из программы\n" +
                "getFreeRooms (wc:[true|false]) (sleepingPlace:[кол-во мест]) (conditioner:[true|false]) (wifi:[true|false]) - получить список свободных комнат\n" +
                "reserve [номер комнаты] - забронировать комнату\n" +
                "getReservedRooms - показать забронированные комнаты\n" +
                "help - вывод подсказки по командам\n" +
                "*--------*";

        // getFreeRooms wc:true sleepingPlace:4 conditioner:true wifi:true
        // getFreeRooms sleepingPlace:3
        System.out.println(help);
        String command = scanner.nextLine();
        while (!command.equals("exit")){
            if(command.equals("getFreeRooms")){
                hotel.getFreeRooms();
            }else if(command.indexOf("getFreeRooms") == 0){
                String[] splitted = command.split(" "); // ["getFreeRooms", "wc:true", "sleepingPlace:4", "conditioner:true", "wifi:true"]
                boolean wc = false;
                int sleepingPlace = 0;
                boolean wifi = false;
                boolean conditioner = false;
                for (int i = 1; i < splitted.length; i++) {
                    String[] service = splitted[i].split(":"); // ["wc", "true"]
                    if(service[0].equals("wc")) wc = service[1].equals("true");
                    else if(service[0].equals("sleepingPlace")) sleepingPlace = Integer.parseInt(service[1]);
                    else if(service[0].equals("conditioner")) conditioner = service[1].equals("true");
                    else if(service[0].equals("wifi")) wifi = service[1].equals("true");
                }
                hotel.getFreeRooms(wc,sleepingPlace, conditioner, wifi, splitted.length-1);
            }else if(command.indexOf("reserve") == 0){
                String[] splitted = command.split(" "); // ["reserve", "13"]
                int roomNumber = Integer.parseInt(splitted[1]);
                hotel.reserve(roomNumber);
            }else if(command.equals("getReservedRooms")){
                hotel.getReservedRooms();
            }else if(command.equals("help")){
                System.out.println(help);
            }else{
                System.out.println("Неизвестная команда");
            }
            command = scanner.nextLine();
        }
    }
}
