package com.orange.contextviewer;

/**
 * Created with IntelliJ IDEA.
 * User: throdo
 * Date: 19/05/13
 * Time: 10:33
 */
public class Cluster {
    private String id;
    private String label;
    private String uri;
    private String loginAdm;
    private String passwdAdm;

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

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getLoginAdm() {
        return loginAdm;
    }

    public void setLoginAdm(String loginAdm) {
        this.loginAdm = loginAdm;
    }

    public String getPasswdAdm() {
        return passwdAdm;
    }

    public void setPasswdAdm(String passwdAdm) {
        this.passwdAdm = passwdAdm;
    }

    public Cluster(String id, String label, String uri, String loginAdm, String passwdAdm) {
        this.id = id;
        this.label = label;
        this.uri = uri;
        this.loginAdm = loginAdm;
        this.passwdAdm = passwdAdm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cluster)) return false;

        Cluster cluster = (Cluster) o;

        if (!id.equals(cluster.id)) return false;
        if (!loginAdm.equals(cluster.loginAdm)) return false;
        if (!label.equals(cluster.label)) return false;
        if (!passwdAdm.equals(cluster.passwdAdm)) return false;
        if (!uri.equals(cluster.uri)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + label.hashCode();
        result = 31 * result + uri.hashCode();
        result = 31 * result + loginAdm.hashCode();
        result = 31 * result + passwdAdm.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Cluster{" +
                "id='" + id + '\'' +
                ", label='" + label + '\'' +
                ", uri='" + uri + '\'' +
                ", loginAdm='" + loginAdm + '\'' +
                ", passwdAdm='" + passwdAdm + '\'' +
                '}';
    }
}
