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

        if (findUserById(user.getId()) != null)
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

        User curUser = findUserById(user.getId());
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

    public void delete(long id) {
        User user = findUserById(id);

        int index = 0;
        for (User us : users) {
            if (us != null && us.equals(user) && us.hashCode() == user.hashCode()) {
                users[index] = null;
                break;
            }
            index++;
        }
    }

    private User findUserById(long id) {
        for (User user : users) {
            if (user != null && id == user.getId()) {
                return user;
            }
        }
        return null;
    }

    public User findUser(User user) {
        for(User us : users) {
            if(us != null && us.equals(user) && us.hashCode() == user.hashCode()) {
                return user;
            }
        }
        return null;
    }
}
