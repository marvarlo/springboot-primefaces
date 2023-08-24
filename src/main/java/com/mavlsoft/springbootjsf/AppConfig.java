package com.mavlsoft.springbootjsf;

import static jakarta.faces.application.ProjectStage.PROJECT_STAGE_PARAM_NAME;
import static jakarta.faces.application.StateManager.STATE_SAVING_METHOD_CLIENT;
import static jakarta.faces.application.StateManager.STATE_SAVING_METHOD_PARAM_NAME;
import static jakarta.faces.application.ViewHandler.FACELETS_SKIP_COMMENTS_PARAM_NAME;
import static org.apache.myfaces.webapp.MyFacesContainerInitializer.FACES_SERVLET_ADDED_ATTRIBUTE;
import static org.apache.myfaces.webapp.MyFacesContainerInitializer.FACES_SERVLET_FOUND;
import org.apache.myfaces.spi.WebConfigProvider;
import org.apache.myfaces.spi.impl.DefaultWebConfigProvider;
import org.apache.myfaces.webapp.MyFacesContainerInitializer;
import org.apache.myfaces.webapp.StartupServletContextListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.ServletContextAware;
import org.springframework.web.jsf.el.SpringBeanFacesELResolver;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import com.mavlsoft.springbootjsf.utils.ViewScope;
import jakarta.el.ELResolver;
import jakarta.faces.application.ProjectStage;
import jakarta.faces.webapp.FacesServlet;
import jakarta.servlet.ServletContainerInitializer;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextListener;

@Configuration
public class AppConfig implements WebMvcConfigurer, ServletContextAware {
    private final static Logger LOG = LoggerFactory.getLogger(AppConfig.class);

    @Bean
    ServletRegistrationBean<FacesServlet> servletRegistrationBean() {
        LOG.info("Creating ServletRegistrationBean...");
        FacesServlet servlet = new FacesServlet();
        ServletRegistrationBean<FacesServlet> srb = new ServletRegistrationBean<FacesServlet>(servlet, "*.xhtml", "*.jsf", "/faces/*");
        srb.setLoadOnStartup(1);
        return srb;
    }

    @Bean
    ELResolver eLResolver() {
        LOG.info("Creating SpringBeanFacesELResolver...");
        return new SpringBeanFacesELResolver();
    }

    @Bean
    ServletContextListener getContextListener() {
        LOG.info("Configuring ServletContextListener...");
        StartupServletContextListener listener = new StartupServletContextListener();
        return listener;
    }

    @Bean
    ServletContainerInitializer getContainerInitializer() {
        LOG.info("Configuring ServletContainerInitializer...");
        ServletContainerInitializer initializer = new MyFacesContainerInitializer();
        return initializer;
    }
    @Bean
    static CustomScopeConfigurer getViewScope() {
        LOG.info("Configuring Custom View Scope...");
        CustomScopeConfigurer viewScope = new CustomScopeConfigurer();
        viewScope.addScope(ViewScope.VIEW, new ViewScope());
        return viewScope;
    }

    @Bean
    WebConfigProvider webConfig() {
        LOG.info("Creating WebConfigProvider...");
        WebConfigProvider provider = new DefaultWebConfigProvider();
        return provider;
    }

    @Override
    public void setServletContext(ServletContext context) {
        LOG.info("Setting servlet Context parameters...");
        context.setInitParameter(STATE_SAVING_METHOD_PARAM_NAME, STATE_SAVING_METHOD_CLIENT);
        context.setInitParameter(FACELETS_SKIP_COMMENTS_PARAM_NAME, Boolean.TRUE.toString());
        context.setInitParameter(PROJECT_STAGE_PARAM_NAME, ProjectStage.Development.toString());
        LOG.info("Setting servlet Context Attributes...");
        context.setAttribute(FACES_SERVLET_FOUND, Boolean.TRUE);
        context.setAttribute(FACES_SERVLET_ADDED_ATTRIBUTE, Boolean.TRUE);
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        LOG.info("Configuring addViewControllers...");
        registry.addViewController("/").setViewName("/index.xhtml");
    }

}
