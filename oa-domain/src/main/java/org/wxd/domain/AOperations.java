package org.wxd.domain;

import java.util.Optional;

/**
 * Created by wangxd on 2015/8/3.
 */
public interface AOperations {

    /**
     * @param id
     * @return
     */
    Optional<A> ofId(String id);

    /**
     * @param a
     */
    void store(A a);

    /**
     * @param a
     */
    void remove(A a);
}
