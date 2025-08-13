import java.io.Serializable;
class BackupData implements Serializable {
    String content;
    BackupData(String content) { this.content = content; }
}
public class Main {
    public static void main(String[] args) {
        BackupData data = new BackupData("Backup Content");
        System.out.println("Backup data ready: " + data.content);
    }
}