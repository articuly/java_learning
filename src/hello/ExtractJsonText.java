package hello;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractJsonText {

    // 定义一个方法，用于提取 json 对象
    public static JsonElement extractJson(String text) {
        // 使用 JsonParser 类的 parse() 方法解析 json 字符串

        // 返回 json 对象
        return new JsonParser().parse(text);
    }

    public static void main(String[] args) {
        // 定义一个变量，用于保存混合文本
        String text = "Here is some text that contains a json object: {\"key1\": \"value1\", \"key2\": \"value2\"}\n"
                + "And here is some more text that contains another json object: {\"key3\": \"value3\", \"key4\": \"value4\"}";

        // 使用正则表达式，在混合文本中提取所有 json 字符串
        String pattern = "\\{.*\\}";
        Matcher matcher = Pattern.compile(pattern).matcher(text);

        while (matcher.find()) {
            // 对每个 json 字符串，使用 extractJson() 方法提取 json 对象
            JsonElement jsonObj = extractJson(matcher.group());

            // 输出提取到的 json 对象
            System.out.println(jsonObj);
        }
    }
}