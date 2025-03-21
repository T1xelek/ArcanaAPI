package example;

import arcanaprotect.Data;

import java.util.Date;

/**
 * Этот класс показывает как можно работать с API
 */
public class Main {
    public static void main(String[] args) {
        /// Для работы в режиме разработки клиента
        Data.getInstance().setName("Test").setId(1).setRole("DEVELOPER").setExpirationDate(new Date());

        /// Пример получения информации о юзере
        Data data = Data.getInstance();
        String name = data.getName();
        int id = data.getId();
        String role = data.getRole();
        Date expirationDate = data.getExpirationDate();

        /// Выводим данные
        System.out.printf("""
                Login: %s
                ID: %s
                Role: %s
                Date: %s
                """, name, id, role, expirationDate.toString());
    }
}
