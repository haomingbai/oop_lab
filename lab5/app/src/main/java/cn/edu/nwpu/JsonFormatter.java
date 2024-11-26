package cn.edu.nwpu;

import java.util.List;
import com.alibaba.fastjson2.JSON;

public class JsonFormatter implements Formatter {
    /**
     * Formats the given ConsultRecord object into a JSON string.
     *
     * @param record the ConsultRecord object to be formatted
     * @return a JSON string representation of the given ConsultRecord
     */
    @Override
    public String format(ConsultRecord record) {
        return JSON.toJSONString(record);
    }

    /**
     * Formats a list of ConsultRecord objects into a JSON string.
     *
     * @param records the list of ConsultRecord objects to be formatted
     * @return a JSON string representation of the list of ConsultRecord objects
     */
    @Override
    public String format(List<ConsultRecord> records) {
        return JSON.toJSONString(records);
    }
    
}
