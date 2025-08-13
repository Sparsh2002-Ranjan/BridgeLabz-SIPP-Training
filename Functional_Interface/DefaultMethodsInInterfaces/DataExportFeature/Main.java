interface DataExporter {
    void export(String data);
    default void exportToJSON(String data) {
        System.out.println("Exporting to JSON: " + data);
    }
}
class CSVExporter implements DataExporter {
    public void export(String data) { System.out.println("Exporting to CSV: " + data); }
}
public class Main {
    public static void main(String[] args) {
        DataExporter exporter = new CSVExporter();
        exporter.export("Report Data");
        exporter.exportToJSON("Report Data");
    }
}