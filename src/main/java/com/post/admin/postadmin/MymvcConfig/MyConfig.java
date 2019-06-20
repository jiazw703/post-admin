package com.post.admin.postadmin.MymvcConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
public class MyConfig extends WebMvcConfigurerAdapter {

    @Configuration
    public class MyWebMvcConfigurerAdapter extends WebMvcConfigurerAdapter {
        /**
         * 配置静态访问资源
         * @param registry
         */

        public void addResourceHandlers(ResourceHandlerRegistry registry) {
            registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
            super.addResourceHandlers(registry);
        }
    }

    //所有的WebMvcConfigurerAdapter组件都会一起起作用
    @Bean //将组件注册在容器
    public WebMvcConfigurerAdapter webMvcConfigurerAdapter(){
        WebMvcConfigurerAdapter adapter = new WebMvcConfigurerAdapter() {
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                registry.addViewController("/").setViewName("login");

                registry.addViewController("/main.html").setViewName("myIndex");
                registry.addViewController("/dept.html").setViewName("dept");
                registry.addViewController("/emp.html").setViewName("emp");
                registry.addViewController("/user.html").setViewName("user");
                registry.addViewController("/empwork.html").setViewName("empwork");
            }

            //注册拦截器

            public void addInterceptors(InterceptorRegistry registry) {
                //super.addInterceptors(registry);
                //静态资源；  *.css , *.js
                //SpringBoot已经做好了静态资源映射
//                registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**")
//                        .excludePathPatterns("/index.html","/","/user/login");
            }
        };
        return adapter;
    }

//
//    @Bean
//    public WebMvcConfigurer corsConfigurer() {
//
//        return new WebMvcConfigurer() {
//
//            @Override
//
//            //重写父类提供的跨域请求处理的接口
//
//            public void addCorsMappings(CorsRegistry registry) {
//
//                //添加映射路径
//
//                registry.addMapping("/**")
//
//                        //放行哪些原始域
//
//                        .allowedOrigins("*")
//
//                        //是否发送Cookie信息
//
//                        .allowCredentials(true)
//
//                        //放行哪些原始域(请求方式)
//
//                        .allowedMethods("GET","POST", "PUT", "DELETE")
//
//                        //放行哪些原始域(头部信息)
//
//                        .allowedHeaders("*")
//
//                        //暴露哪些头部信息（因为跨域访问默认不能获取全部头部信息）
//
//                        .exposedHeaders("Header1", "Header2");
//
//            }
//
//        };
//
//    }



}
