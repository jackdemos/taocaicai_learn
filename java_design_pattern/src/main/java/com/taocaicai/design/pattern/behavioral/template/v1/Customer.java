package com.taocaicai.design.pattern.behavioral.template.v1;

/**
 * @author Oakley
 * @version 1.0.0.0
 * @created 2021-07-03 03:13:3:13
 * @description TODO
 */
class Customer {
    private int serviceNO;
    private String id;
    private String name;
    private int money;
    private String type;

    public Customer(String id, String name, int money, String type) {
        this.id = id;
        this.name = name;
        this.money = money;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getServiceNO() {
        return serviceNO;
    }

    public void setServiceNO(int serviceNO) {
        this.serviceNO = serviceNO;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
