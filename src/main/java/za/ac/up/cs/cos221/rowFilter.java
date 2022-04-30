/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.up.cs.cos221;

import javax.swing.RowFilter;

/**
 *
 * @author Ryan
 */
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
