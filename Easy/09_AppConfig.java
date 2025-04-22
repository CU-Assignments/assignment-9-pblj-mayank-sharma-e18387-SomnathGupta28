import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Course course() {
        return new Course("Java Programming", "3 months");
    }

    @Bean
    public Student student() {
        return new Student("John Doe", course());
    }
}