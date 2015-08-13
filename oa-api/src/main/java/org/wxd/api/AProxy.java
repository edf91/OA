package org.wxd.api;

/**
 * Created by wangxd on 2015/8/3.
 */
public class AProxy {

    public AProxy() {
    }

    public AProxy(String id, String name) {
        this.id = id;
        this.name = name;
    }

    private String id;
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
