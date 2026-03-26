package hello;

import org.json.JSONObject;

public class JsonTest {
    public static void main(String args[]) {
        JSONObject jo = new JSONObject("{ \"key\" :\"def\", \"col\" :\"123\"}");
        System.out.println(jo.toString());
        String col1;
        String col2;
        col1 = jo.getString("key");
        col2 = jo.getString("col");
        System.out.println(col1);
        System.out.println(col2);
    }
}
