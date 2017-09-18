/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamController;

/**
 *
 * @author Lan
 */
public class Passenger {

    private int id;
    private String name;
    private String address;
    private String phone;
    private String dateOfDepartureAndReturn;

    public Passenger(int id, String name, String address, String phone, String dateOfDepartureAndReturn) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.dateOfDepartureAndReturn = dateOfDepartureAndReturn;
    }

    public Passenger() {
    }

    ;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDateOfDepartureAndReturn() {
        return dateOfDepartureAndReturn;
    }

    public void setDateOfDepartureAndReturn(String dateOfDepartureAndReturn) {
        this.dateOfDepartureAndReturn = dateOfDepartureAndReturn;
    }

}