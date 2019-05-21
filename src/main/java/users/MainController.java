package users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;


@Controller    // This means that this class is a Controller
@RequestMapping(path="/demo") // This means URL's start with /demo (after users.Application path)
public class MainController {



    @Autowired
    private OrderfRepository orderfRepository;
    @Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data
    private UserRepository userRepository;

    @PostMapping(path="/add") // Map ONLY GET Requests
    public @ResponseBody User addNewUser (@RequestParam String name, @RequestParam String email, @RequestParam String password,  @RequestParam String phone) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        User user = new User(name, email, password, phone);

        return userRepository.save(user);
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<User> getAllUsers() {
        // This returns a JSON or XML with the users
        return userRepository.findAll();
    }

    @GetMapping(path="/user")
    public @ResponseBody Iterable<User> getUser(@RequestParam String name) {
        // This returns a JSON or XML with the users
        List<User> users = userRepository.findByName(name);
        return users;
    }
    @GetMapping(path="/email")
    public @ResponseBody Iterable<User> getEmailUser(@RequestParam String name) {
        // This returns a JSON or XML with the users
        List<User> users = userRepository.findByName(name);
        ArrayList<String> emeils = new ArrayList<>(users.size());
        for (int i = 0; i < users.size(); i++) {
            emeils.add(users.get(i).getEmail());
        }

        return (List)emeils;
    }
    @GetMapping(path="/passforemail")
    public @ResponseBody Iterable<User> getPasswordUser(@RequestParam String email) {
        // This returns a JSON or XML with the users
        List<User> users = userRepository.findByEmail(email);
        ArrayList<String> passwords = new ArrayList<>(users.size());
        for (int i = 0; i < users.size(); i++) {
            passwords.add(users.get(i).getPassword());
        }

        return (List)passwords;
    }
    @GetMapping(path="/passforphone")
    public @ResponseBody Iterable<User> getPasswordUserPhone (@RequestParam String phone) {
        // This returns a JSON or XML with the users
        List<User> users = userRepository.findByPhone(phone);
        ArrayList<String> passwords = new ArrayList<>(users.size());
        for (int i = 0; i < users.size(); i++) {
            passwords.add(users.get(i).getPassword());
        }

        return (List)passwords;
    }
    @GetMapping(path="/nameforemail")
    public @ResponseBody Iterable<User> getNameForEmaile (@RequestParam String email) {
        // This returns a JSON or XML with the users
        List<User> users = userRepository.findByEmail(email);
        ArrayList<String> names = new ArrayList<>(users.size());
        for (int i = 0; i < users.size(); i++) {
            names.add(users.get(i).getName());
        }

        return (List)names;
    }
    @GetMapping(path="/phoneforemail")
    public @ResponseBody Iterable<User> getPhoneForEmaile (@RequestParam String email) {
        // This returns a JSON or XML with the users
        List<User> users = userRepository.findByEmail(email);
        ArrayList<String> phones = new ArrayList<>(users.size());
        for (int i = 0; i < users.size(); i++) {
            phones.add(users.get(i).getPhone());
        }

        return (List)phones;
    }
    @PostMapping(path="/addorder") // Map ONLY GET Requests
    public @ResponseBody
    Orderf addNewOrder (@RequestParam String email2, @RequestParam String nameOrder, @RequestParam String textOrder, @RequestParam String priseOrder, @RequestParam Boolean programingTag,
                        @RequestParam Boolean videoTag, @RequestParam Boolean photoTag, @RequestParam Boolean disigneTag, @RequestParam Boolean gameTag) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request
        Orderf orderf = new Orderf(email2, nameOrder, textOrder, priseOrder, programingTag, videoTag, photoTag, disigneTag, gameTag);
        return orderfRepository.save(orderf);
    }
    @GetMapping(path="/allorder")
    public @ResponseBody Iterable<Orderf> getAllOrder(){
        return orderfRepository.findAll();
    }
    
    @DeleteMapping(path = "delorder")
    public @ResponseBody void delOrderf(@RequestParam Integer id){
        orderfRepository.deleteById(id);
    }




}
