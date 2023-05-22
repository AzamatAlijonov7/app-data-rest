package uz.task.appdatarest.projection;

import java.util.Date;

public interface InputProductProjection {
    Long getId();
    Long getProductId();
    Integer getAmount();
    Double getPrice();
    Date getExpireDate();
    Long getInputId();
}

