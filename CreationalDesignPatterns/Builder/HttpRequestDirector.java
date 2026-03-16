package CreationalDesignPatterns.Builder;

public class HttpRequestDirector {

    public HttpRequest buildSampleGet() {
        return new HttpRequest.Builder("https:://example.com").build();
    }

    public HttpRequest buildSamplePost() {
        return new HttpRequest.Builder("https:://example.com/users").setMethod("POST")
                .setBody("{\"name\":\"Lokesh\",\"email\":\"lokeshreddy@gmail.com\"}").setTimeout(5000).build();
    }

    public HttpRequest buildSamplePut() {
        return new HttpRequest.Builder("https:://example.com/config").setMethod("PUT").addHeader("Content-type", "JSON").
                addQueryParams("env", "Production").setBody("{\"feature-flag\":\"true\"}").setTimeout(6000).build();
    }
}
