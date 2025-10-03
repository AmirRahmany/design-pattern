package stockmarket;

public class StockMarket {

    public static void main(String[] args) {
        final DataAnalytic dataAnalytic = new DataAnalytic();

        final XML xmlStockData = new XMLStockData();

        final Json jsonAdapter = new XmlToJsonAdapter(xmlStockData);

        dataAnalytic.analyseOn(jsonAdapter);
    }
}
