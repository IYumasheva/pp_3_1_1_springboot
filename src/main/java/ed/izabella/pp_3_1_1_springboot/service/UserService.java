package ed.izabella.pp_3_1_1_springboot.service;

import ed.izabella.pp_3_1_1_springboot.model.User;

import java.util.List;

public interface UserService {

    List<User> index();

    User show(int id);

    void save(User user);

    void update(User updatedUser);

    void delete(int id);
}
