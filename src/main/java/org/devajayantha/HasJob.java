package org.devajayantha;

public interface HasJob {
    public void currentProject(String name);

    public void currentSalary(String name);

    default boolean isContract() {
        return false;
    }
}
