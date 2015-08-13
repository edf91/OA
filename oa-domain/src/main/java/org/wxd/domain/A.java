package org.wxd.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by wangxd on 2015/8/3.
 */
@Table(name = "test_a")
@Entity
@Access(AccessType.FIELD)
public class A implements Serializable {

    private static final long serialVersionUID = 5384162386455130363L;

    public A() {
    }

    public A(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "name")
    private String name;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
