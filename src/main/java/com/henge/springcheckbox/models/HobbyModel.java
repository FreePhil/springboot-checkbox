package com.henge.springcheckbox.models;

public class HobbyModel {
    private String name;
    private boolean selected;

    public HobbyModel() {
        name = "";
        selected = false;
    }

    public HobbyModel(String name, boolean isSelected) {
        this.name = name;
        this.selected = isSelected;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }
}
