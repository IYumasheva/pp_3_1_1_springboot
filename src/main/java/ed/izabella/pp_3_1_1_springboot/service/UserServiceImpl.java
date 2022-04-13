package ed.izabella.pp_3_1_1_springboot.service;

import ed.izabella.pp_3_1_1_springboot.dao.UserDAO;
import ed.izabella.pp_3_1_1_springboot.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserDAO userDaoImpl;

    public UserServiceImpl(UserDAO userDaoHib) {
        this.userDaoImpl = userDaoHib;
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> index() {
        return userDaoImpl.index();
    }

    @Override
    @Transactional(readOnly = true)
    public User show(int id){
        return userDaoImpl.show(id);
    }

    @Override
    @Transactional
    public void save(User user) {
        userDaoImpl.save(user);
    }

    @Override
    @Transactional
    public void update(User updatedUser){ userDaoImpl.update(updatedUser); }

    @Override
    @Transactional
    public void delete(int id) {
        userDaoImpl.delete(id);}
}
