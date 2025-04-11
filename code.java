public class ticket {

    public static void main(String[] args) {
        int ticket_count = ticket_count();
        System.out.print("Количество счастливых билетов: " + ticket_count);
    }
    //пишем функцию для перебора всех вариантов от 000001 до 999999
    public static int ticket_count() {
        int count = 0;
        for (int ticket_number = 1; ticket_number <= 999999; ticket_number++) {
            if (ticket_happy(ticket_number)) {
                count++;
            }
        }
        return count;
    }
    //пишем функцию для отбора счастливых билетов
    public static boolean ticket_happy(int ticket_number) {
        // Преобразуем номер в строку и добавляем ведущие нули (если ширина строки меньше 6, то недостающие элементы дополняются нулями
        String ticket_str = String.format("%06d", ticket_number);
        //разделяем первую и вторую половину числа и складываем
        int sum_first = Character.getNumericValue(ticket_str.charAt(0)) + Character.getNumericValue(ticket_str.charAt(1)) + Character.getNumericValue(ticket_str.charAt(2));
        int sum_second = Character.getNumericValue(ticket_str.charAt(3)) + Character.getNumericValue(ticket_str.charAt(4)) + Character.getNumericValue(ticket_str.charAt(5));

        // Проверяем, равны ли суммы
        return sum_first == sum_second;
    }
}
