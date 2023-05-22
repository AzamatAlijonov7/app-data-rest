package uz.task.appdatarest.projection;

import uz.task.appdatarest.entity.Warehouse;

import java.time.LocalDate;
import java.util.Currency;
import java.util.function.Supplier;

public interface InputProjection {

    Long getId();

    LocalDate getDate();

    Warehouse getWarehouse();

    Supplier getSupplier();

    Currency getCurrency();

    String getFactureNumber();

    String getCode();

}
