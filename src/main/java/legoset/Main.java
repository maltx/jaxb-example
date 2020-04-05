package legoset;

import jaxb.JAXBHelper;
import movie.Movie;

import javax.xml.bind.JAXBException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Year;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws MalformedURLException, JAXBException, FileNotFoundException {

        LegoSet legoSet = new LegoSet();

        legoSet.setNumber(75211);
        legoSet.setName("Imperial TIE Fighter");
        legoSet.setTheme("Star Wars");
        legoSet.setSubTheme("Solo");
        legoSet.setYear(Year.of(2018));
        legoSet.setPieces(519);
        legoSet.setTags(Set.of("Starfighter", "Stormtrooper", "Star Wars", "Solo"));
        legoSet.setMinifigs(List.of(new Minifig("Imperial Mudtrooper", 2),
                new Minifig("Imperial Pilot", 1),
                new Minifig("Mimban Stormtrooper", 1)));
        legoSet.setWeight(new Weight("kg", 0.89));
        legoSet.setUrl(new URL("https://brickset.com/sets/75211-1/Imperial-TIE-Fighter"));

        JAXBHelper.toXML(legoSet, System.out);


    }
}
