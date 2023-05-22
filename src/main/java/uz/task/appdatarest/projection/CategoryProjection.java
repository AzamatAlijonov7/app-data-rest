package uz.task.appdatarest.projection;

public interface CategoryProjection {

    public Long getId();

    public String getName();

    public Long getParent_category_id();

    public boolean isActive();

}

