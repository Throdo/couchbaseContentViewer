package com.orange.contextviewer;

import com.orange.contextviewer.dao.ClustersDAO;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: throdo
 * <p/>
 * Date: 19/05/13
 * Time: 10:22
 */
public class AvailableClusters {

    private Map<String, Cluster> clusterMap = new HashMap<>();

    public Map<String, Cluster> getClusterMap() {
        return clusterMap;
    }

    public void setClusterMap(Map<String, Cluster> clusterMap) {
        this.clusterMap = clusterMap;
    }

    public AvailableClusters() {
        ClustersDAO clustersDAO = new ClustersDAO();

        for (Cluster cluster : clustersDAO.getClusterList()) {
            this.clusterMap.put(cluster.getId(), cluster);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AvailableClusters)) return false;

        AvailableClusters that = (AvailableClusters) o;

        if (clusterMap != null ? !clusterMap.equals(that.clusterMap) : that.clusterMap != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return clusterMap != null ? clusterMap.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "AvailableClusters{" +
                "clusterMap=" + clusterMap +
                '}';
    }
}
