package com.example.cloud.commons.json;

import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("userFilter")
public interface UserFilterMixIn {

}
