package pl.bgawron.ustalterminapi.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.bgawron.ustalterminapi.model.User;
import pl.bgawron.ustalterminapi.service.UserService;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class UserApi {

    private final UserService userService;

    @Autowired
    public UserApi(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/admin/all")
    public Iterable<User> getAll() {
        return userService.findAllUser();
    }

    @GetMapping("/admin/{index}")
    public  @ResponseBody Optional<User> getUserById(@PathVariable Long index){
        return userService.findById(index);
    }

    @PostMapping("/admin")
    public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @PutMapping("/admin")
    public User updateUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @DeleteMapping("/admin")
    public void deleteUser(@PathVariable Long index) {
        userService.deleteById(index);
    }

}
