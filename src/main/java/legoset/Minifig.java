package legoset;

import lombok.Data;

import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class Minifig {

    @XmlValue
    private String nameMinifit;

    @XmlAttribute
    private int count;

    public Minifig(String nameMinifit, int count) {
        this.nameMinifit = nameMinifit;
        this.count = count;
    }

    public Minifig(){}
}
