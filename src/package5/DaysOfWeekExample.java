package package5;

public class DaysOfWeekExample {

    public static void main(String[] args) {
        Day today = Day.MONDAY;

        // Проверка дня недели
        switch (today) {
            case MONDAY:
                System.out.println("Сегодня понедельник. Начало рабочей недели!");
                break;
            case TUESDAY:
                System.out.println("Сегодня вторник. Рабочая неделя продолжается.");
                break;
            case WEDNESDAY:
                System.out.println("Сегодня среда. Половина недели пройдена.");
                break;
            case THURSDAY:
                System.out.println("Сегодня четверг. Совсем скоро выходные!");
                break;
            case FRIDAY:
                System.out.println("Сегодня пятница. Последний рабочий день!");
                break;
            case SATURDAY:
                System.out.println("Сегодня суббота. Выходной день.");
                break;
            case SUNDAY:
                System.out.println("Сегодня воскресенье. Отдыхаем перед новой неделей.");
                break;
            default:
                System.out.println("Неизвестный день.");
        }
    }
}