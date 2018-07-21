/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CUB_FOODS;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Saroj
 */
public class Workperiod_Data_Template {

    private SimpleStringProperty salecol1;
    private SimpleStringProperty salecol2;
    private SimpleStringProperty paymentcol1;
    private SimpleFloatProperty paymentcol2;
    private SimpleStringProperty ordercoucol1;
    private SimpleIntegerProperty ordercoucol2;

    public Workperiod_Data_Template(String ordercoucol1, Integer ordercoucol2) {
        this.ordercoucol1 = new SimpleStringProperty(ordercoucol1);
        this.ordercoucol2 = new SimpleIntegerProperty(ordercoucol2);
    }

    public Workperiod_Data_Template(String salecol1, String salecol2) {
        this.salecol1 = new SimpleStringProperty(salecol1);
        this.salecol2 = new SimpleStringProperty(salecol2);
    }

    public Workperiod_Data_Template(String paymentcol1, float paymentcol2) {
        this.paymentcol1 = new SimpleStringProperty(paymentcol1);
        this.paymentcol2 = new SimpleFloatProperty(paymentcol2);
    }

    public String getPaymentcol1() {
        return paymentcol1.get();
    }

    public float getPaymentcol2() {
        return paymentcol2.get();
    }

    public String getSalecol1() {
        return salecol1.get();
    }

    public String getSalecol2() {
        return salecol2.get();
    }

    public String getOrdercoucol1() {
        return ordercoucol1.get();
    }

    public Integer getOrdercoucol2() {
        return ordercoucol2.get();
    }
    

}
