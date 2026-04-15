package org.pluralsight;

public class CellPhone
{
    // instance variables
    private String name = "";
    private String phoneNumber = "";
    private String carrier = "";
    private String model = "";
    private int serialNumber = 0;



    // get and set for the user's name
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }


    // get and set for user's phone number
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }


    // get and set for user's carrier
    public String getCarrier()
    {
        return carrier;
    }

    public void setCarrier(String carrier)
    {
        this.carrier = carrier;
    }


    // get and set for user's model/make
    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }


    // get and set for user's serial number INT
    public int getSerialNumber()
    {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber)
    {
        this.serialNumber = serialNumber;
    }


    // dial method
    public void dialNumber(String numberToDial)
    {
        System.out.println(this.name + " is calling " + numberToDial);
    }

}
