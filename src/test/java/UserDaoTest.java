import com.jvhuaxia.studyjpa.StartUpApplication;
import com.jvhuaxia.studyjpa.dao.UserDao;
import com.jvhuaxia.studyjpa.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = StartUpApplication.class)
public class UserDaoTest {

  @Autowired
  UserDao userDao;

  @Test
  public void test() {
    userDao.findAll();
  }

  @Test
  public void insert() {
    userDao.save(new User(12L, "A", "CC", "123"));
  }

  @Test
  public void selectByName() {
    User user = userDao.getByName("A");
    System.out.println(user);
  }
}
