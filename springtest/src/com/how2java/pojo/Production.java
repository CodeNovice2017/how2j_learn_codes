package com.how2java.pojo;

public class Production {
    private int id;
    private String name;
    private Category category;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory(){
        return this.category;
    }
    public void setCategory(Category category){
        this.category = category;
    }

}
