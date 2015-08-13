package org.wxd.jpa;

import org.wxd.domain.A;
import org.wxd.domain.AOperations;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Optional;

/**
 * Created by wangxd on 2015/8/3.
 */
public class JpaAOperations implements AOperations {

    @PersistenceContext
    private EntityManager em;

    public Optional<A> ofId(String id) {
        A a = em.find(A.class,id);
        return Optional.ofNullable(a);
    }
    public void store(A a) {
        em.merge(a);
    }

    public void remove(A a) {em.remove(a);}
}
