package com.vmindsv.school.subscription.query;

import com.vmindsv.school.subscription.persistance.base.QueryParameter;
import com.vmindsv.school.subscription.persistance.base.QueryString;

import java.util.ArrayList;
import java.util.List;

public class SelectCustomer implements QueryString
{
    private static final String QUERY = "SELECT c FROM " + "CustomerEntity" + " c WHERE (1=1) ";

    // === QueryString implementation

    public String getStatement()
    {
        StringBuffer statement = new StringBuffer(QUERY);

        return statement.toString();
    }

    public List<QueryParameter> getParameters()
    {
        List<QueryParameter> parameters = new ArrayList<QueryParameter>();

        return parameters;
    }
}