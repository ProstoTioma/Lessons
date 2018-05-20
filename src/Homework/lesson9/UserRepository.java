package Homework.lesson9;

public class UserRepository {
    public User[] users;


    public UserRepository(User[] users) {
        this.users = users;
    }

    public User[] getUsers() {
        return users;
    }

    public String[] getUserNames() {
        String[] names = new String[countUsers()];

        int index = 0;
        for (User user : users) {
            if (user != null) {
                names[index] = user.getName();
            }
        }
        return names;
    }

    private int countUsers() {
        int countUsers = 0;
        for (User user : users) {
            if (user != null)
                countUsers++;
        }
        return countUsers;
    }

    public long[] getUserIds() {
        long[] id = new long[countUsers()];

        int index = 0;
        for (User user : users) {
            if (user != null) {
                id[index] = user.getId();
            }
        }
        return id;
    }

    public String getUserNameById(long id) {
        for (User u : users) {
            if (u != null && u.getId() == id) {
                return u.getName();
            }
        }
        return null;
    }

    public User getUserByName(String name) {
        for (User u : users) {
            if (u != null && u.getName() == name) {
                return u;
            }
        }
        return null;

    }

    private User findById(long id) {
        for (User user : users) {
            if (user != null && id == user.getId()) {
                return user;
            }
        }
        return null;
    }

    public User getUserBySessionId(String sessionId) {
        String[] names = new String[countUsers()];
        for (User u : users) {
            if (u != null && u.getSessionId() == sessionId) {
                return u;
            }
        }
        return null;
    }

    public User save(User user) {
        if (user == null)
            return null;

        if (findById(user.getId()) != null)
            return null;

        for (int index = 0; index < users.length; index++) {

            if (users[index] == null) {
                users[index] = user;
                return users[index];
            }

        }
        return null;
    }

    public User update(User user) {
        for (int i = 0; i < users.length; i++) {
            User u = users[i];
            if (u != null && u.getId() == user.getId()) {
                users[i] = user;
                return users[i];
            }
        }
        return null;
    }

    public void delete(long id) {
        for (int i = 0; i < users.length; i++) {
            User u = users[i];
            if (u != null && u.getId() == id) {
                users[i] = null;
            }
        }
    }

}