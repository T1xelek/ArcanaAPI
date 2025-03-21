package arcanaprotect;

import java.util.Date;

public class Data {
    private static Data instance = null;

    /**
     * Айди пользователя
     * -- GETTER --
     *  Возвращает айди пользователя
     *

     */
    private int id;
    /**
     * Логин пользователя
     * -- GETTER --
     *  Возвращает имя пользователя
     *

     */
    private String name;
    /**
     * Роль пользователя (Enum)
     * -- GETTER --
     *  Возвращает роль пользователя (Enum)
     *

     */
    private String role;
    /**
     * Дата окончания подписки
     * -- GETTER --
     *  Возвращает дату окончания подписки
     *

     */
    private Date expirationDate;

    /**
     * Возвращает объект с данными
     * @return data
     */

    public static Data getInstance() {
        if (instance == null) {
            instance = new Data();
        }
        return instance;
    }

    /**
     * Устанавливает айди пользователю
     * @return this
     */

    public Data setId(int id) {
        this.id = id;
        return this;
    }

    /**
     * Устанавливает имя пользователю
     * @return this
     */

    public Data setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Устанавливает роль пользователю
     * @return this
     */

    public Data setRole(String role) {
        this.role = role;
        return this;
    }

    /**
     * Устанавливает дату окончания подписки
     * @return this
     */

    public Data setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
        return this;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public String getRole() {
        return role;
    }
}