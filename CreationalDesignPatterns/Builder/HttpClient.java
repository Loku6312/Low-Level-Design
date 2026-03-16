package CreationalDesignPatterns.Builder;

public class HttpClient {

    public static void main(String[] args) {
        HttpRequest get = new HttpRequest.Builder("https:://example.com").build();
        HttpRequest post = new HttpRequest.Builder("https:://example.com/users").setMethod("POST")
                .setBody("{\"name\":\"Lokesh\",\"email\":\"lokeshreddy@gmail.com\"}").setTimeout(5000).build();
        HttpRequest put = new HttpRequest.Builder("https:://example.com/config").setMethod("PUT").addHeader("Content-type", "JSON").
                addQueryParams("env", "Production").setBody("{\"feature-flag\":\"true\"}").setTimeout(6000).build();
        System.out.println(get);
        System.out.println(post);
        System.out.println(put);
        HttpRequestDirector director = new HttpRequestDirector();
        System.out.println(director.buildSampleGet());
        System.out.println(director.buildSamplePost());
        System.out.println(director.buildSamplePut());

    }
}
