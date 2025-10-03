package stockmarket;

public class XmlToJsonAdapter implements Json {

    private final XML xml;

    public XmlToJsonAdapter(XML xml) {
        this.xml = xml;
    }

    public String getData(){
        final String data = xml.getData();
        // Perform some work to convert XML into JSON.

        return data;
    }
}
