package Config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.beans.JavaBean;
@Configuration
public class ModelMapperConfig {
    @Bean
    public ModelMapper getMapper(){
        return new ModelMapper();
    }

}
