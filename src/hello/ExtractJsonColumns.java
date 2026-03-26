package hello;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ExtractJsonColumns {

    public static void main(String[] args) {
        // 定义一个 json 字符串，它有三层次
        String jsonStr = "{\"col_a\": \"value1\", \"col_b\": \"value2\", \"col_c\": {\"col_d\": \"value3\", \"col_e\": \"value4\"}, \"col_f\": [{\"col_g\": \"value5\", \"col_h\": \"value6\"}, {\"col_i\": \"value7\", \"col_j\": \"value8\"}]}";

        // 使用 JsonParser 类的 parse() 方法解析 json 字符串
        JsonElement jsonObj = new JsonParser().parse(jsonStr);

        // 获取第一层的 col_a 列
        String colA = jsonObj.getAsJsonObject().get("col_a").getAsString();
        System.out.println("col_a: " + colA);

        // 获取第二层的 col_b 列
        JsonObject colC = jsonObj.getAsJsonObject().get("col_c").getAsJsonObject();
        String colB = colC.get("col_d").getAsString();
        System.out.println("col_b: " + colB);

        // 获取第三层的 col_i 和 col_j 列
        JsonArray colF = jsonObj.getAsJsonObject().get("col_f").getAsJsonArray();
        JsonObject colI = colF.get(1).getAsJsonObject();
        String colJ = colI.get("col_j").getAsString();
        String colK = colI.get("col_i").getAsString();
        System.out.println("col_i: " + colJ);
        System.out.println("col_j: " + colK);
    }
}