package com.microservicewithpostgressmysqlmongodb.HotelService.hotel.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Price {
    private long tax;
    private long price;
    private long other;

    public Price(long tax, long price, long other) {
        this.tax = tax;
        this.price = price;
        this.other = other;
    }

    public long getTax() {
        return tax;
    }

    public void setTax(long tax) {
        this.tax = tax;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public long getOther() {
        return other;
    }

    public void setOther(long other) {
        this.other = other;
    }
}
