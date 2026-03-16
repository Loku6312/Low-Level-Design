package CreationalDesignPatterns.Builder;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HttpRequest {

    private final String url; // Required
    //Optional
    private final String method;
    private final Map<String, String> headers;
    private final Map<String, String> queryParams;
    private final String body;
    private final int timeout;

    public String getMethod() {
        return method;
    }

    private HttpRequest(Builder builder) {
        this.url = builder.url;
        this.body = builder.body;
        this.headers = Collections.unmodifiableMap(new HashMap<>(builder.headers));
        this.queryParams = Collections.unmodifiableMap(new HashMap<>(builder.queryParams));
        this.timeout = builder.timeout;
        this.method = builder.method;
    }

    @Override
    public String toString() {
        return "HttpRequest [url=" + url + ", method=" + method + ", headers=" + headers + ", queryParams="
                + queryParams + ", body=" + body + ", timeout=" + timeout + "]";
    }

    public String getUrl() {
        return url;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public Map<String, String> getQueryParams() {
        return queryParams;
    }

    public String getBody() {
        return body;
    }

    public int getTimeout() {
        return timeout;
    }

    public static class Builder {

        private final String url;
        private Map<String, String> headers = new HashMap<>();
        private Map<String, String> queryParams = new HashMap<>();
        private int timeout = 3000;
        private String body;
        private String method = "GET";

        public Builder setMethod(String method) {
            this.method = method;
            return this;
        }

        public Builder(String url) {
            this.url = url;
        }

        public Builder addHeader(String key, String value) {
            this.headers.put(key, value);
            return this;
        }

        public Builder addQueryParams(String key, String value) {
            this.queryParams.put(key, value);
            return this;
        }

        public Builder setTimeout(int timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder setBody(String body) {
            this.body = body;
            return this;
        }

        public HttpRequest build() {
            return new HttpRequest(this);
        }

    }

}
