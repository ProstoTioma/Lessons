package Homework.lesson9;

import java.util.Arrays;

public class Demo {
        public static void main(String[] args) {
            UserRepository userRepository = new UserRepository();

            System.out.println(Arrays.toString(userRepository.getUsers()));

            User user = new User(1001, "An", "1w21212");
            userRepository.save(user);

            System.out.println(Arrays.deepToString(userRepository.getUsers()));

            userRepository.save(user);
            System.out.println(Arrays.deepToString(userRepository.getUsers()));

            //сохранение юзера +
            //сохранение того же юзера +
            //когда нет места в массиве +
            //когда сохраняем null +

            int n = 15;
            while (n > 0) {
                User user1 = new User(n, "An", "1w21212");
                System.out.println(userRepository.save(user1));
                n--;

            }
            System.out.println(Arrays.deepToString(userRepository.getUsers()));

            userRepository.save(null);

            //test update
            user = new User(1001, "Ann", "eretertert");
            userRepository.update(user);
            System.out.println(Arrays.deepToString(userRepository.getUsers()));

            //обновление юзера +
            //когда нет юзера на обновление +
            //когда обновляем null +

            user = new User(9999, "Ann", "eretertert");
            System.out.println(userRepository.update(user));
            System.out.println(Arrays.deepToString(userRepository.getUsers()));

            System.out.println(userRepository.update(null));
            System.out.println(Arrays.deepToString(userRepository.getUsers()));

            //demo
            user = new User(300, "Ann", "ejrejm4");
            userRepository.delete(300);
            System.out.println(Arrays.deepToString(userRepository.getUsers()));


            //удаление юзера +
            //когда нет юзера на удаление +

            userRepository.delete(588);
            System.out.println(Arrays.deepToString(userRepository.getUsers()));
        }
    }
