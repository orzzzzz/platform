package com.icinfo.platform.business.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.icinfo.platform.business.model.College;
import com.sun.org.glassfish.gmbal.NameValue;
import org.elasticsearch.common.inject.name.Named;
import org.springframework.core.annotation.AliasFor;

/**
 * TODO
 */
public class CollegeDto extends College {
    @JsonProperty("@timestamp")
    private String timestamp;

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
