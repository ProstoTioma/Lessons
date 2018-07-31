package Homework.lesson9;

public class UserRepository {
    public User[] users = new User[10];

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

        int countPlaced = 0;
        for (User us : users) {
            if (us != null) {
                countPlaced++;
            }
        }
        if (countPlaced > 9)
            return null;

        int index = 0;
        for (User us : users) {
            if (us == null) {
                users[index] = user;
                break;
            }
            index++;
        }
        return user;
    }

    public User update(User user) {
        if (user == null)
            return null;

        User curUser = findById(user.getId());
        if (curUser == null)
            return null;

        long curUserId = curUser.getId();

        int index = 0;
        for (User us : users) {
            if (us != null && us.getId() == curUserId) {
                users[index] = user;
                break;
            }
            index++;
        }
        return user;
    }

    public User delete(long id) {
        User user = findById(id);

        int index = 0;
        for (User us : users) {
            if (user != null && id == user.getId()) {
                return user;
            }
        }
        return null;
    }
}