import java.util.ArrayList;

public class UserManager {
    private ArrayList<User> list = new ArrayList<>();

    public void addUser(User user) {
        list.add(user);
    }

    public void removeUser(User user) {
        list.remove(user);
    }

    public User findUser(String name) {
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            if (user.getName().equals(name)) {
                return user;
            }
        }
        return null;
    }

    public void printUsers() {
        System.out.println("----- UserManager.printUsers -----");
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            System.out.println("이름 : " + user.getName() + ", 나이 : " + user.getAge());
        }
    }
}
