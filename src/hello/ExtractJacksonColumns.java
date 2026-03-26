package hello;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ExtractJacksonColumns {

    public static void main(String[] args) throws Exception {
        // 定义一个 json 字符串，它有三层次
        String jsonStr = "{\"col_a\": \"value1\", \"col_b\": \"value2\", \"col_c\": {\"col_d\": \"value3\", \"col_e\": \"value4\"}, \"col_f\": [{\"col_g\": \"value5\", \"col_h\": \"value6\"}, {\"col_i\": \"value7\", \"col_j\": \"value8\"}]}";

        // 使用 ObjectMapper 类的 readTree() 方法解析 json 字符串
        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(jsonStr);

        // 获取第一层的 col_a 列
        String colA = root.get("col_a").asText();
        System.out.println("col_a: " + colA);

        // 获取第二层的 col_b 列
        JsonNode colC = root.get("col_c");
        String colB = colC.get("col_d").asText();
        System.out.println("col_b: " + colB);

        // 获取第三层的 col_i 和 col_j 列
        JsonNode colF = root.get("col_f");
        JsonNode colI = colF.get(1);
        String colJ = colI.get("col_j").asText();
        String colK = colI.get("col_i").asText();
        System.out.println("col_i: " + colK);
        System.out.println("col_j: " + colJ);
    }
}