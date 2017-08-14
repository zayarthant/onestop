package com.jdc.home.utils.search;

import java.util.Map;

public interface Searchable {

    String where();

    Map<String, Object> params();

}