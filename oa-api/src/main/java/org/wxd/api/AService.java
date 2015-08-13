package org.wxd.api;

/**
 * Created by wangxd on 2015/8/3.
 */
public interface AService {

    /**
     * @param id
     * @return
     */
    AProxy get(String id);

    void save(AProxy aProxy);

    void remove(AProxy aProxy);
}
