package com.vmindsv.school.subscription.query;

import com.vmindsv.school.subscription.persistance.base.QueryParameter;
import com.vmindsv.school.subscription.persistance.base.QueryString;

import java.util.ArrayList;
import java.util.List;

public class SelectContact implements QueryString
{
	
    private static final String QUERY = "SELECT c FROM " + "ContactEntity" + " c WHERE  (firstName=firstName) ";
   /* private static final String QUERY1 = "select c from " + "ContactEntity" + "  where c.firstName = :#{#contact.firstName}";
    private static final String QUERY2 = "select c from " + "ContactEntity" + "  where c.lastName = :#{#contact.lastName}";
    private static final String QUERY3 = "select c from " + "ContactEntity" + "  where c.dob = :#{#contact.dob}";
    private static final String QUERY4 = "select c from " + "ContactEntity" + "  where c.gender = :#{#contact.gender}";
    private static final String QUERY5 = "select c from " + "ContactEntity" + "  where c.email = :#{#contact.email}";
    private static final String QUERY6 = "select c from " + "ContactEntity" + "  where c.phoneno = :#{#contact.phoneno}";
*/

    // === QueryString implementation

    public String getStatement()
    {
        StringBuffer statement = new StringBuffer(QUERY);
        /*StringBuffer statement1 = new StringBuffer(QUERY1);
        StringBuffer statement2 = new StringBuffer(QUERY2);
        StringBuffer statement3 = new StringBuffer(QUERY3);
        StringBuffer statement4 = new StringBuffer(QUERY4);
        StringBuffer statement5 = new StringBuffer(QUERY5);
        StringBuffer statement6 = new StringBuffer(QUERY6);*/

        return statement.toString();
    }

    public List<QueryParameter> getParameters()
    {
        List<QueryParameter> parameters = new ArrayList<QueryParameter>();

        return parameters;
    }
}