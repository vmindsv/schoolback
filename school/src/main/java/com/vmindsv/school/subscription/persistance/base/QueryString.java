package com.vmindsv.school.subscription.persistance.base;

import java.util.List;

/**
 *
 */
public interface QueryString {
    public String getStatement();

    public List<QueryParameter> getParameters();

	
}
