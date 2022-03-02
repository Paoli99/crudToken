package factoryRequest;

public class RequestInformation {
    private String url;
    private String body;
    private String authType;
    private String authValue;

    public RequestInformation(){}

    public String getUrl() {
        return url;
    }

    public RequestInformation setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getBody() {
        return body;
    }

    public RequestInformation setBody(String body) {
        this.body = body;
        return this;
    }

    public String getAuthType() {
        return authType;
    }

    public void setAuthType(String authType) {
        this.authType = authType;
    }

    public String getAuthValue() {
        return authValue;
    }

    public void setAuthValue(String authValue) {
        this.authValue = authValue;
    }
}
