/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spring2explore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 *
 * @author juang
 */
@EnableWebMvc
@Configuration
@ComponentScan(basePackages = {"com.mycompany.spring2explore"})
public class MvcConfig extends WebMvcConfigurerAdapter {

//    private static final Map<String, Definition> tiles = new HashMap<String, Definition>();
//    private static final Attribute TEMPLATE = new Attribute("/WEB-INF/views/layout/layout.jsp");
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    @Bean
    public InternalResourceViewResolver jspViewResolver() {
        InternalResourceViewResolver bean = new InternalResourceViewResolver();
        bean.setPrefix("/WEB-INF/views/");
        bean.setSuffix(".jsp");
        return bean;
    }

//    @Bean
//    public TilesConfigurer tilesConfigurer() {
//        TilesConfigurer tilesConfigurer = new TilesConfigurer();
//        //tilesConfigurer.setCompleteAutoload(true);
//        tilesConfigurer.setDefinitionsFactoryClass(JavaDefinitionsFactory.class);
//        tilesConfigurer.setDefinitions(new String[]{});
//
//        addDefinition("loginTiles", "Login Page", "/WEB-INF/views/login.jsp");
//        //addDefinition("signin", "Sign in", "/WEB-INF/views/signin.jsp");
//        //addDefinition("signin/facebook", "Sign in", "/WEB-INF/views/signin.jsp");
//
//        return tilesConfigurer;
//    }
//    private void addDefinition(String name, String title, String body) {
//        Map<String, Attribute> attributes = getDefaultAttributes();
//
//        attributes.put("title", new Attribute(title));
//        attributes.put("body", new Attribute(body));
//
//        tiles.put(name, new Definition(name, TEMPLATE, attributes));
//    }
//    private Map<String, Attribute> getDefaultAttributes() {
//        Map<String, Attribute> attributes = new HashMap<String, Attribute>();
//
//        attributes.put("header", new Attribute("/WEB-INF/views/layout/header.jsp"));
//        attributes.put("menu", new Attribute("/WEB-INF/views/layout/menu.jsp"));
//        attributes.put("footer", new Attribute("/WEB-INF/views/layout/footer.jsp"));
//
//        return attributes;
//    }
//    @Bean
//    public ViewResolver viewResolver() {
//        UrlBasedViewResolver viewResolver = new UrlBasedViewResolver();
//        viewResolver.setViewClass(TilesView.class);
//        return viewResolver;
//    }
//    public static class JavaDefinitionsFactory extends UnresolvingLocaleDefinitionsFactory {
//
//        public JavaDefinitionsFactory() {
//        }
//
//        public Definition getDefinition(String name,
//                TilesRequestContextHolder tilesContext) {
//            return tiles.get(name);
//        }
//    }
    //private @Inject UsersConnectionRepository usersConnectionRepository;
}
