package SDAcademy.mobile.shop.service;

import SDAcademy.mobile.shop.entity.Phone;
import SDAcademy.mobile.shop.entity.User;

import java.util.List;

public interface UserService {

    public List<User> getPhones();

    public void savePhone(User theUser);

    public Phone getUSer(int theId);

    public void deleteUser(int theId);

}
