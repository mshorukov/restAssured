package src.test.java.api;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;

public class CommissionDeserializer extends JsonDeserializer<Integer> {
    @Override
    public Integer deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
        String commissionValue = p.getValueAsString();
        if (commissionValue.contains("%")) {
            // Если значение содержит символ '%', то это процентное значение
            commissionValue = commissionValue.replaceAll("%", "");
            return Integer.parseInt(commissionValue);
        } else {
            // В противном случае это числовое значение
            return (int) Double.parseDouble(commissionValue);
        }
    }
}