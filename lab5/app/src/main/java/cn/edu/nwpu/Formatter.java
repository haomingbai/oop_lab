package cn.edu.nwpu;

import java.util.List;

public interface Formatter {
    /**
     * Formats the given consult record into a string representation.
     *
     * @param record the consult record to format
     * @return the formatted string representation of the consult record
     */
    public String format(ConsultRecord record);
    

    /**
     * Formats a list of consultation records into a string representation.
     *
     * @param records the list of consultation records to format
     * @return a formatted string representation of the consultation records
     */
    public String format(List<ConsultRecord> records);
}
