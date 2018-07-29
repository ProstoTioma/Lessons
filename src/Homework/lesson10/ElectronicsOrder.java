package Homework.lesson10;

import java.util.Date;

public class ElectronicsOrder extends Order {
    private int guaranteeMonths;


    public ElectronicsOrder(String itemName, Date dateCreated, String shipFromCity, String shipToCity, int basePrice, Customer customerOwned, int guaranteeMonths) {
        super(itemName, dateCreated, shipFromCity, shipToCity, basePrice, customerOwned);
        this.guaranteeMonths = guaranteeMonths;
    }

    @Override
    public void validateOrder() {
        String gender = getCustomerOwned().getGender();

        if (getShipFromCity().equalsIgnoreCase("Киев") || getShipFromCity().equalsIgnoreCase("Одесса") || getShipFromCity().equalsIgnoreCase("Днепр") || getShipFromCity().equalsIgnoreCase("Харьков")) {
            if (getShipToCity().equalsIgnoreCase("Киев") || getShipToCity().equalsIgnoreCase("Одесса") || getShipToCity().equalsIgnoreCase("Днепр") || getShipToCity().equalsIgnoreCase("Харьков")) {
                if (gender.equalsIgnoreCase("Женский") && getBasePrice() >= 100) {
                    setDateConfirmed(new Date());
                }
            }
        }
    }

    @Override
    public void calculatePrice() {
        double shipmentPrice;

        if (getShipToCity().equalsIgnoreCase("Киев") || getShipToCity().equalsIgnoreCase("Одесса")) {
            shipmentPrice = getBasePrice() * 0.1;
        } else {
            shipmentPrice = getBasePrice() * 0.15;
        }
        double totalPrice = getBasePrice() + shipmentPrice;

        if (totalPrice > 1000) {
            totalPrice = totalPrice - (totalPrice * 0.05);
        }

        setTotalPrice(totalPrice);
    }


}
