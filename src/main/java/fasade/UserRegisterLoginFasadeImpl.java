package fasade;

import api.UserRegisterLoginFasade;
import api.UserService;
import entity.User;
import service.UserServiceImpl;

public class UserRegisterLoginFasadeImpl implements UserRegisterLoginFasade {
    private UserService userService = UserServiceImpl.getInstance();
    private static UserRegisterLoginFasade instance = null;

    private UserRegisterLoginFasadeImpl() {

    }

    public static UserRegisterLoginFasade getInstance() {
        if (instance == null) {
            instance = new UserRegisterLoginFasadeImpl();
        }
        return instance;
    }

    public boolean registerUser(User user) {
        return userService.addUser(user);
    }

    public boolean loginUser(String login, String password) {
        if (userService.isCorrectLoginAndPassword(login, password)) {
            return true;
        }

        return false;
    }


}