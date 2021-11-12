package cc.chenzhihao.hischool.bootstrap.component;

import cc.chenzhihao.hischool.common.components.BeanContext;
import cc.chenzhihao.hischool.common.components.BeanHolder;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author jacksonchenzhihao
 * @date 2021-11-11 15:18
 */
@Component
public class SpringBeanContext implements BeanContext, ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
        BeanHolder.setContext(this);
    }

    @Override
    public <T> T getBean(String name) {
        return (T) applicationContext.getBean(name);
    }

    @Override
    public <T> T getBean(Class<T> clazz) {
        return applicationContext.getBean(clazz);
    }

    @Override
    public <T> T getBean(String name, Class<T> clazz) {
        return applicationContext.getBean(name, clazz);
    }

}
