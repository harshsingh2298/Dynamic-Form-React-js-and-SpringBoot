package harsh.singh.dynamic_Backend.service;

import harsh.singh.dynamic_Backend.model.User;
import harsh.singh.dynamic_Backend.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceIMPL implements UserService {
    @Autowired
    private UserRepo userRepo;

    public void saveUsers(List<User> users) {
        userRepo.saveAll(users);
    }

    @Override
    public void deleteUser(String email) {

        userRepo.deleteById(email);
    }

    @Override
    public List<User> getAll() {
        return userRepo.findAll();
    }
}
