package Homework.lesson15;

public class UserRepository {
    User[] users;

    public UserRepository(User[] users) {
        this.users = users;
    }

    public User[] getUsers() {
        return users;
    }

    public User save(User user) {
        if (user == null)
            return null;

        if (findUser(user.getId()) != null)
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
                users[index].equals(user);
                break;
            }
            index++;
        }
        return user;
    }

    public User update(User user) {
        if (user == null)
            return null;

        User curUser = findUser(user.getId());
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
        User user = findUser(id);

        int index = 0;
        for (User us : users) {
            if (us.equals(user)) {
                users[index] = null;
                break;
            }
            index++;
        }
        return user;
    }

    private User findUser(long id) {
        for (User user : users) {
            if (user != null && id == user.getId()) {
                return user;
            }
        }
        return null;
    }
}
