package dev.mafaldalopes.talebase.persistence;

import java.util.Date;

public interface Model {

    Integer getId();
    void setId(Integer id);

    Integer getVersion();
    void setVersion(Integer version);

    Date getCreationTime();
    void setCreationTime(Date creationTime);

    Date getUpdateTime();
    void setUpdateTime(Date updateTime);
}
