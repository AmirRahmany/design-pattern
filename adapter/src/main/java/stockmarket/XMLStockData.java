package stockmarket;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class XMLStockData implements XML {

    private static String getStockDataWithPrice(Document document) {
        // Process stocks
        NodeList stocks = document.getElementsByTagName("Stock");
        var builder = new StringBuilder();
        for (int i = 0; i < stocks.getLength(); i++) {
            Element stock = (Element) stocks.item(i);
            String symbol = getElementValue(stock, "Symbol");
            String company = getElementValue(stock, "CompanyName");
            String price = getElementValue(stock, "LastPrice");
            String change = getElementValue(stock, "Change");
            builder.append(String.format("%-6s %-25s: $%s (%s)%n", symbol, company, price, change));
        }
        return builder.toString();
    }

    private static String getElementValue(Element parent, String tagName) {
        NodeList nodeList = parent.getElementsByTagName(tagName);
        return nodeList.getLength() > 0 ? nodeList.item(0).getTextContent() : "N/A";
    }

    @Override
    public String getData() {
        final Path path = Path.of("src/main/java/stockmarket/data.xml");
        try {
            final String xmlContent = Files.readString(path);

            final DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
            final DocumentBuilder builder = builderFactory.newDocumentBuilder();
            Document document = builder.parse(new ByteArrayInputStream(xmlContent.getBytes()));
            document.getDocumentElement().normalize();
            return getStockDataWithPrice(document);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
       return "";
    }
}
