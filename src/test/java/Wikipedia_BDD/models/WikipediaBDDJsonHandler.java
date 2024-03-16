package Wikipedia_BDD.models;

public class WikipediaBDDJsonHandler {
    private String protocol;
    private String domain;
    private int wait;
    private String downloadedFile;
    private String name;
    private String language;


    public String getLanguage() {
        return language;
    }

    public String getProtocol() {
        return protocol;
    }

    public String getDomain() {
        return domain;
    }

    public int getWait() {
        return wait;
    }

    public String getHost() {
        return protocol + "://" + domain;
    }

    public String getName() {
        return name;
    }

    public void setDownloadedFile(String downloadedFile) {
        this.downloadedFile = downloadedFile;
    }

    public String getDownloadedFile() {
        return downloadedFile;
    }

}
