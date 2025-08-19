public class Main {
    public static void main(String[] args) {
        // Переменная для хранения стоимости билета
        int ticketPrice = 13676; // Можно изменить на любую другую стоимость

        // Переменная для хранения количества рублей для одной бонусной мили
        int rublesPerMile = 20;

        // Рассчитываем количество бонусных миль
        int bonusMiles = ticketPrice / rublesPerMile;

        // Выводим результат на экран
        System.out.println("За билет стоимостью " + ticketPrice + " рублей начислено " + bonusMiles + " бонусных миль.");
    }
}