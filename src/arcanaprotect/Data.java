package arcanaprotect;

import java.util.Date;

public class Data {
    private static Data instance = null;

    /**
     * Айди пользователя
     */
    private int id;
    /**
     * Логин пользователя
     */
    private String name;
    /**
     * Роль пользователя (Enum)
     */
    private Role role;
    /**
     * Дата окончания подписки
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
     * Возвращает айди пользователя
     * @return id
     */

    public int getId() {
        return id;
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
     * Возвращает имя пользователя
     * @return name
     */

    public String getName() {
        return name;
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
     * Возвращает роль пользователя (Enum)
     * @return role
     */

    public Role getRole() {
        return role;
    }

    /**
     * Возвращает роль пользователя (String)
     * @return roleName
     */

    public String getRoleName() {
        String role = getRole().name();
        return Character.toString(role.toLowerCase().charAt(0)).toUpperCase() + role.toLowerCase().substring(1);
    }

    /**
     * Устанавливает роль пользователю
     * @return this
     */

    public Data setRole(Role role) {
        this.role = role;
        return this;
    }

    /**
     * Возвращает дату окончания подписки
     * @return expirationDate
     */

    public Date getExpirationDate() {
        return expirationDate;
    }

    /**
     * Устанавливает дату окончания подписки
     * @return this
     */

    public Data setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
        return this;
    }
}
