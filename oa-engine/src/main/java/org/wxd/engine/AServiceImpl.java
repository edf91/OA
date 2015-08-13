package org.wxd.engine;

import org.wxd.api.AProxy;
import org.wxd.api.AService;
import org.wxd.domain.A;
import org.wxd.domain.AOperations;
import org.wxd.jpa.JpaAOperations;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

/**
 * Created by wangxd on 2015/8/3.
 */
public class AServiceImpl implements AService {

    @PersistenceContext
    private EntityManager em;

    private AOperations aOps;

    public AServiceImpl(AOperations aOps) {
        this.aOps = aOps;
    }

    public AProxy get(String id) {
        TypedQuery<A> queue = em.createQuery("SELECT a FROM A a WHERE a.id = :id", A.class);
        queue.setParameter("id", id);
        A a = queue.getSingleResult();
        return new AProxy(a.getId(), a.getName());
    }
    @Transactional
    public void save(AProxy aProxy) {
        A a = new A(aProxy.getId(),aProxy.getName());
        aOps.store(a);
    }
    @Transactional
    public void remove(AProxy aProxy) {
        aOps.remove(aOps.ofId(aProxy.getId()).get());
    }


}
