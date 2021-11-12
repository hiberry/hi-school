package cc.chenzhihao.hischool.common.components;

import cc.chenzhihao.hischool.common.exception.BeanHolderException;
import cc.chenzhihao.hischool.common.utils.Precondition;

import java.util.Objects;

/**
 * AoC容器
 *
 * @author jacksonchenzhihao
 * @date 2021-11-11 14:33
 */
public final class BeanHolder {

    private static BeanContext context;

    private static void checkContext() {
        if (Objects.isNull(context)) {
            throw new BeanHolderException("BeanContext is not init");
        }
    }

    public static void setContext(BeanContext context) {
        Precondition.checkArgument(Objects.nonNull(context), "context can not be null");
        synchronized (BeanHolder.class) {
            BeanHolder.context = context;
        }
    }

    public static <T> T getBean(String name) {
        checkContext();
        return context.getBean(name);
    }

    public static <T> T getBean(Class<T> clazz) {
        checkContext();
        return context.getBean(clazz);
    }

    public static <T> T getBean(String name, Class<T> clazz) {
        checkContext();
        return context.getBean(name, clazz);
    }
}
