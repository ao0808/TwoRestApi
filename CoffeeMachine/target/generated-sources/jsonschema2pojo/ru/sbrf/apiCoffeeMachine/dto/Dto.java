
package ru.sbrf.apiCoffeeMachine.dto;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "volumeOfCup",
    "typeOfCoffee"
})
@Generated("jsonschema2pojo")
public class Dto {

    @JsonProperty("volumeOfCup")
    private Dto.VolumeOfCup volumeOfCup;
    @JsonProperty("typeOfCoffee")
    private Dto.TypeOfCoffee typeOfCoffee;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("volumeOfCup")
    public Dto.VolumeOfCup getVolumeOfCup() {
        return volumeOfCup;
    }

    @JsonProperty("volumeOfCup")
    public void setVolumeOfCup(Dto.VolumeOfCup volumeOfCup) {
        this.volumeOfCup = volumeOfCup;
    }

    @JsonProperty("typeOfCoffee")
    public Dto.TypeOfCoffee getTypeOfCoffee() {
        return typeOfCoffee;
    }

    @JsonProperty("typeOfCoffee")
    public void setTypeOfCoffee(Dto.TypeOfCoffee typeOfCoffee) {
        this.typeOfCoffee = typeOfCoffee;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Dto.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("volumeOfCup");
        sb.append('=');
        sb.append(((this.volumeOfCup == null)?"<null>":this.volumeOfCup));
        sb.append(',');
        sb.append("typeOfCoffee");
        sb.append('=');
        sb.append(((this.typeOfCoffee == null)?"<null>":this.typeOfCoffee));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.typeOfCoffee == null)? 0 :this.typeOfCoffee.hashCode()));
        result = ((result* 31)+((this.volumeOfCup == null)? 0 :this.volumeOfCup.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Dto) == false) {
            return false;
        }
        Dto rhs = ((Dto) other);
        return ((((this.typeOfCoffee == rhs.typeOfCoffee)||((this.typeOfCoffee!= null)&&this.typeOfCoffee.equals(rhs.typeOfCoffee)))&&((this.volumeOfCup == rhs.volumeOfCup)||((this.volumeOfCup!= null)&&this.volumeOfCup.equals(rhs.volumeOfCup))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

    @Generated("jsonschema2pojo")
    public enum TypeOfCoffee {

        CAPPUCCINO("CAPPUCCINO"),
        GLACE("GLACE"),
        ESPRESSO("ESPRESSO");
        private final String value;
        private final static Map<String, Dto.TypeOfCoffee> CONSTANTS = new HashMap<String, Dto.TypeOfCoffee>();

        static {
            for (Dto.TypeOfCoffee c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        TypeOfCoffee(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static Dto.TypeOfCoffee fromValue(String value) {
            Dto.TypeOfCoffee constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    @Generated("jsonschema2pojo")
    public enum VolumeOfCup {

        GRANDE("GRANDE"),
        BIG("BIG"),
        MEDIUM("MEDIUM"),
        SMALL("SMALL");
        private final String value;
        private final static Map<String, Dto.VolumeOfCup> CONSTANTS = new HashMap<String, Dto.VolumeOfCup>();

        static {
            for (Dto.VolumeOfCup c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        VolumeOfCup(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static Dto.VolumeOfCup fromValue(String value) {
            Dto.VolumeOfCup constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
