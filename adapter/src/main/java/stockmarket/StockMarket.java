package stockmarket;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class StockMarket {

    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {
        final DataAnalytic dataAnalytic = new DataAnalytic();

        final XMLStockData xmlStockData = new XMLStockData();

        //XML interface incompatible with the dataAnalytic argument
        //dataAnalytic.analyseOn(xmlStockData.getData());
    }
}
