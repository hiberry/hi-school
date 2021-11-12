package cc.chenzhihao.hischool.common.components;

/**
 * Bean容器
 *
 * @author jacksonchenzhihao
 * @date 2021-11-11 14:34
 */
public interface BeanContext {

    /**
     * 根据名称获取Bean
     *
     * @param name Bean名称
     * @param <T>  Bean类型
     * @return Bean
     */
    <T> T getBean(String name);

    /**
     * 根据类型获取Bean
     *
     * @param clazz Bean类型
     * @param <T>   Bean类型
     * @return Bean
     */
    <T> T getBean(Class<T> clazz);

    /**
     * 根据Bean名字和类型获取Bean
     *
     * @param name  Bean名称
     * @param clazz Bean类型
     * @param <T>   Bean类型
     * @return Bean
     */
    <T> T getBean(String name, Class<T> clazz);

}
