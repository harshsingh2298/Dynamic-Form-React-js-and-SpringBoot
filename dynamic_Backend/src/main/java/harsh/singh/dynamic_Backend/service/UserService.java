package harsh.singh.dynamic_Backend.service;

import harsh.singh.dynamic_Backend.model.User;

import java.util.List;


public interface UserService {
    public void saveUsers(List<User> users);
    public void deleteUser(String email);
    List<User> getAll();
}
