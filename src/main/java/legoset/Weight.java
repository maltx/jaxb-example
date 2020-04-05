package legoset;

import lombok.Data;

import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class Weight {

    @XmlAttribute
    private String unit;

    @XmlValue
    private double value;

    public Weight(String unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    public Weight(){}
}
