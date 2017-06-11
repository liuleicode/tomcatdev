import java.io.IOException;

/**
 * Created by liulei on 2017/5/22.
 */
public class StaticResourceProcessor {
    public void process(Request request,Response response){
        try {
            response.sendStaticResource();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
