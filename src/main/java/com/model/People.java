package com.model;
//import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by hrym13 on 2018/3/27.
 */
//@Table(name = "people")
public class People implements Serializable {

    private Integer Id;
    private String name;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "People{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                '}';
    }
}
