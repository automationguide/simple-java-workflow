package tech.automationguide;

import org.apache.commons.collections4.map.LinkedMap;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) {
        LinkedMap<String, String> map = new LinkedMap<>();
        map.put("Five", "5");
        map.put("Six", "6");
        map.put("Seven", "7");
        map.put("Eight", "8");
        map.put("Nine", "9");

        System.out.println(map.firstKey());
        System.out.println(map.nextKey("Six"));
    }
}
