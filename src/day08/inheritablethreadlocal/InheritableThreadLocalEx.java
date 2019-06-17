package day08.inheritablethreadlocal;

/**
 * @author XieKong
 * @date 2019/6/17 14:40
 */
public class InheritableThreadLocalEx extends InheritableThreadLocal {
    @Override
    protected Object initialValue() {
        return System.currentTimeMillis();
    }

    @Override
    protected Object childValue(Object parentValue) {
        return parentValue + " 在子线程添加的";
    }
}
