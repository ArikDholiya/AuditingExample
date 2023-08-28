package com.AuditExample.auditing.Configuration;
//package com.AuditExample.auditing.Configuration;

//import com.AuditExample.auditing.Interceptor.BookInterceptor;
import com.AuditExample.auditing.Interceptor.BookInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {
    @Autowired
    private BookInterceptor bookInterceptor;

//    public InterceptorConfig(BookInterceptor bookInterceptor) {
//        this.bookInterceptor = bookInterceptor;
//    }
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(bookInterceptor);
    }
}
