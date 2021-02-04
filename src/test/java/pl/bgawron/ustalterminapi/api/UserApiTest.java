package pl.bgawron.ustalterminapi.api;

import junit.framework.TestCase;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pl.bgawron.ustalterminapi.model.User;
import pl.bgawron.ustalterminapi.repository.UserRepository;
import pl.bgawron.ustalterminapi.service.UserService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {})
public class UserApiTest extends TestCase {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    Optional<User> userOne, userTwo = Optional.empty();

    @Before
    public void createExampleUser(){
        userOne = Optional.of(userService.addUser(new User((long) 1,"user1".toCharArray(),"123".toCharArray(),"user1","user1",null,"MODERATOR")));
        userTwo = Optional.of(userService.addUser(new User((long) 2,"user2".toCharArray(),"123".toCharArray(),"user2","user2",null,"ADMIN")));
    }

    @Test
    public void testGetAll() {
        //given
        userService = mock(UserService.class);
        given(userService.findAllUser()).willReturn(prepareMockData());
        //when
        List<User> userList = userService.findAllUser();
        //then
        Assert.assertThat(userList, Matchers.hasSize(2));
    }

    private List<User> prepareMockData(){
        List<User> users = new ArrayList<>();
        users.add(new User((long) 1,"user1".toCharArray(),"123".toCharArray(),"user1","user1", null,"MODERATOR"));
        users.add(new User((long) 2,"admin".toCharArray(),"admin123".toCharArray(),"admin","admin",null,"ADMIN"));
        return users;
    }

    @Test
    public void testGetUserById() {
        //given
        //when
        //then
    }

    @Test
    public void testAddUser() {
        //given
        userService = mock(UserService.class);
        given(userService.addUser(Mockito.any(User.class)))
                .willReturn(new User((long) 1,"user1".toCharArray(),"123".toCharArray(),"user1","user1",null,"MODERATOR"));
        //when
        User user = userService.addUser(new User());
        //then
        Assert.assertEquals(user.getName(),"user1");
    }

    @Test
    public void testUpdateUser() {
        //given
        //when
        //then
    }

    @Test
    public void testDeleteUser() {
        //given
        createExampleUser();
        //when
        userService.deleteById(userOne.get().getId());
        //then
        assertNotNull("DeleteById",userService.findById(userOne.get().getId()));
    }
}