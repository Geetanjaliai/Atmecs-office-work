package com.task.odapi.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
//@JsonAutoDetect(getterVisibility = JsonAutoDetect.Visibility.NONE)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DestinationProperties {
    @JsonProperty("I")
    private int I;
    @JsonProperty("C")
    private int C;

    public int isI() {
        return I;
    }

    public void setI(int i) {
        I = i;
    }

    public int isC() {
        return C;
    }

    public void setC(int c) {
        C = c;
    }

    @Override
    public String toString() {
        return "DestinationProperties{" +
                "I=" + I +
                ", C=" + C +
                '}';
    }
}
