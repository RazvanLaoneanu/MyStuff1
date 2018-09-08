package SDAcademy.mobile.shop.controller;

import java.util.List;

import SDAcademy.mobile.shop.entity.Phone;
import SDAcademy.mobile.shop.repository.PhoneRepository;
import SDAcademy.mobile.shop.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
@RequestMapping("/phone")
public class PhoneController {

    // need to inject our customer service
    @Autowired
    private PhoneService phoneService;

    @GetMapping("/list")
    public String listCustomers(Model theModel) {

        // get customers from the service
        List<Phone> thePhones = phoneService.getPhones();

        // add the customers to the model
        theModel.addAttribute("phones", thePhones);

        return "list-phones";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model theModel) {

        // create model attribute to bind form data///ask about the s at the end
        Phone thePhones = new Phone();

        theModel.addAttribute("phone", thePhones);

        return "phone-form";
    }

    @PostMapping("/saveUser")
    public String saveCustomer(@ModelAttribute("customer") Phone thePhone) {

        // save the customer using our service
        phoneService.savePhone(thePhone);
        return "redirect:/phone/list";
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("phoneId") int theId,
                                    Model theModel) {

        // get the customer from our service
        Phone thePhone = phoneService.getPhone(theId);


        // set customer as a model attribute to pre-populate the form
        theModel.addAttribute("customer", thePhone);

        // send over to our form
        return "phone-form";
    }

    @GetMapping("/delete")
    public String deletePhone(@RequestParam("phoneID")int theId) {

        phoneService.deletePhone(theId);

        return "redirect:/phone/list";
    }

}
