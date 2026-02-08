package phase1.topic5;


class ReportManager {
    String content;

    // Job 1: Data Management
    void setContent(String c) { this.content = c; }

    // Job 2: Formatting
    void formatToPDF() {
        System.out.println("Formatting " + content + " to PDF...");
    }

    // Job 3: File Storage
    void saveToFile(String filename) {
        System.out.println("Saving PDF to " + filename);
    }
}

class Report {
    private String content;
    void setContent(String c) { 
        this.content = c; 
    }
    String getContent(){
        return this.content;
    }
}

class ReportFormatter {

     void formatToPDF(String content) {
        System.out.println("Formatting " + content + " to PDF...");
    }
}

class ReportRepository {
    void saveToFile(String filename) {
        System.out.println("Saving PDF to " + filename);
    }
}

public class SRPSimulation {
    public static void main(String[] args) {
        Report rp = new Report();
        rp.setContent("Hello this is Nithwin");
        ReportFormatter rf = new ReportFormatter();
        rf.formatToPDF(rp.getContent());
        ReportRepository rr = new ReportRepository();
        rr.saveToFile("resume.pdf");
    }
}
