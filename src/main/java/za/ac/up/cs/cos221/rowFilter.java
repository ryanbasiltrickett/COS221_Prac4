package za.ac.up.cs.cos221;

import javax.swing.RowFilter;

public class rowFilter extends RowFilter {
    private String searchTxt;
    rowFilter(String theText)
    {
        searchTxt = theText;
    }
    
    @Override
    public boolean include(Entry entry)
    {
        return entry.getStringValue(1).toUpperCase().contains(searchTxt.toUpperCase());
    }
}
