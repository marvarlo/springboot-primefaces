package com.mavlsoft.springbootjsf.backendBeans;

public interface BackEndBean<T> {

    void newItem();

    void save();

    void delete();

    boolean hasSelectedItems();

    String getDeleteButtonMessage();

    void deleteSelectedItems();

    String getDataTableName();

    String getDataTableWidget();

    String getFormName();

    String getDeleteButton();

    String getFormDeleteButton();

    String getGrowlId();
}
