package Utils;

public class BasePage{

    public String baseUri = "https://petstore.swagger.io";
    public String basePath = "v2/pet";
    public String getBasePath() {
        return basePath;
    }
    public void setBasePath(String basePath) {
        this.basePath = basePath;
    }
    public String getUri() {
        return this.baseUri;
    }

}
