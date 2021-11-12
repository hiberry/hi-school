package cc.chenzhihao.hischool.common.exception;

/**
 * @author jacksonchenzhihao
 * @date 2021-11-11 14:42
 */
public class BeanHolderException extends RuntimeException {

    public BeanHolderException(String message) {
        super(message);
    }

    public BeanHolderException(String message, Throwable cause) {
        super(message, cause);
    }
}
