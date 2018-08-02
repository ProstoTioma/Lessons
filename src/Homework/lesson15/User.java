package Homework.lesson15;

public class User {
    private long id;
    private String name;
    private String sessiondId;

    public User(long id, String name, String sessiondId) {
        this.id = id;
        this.name = name;
        this.sessiondId = sessiondId;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSessiondId() {
        return sessiondId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (id != user.id) return false;
        if (!name.equals(user.name)) return false;
        return sessiondId.equals(user.sessiondId);
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + name.hashCode();
        result = 31 * result + sessiondId.hashCode();
        return result;
    }
}
