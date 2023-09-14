package src.test.java.api;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;



public class Provider {

    @JsonDeserialize(using = UniversalCommissionDeserializer.class)
    private int commission;

    // Геттер для поля commission
    public int getCommission() {
        return commission;
    }

    // Сеттер для поля commission
    public void setCommission(int commission) {
        this.commission = commission;
    }
    public Providers providers;
}

