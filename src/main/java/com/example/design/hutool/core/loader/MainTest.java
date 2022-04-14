/**
 * MainTest
 *
 * @description
 * @author jixinshi
 * @date 2022/4/14 10:13
 */

package com.example.design.hutool.core.loader;

import cn.hutool.core.lang.loader.LazyFunLoader;

/**
 * MainTest
 * @description
 * @author jixinshi
 * @date 2022/4/14 10:13
 */
public class MainTest {

    // 懒汉式单例
    static LazyFunLoader<BigObject> loader = LazyFunLoader.on(BigObject::new);

    public static void main(String[] args) {
        // 首次调用实例化
        BigObject bigObject = loader.get();
        bigObject.setBigStr("test");
        System.out.println(bigObject.getBigStr());
        // 重复调用，不必实例化
        System.out.println(loader.get().getBigStr());
    }

    // 大对象
    static class BigObject {

        private String bigStr;

        public String getBigStr() {
            return bigStr;
        }

        public void setBigStr(String bigStr) {
            this.bigStr = bigStr;
        }

    }

}
