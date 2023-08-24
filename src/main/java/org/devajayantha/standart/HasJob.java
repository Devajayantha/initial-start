package org.devajayantha.standart;

public interface HasJob {
    public void currentProject(String name);

    public void currentSalary(String name);

    default boolean isContract() {
        return false;
    }
}
