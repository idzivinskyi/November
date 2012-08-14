package november;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: november
 * @date: 14.08.12
 */
public class AppContext implements ApplicationContextAware {

    private static ApplicationContext ctx;

    /**
     * Injected from the class "ApplicationContextProvider" which is automatically
     * loaded during Spring-Initialization.
     */
    @Override
    @Resource
    public void setApplicationContext(ApplicationContext applicationContext) {
        ctx = applicationContext;
    }

    /** Get access to the Spring ApplicationContext from everywhere in your Application. */
    public static ApplicationContext getApplicationContext() {
        return ctx;
    }

    public void destroy() {
        ctx = null;
    }
}