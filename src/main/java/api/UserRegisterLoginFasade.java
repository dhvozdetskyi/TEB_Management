package api;

import entity.User;

public interface UserRegisterLoginFasade {
    boolean registerUser(User user);
    boolean loginUser(String login, String password);
}