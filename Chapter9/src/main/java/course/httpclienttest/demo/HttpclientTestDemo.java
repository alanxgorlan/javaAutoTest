package course.httpclienttest.demo;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

import java.io.IOException;

public class HttpclientTestDemo {
    @Test
    public void test() throws IOException {
        String res;
        HttpGet get = new HttpGet("http://baidu.com");
        HttpClient client = new DefaultHttpClient();
        HttpResponse response = client.execute(get);
        res = EntityUtils.toString(response.getEntity(), "utf-8");
        System.out.println(res);
    }
}
