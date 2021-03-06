/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lair.models;

import java.util.Objects;

/**
 *
 * @author dkottmann
 */
public class PluginId {

    private String tool;
    private String id;
    
    public PluginId() {
        this.tool = Constants.TOOL;
        this.id = "";
    }

    /**
     * @return the tool
     */
    public String getTool() {
        return tool;
    }

    /**
     * @param tool the tool to set
     */
    public void setTool(String tool) {
        this.tool = tool;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.tool);
        hash = 67 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PluginId other = (PluginId) obj;
        if (!Objects.equals(this.tool, other.tool)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
}
