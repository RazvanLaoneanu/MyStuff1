package SDAcademy.mobile.shop.service;

import SDAcademy.mobile.shop.entity.Phone;
import SDAcademy.mobile.shop.entity.User;
import SDAcademy.mobile.shop.repository.PhoneRepository;
import SDAcademy.mobile.shop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getPhones() {
        List<User> users = new ArrayList<>();
        userRepository.findAll().forEach(users::add);

        return users;
    }

    @Override
    public void saveUser(User theUser) {

        userRepository.save(theUser);

    }

    @Override
    public Phone getUser(int theId) {

        return userRepository.findById(theId).get();
    }

    @Override
    public void deleteUser(int theId) {

        User user = userRepository.findById(theId).get();
        userRepository.delete(phone);

    }
}
