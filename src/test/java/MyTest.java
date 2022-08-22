import com.sqw.pojo.Books;
import com.sqw.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {
    @Test
    public void getAllBooks(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService service = context.getBean("BookServiceImpl", BookService.class);
        List<Books> list = service.queryAllBook();
        for (Books books : list) {
            System.out.println(books);
        }
    }
}
