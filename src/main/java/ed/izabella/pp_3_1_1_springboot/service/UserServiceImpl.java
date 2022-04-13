package ed.izabella.pp_3_1_1_springboot.service;

import ed.izabella.pp_3_1_1_springboot.dao.UserDAO;
import ed.izabella.pp_3_1_1_springboot.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserDAO userDaoHib;

    public UserServiceImpl(UserDAO userDaoHib) {
        this.userDaoHib = userDaoHib;
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> index() {
        return userDaoHib.index();
    }

    @Override
    @Transactional(readOnly = true)
    public User show(int id){
        return userDaoHib.show(id);
    }

    @Override
    @Transactional
    public void save(User user) {
        userDaoHib.save(user);
    }

    @Override
    @Transactional
    public void update(User updatedUser){ userDaoHib.update(updatedUser); }

    @Override
    @Transactional
    public void delete(int id) {
        userDaoHib.delete(id);}
}
