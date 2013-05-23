package models;

import com.couchbase.client.CouchbaseClient;

/**
 * Created with IntelliJ IDEA.
 * User: throdo
 * Date: 21/05/13
 * Time: 14:51
 */
public class OrangeBucket {
    private String id;
    private String label;
    private CouchbaseClient couchbaseClient;

    public OrangeBucket(String id, String label, CouchbaseClient couchbaseClient) {
        this.id = id;
        this.label = label;
        this.couchbaseClient = couchbaseClient;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public CouchbaseClient getCouchbaseClient() {
        return couchbaseClient;
    }

    public void setCouchbaseClient(CouchbaseClient couchbaseClient) {
        this.couchbaseClient = couchbaseClient;
    }
}
