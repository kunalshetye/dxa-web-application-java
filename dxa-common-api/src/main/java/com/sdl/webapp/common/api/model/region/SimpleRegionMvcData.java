package com.sdl.webapp.common.api.model.region;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sdl.webapp.common.api.model.MvcData;

import java.util.Collections;
import java.util.Map;

/**
 * SimpleRegionMvcData
 *
 * @author nic
 */
public class SimpleRegionMvcData implements MvcData {

    @JsonProperty("ControllerAreaName")
    private String controllerAreaName = "Core";

    @JsonProperty("ControllerName")
    private String controllerName = "Region";

    @JsonProperty("ActionName")
    private String actionName = "Region";

    @JsonProperty("AreaName")
    private String areaName = "Core";

    @JsonProperty("RegionName")
    private String regionName;

    @JsonProperty("ViewName")
    private String viewName;

    @JsonIgnore
    private Map<String, Object> metadata = Collections.emptyMap();

    @JsonIgnore
    private Map<String, String> routeValues = Collections.emptyMap();

    public SimpleRegionMvcData(String regionName) {
        this.regionName = regionName;
        this.viewName = regionName;
    }

    public SimpleRegionMvcData(String regionName, String viewName) {
        this.regionName = regionName;
        this.viewName = viewName;
    }

    @Override
    public String getControllerAreaName() {
        return controllerAreaName;
    }

    @Override
    public String getControllerName() {
        return controllerName;
    }

    @Override
    public String getActionName() {
        return actionName;
    }

    @Override
    public String getAreaName() {
        return areaName;
    }

    @Override
    public String getViewName() {
        return this.viewName;
    }

    @Override
    public String getRegionAreaName() {
        return null;
    }

    @Override
    public String getRegionName() {
        return this.regionName;
    }

    @Override
    public Map<String, String> getRouteValues() {
        return this.routeValues;
    }

    @Override
    public Map<String, Object> getMetadata() {
        return metadata;
    }
}