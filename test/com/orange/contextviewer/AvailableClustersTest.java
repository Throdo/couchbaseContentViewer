package com.orange.contextviewer;

import junit.framework.Assert;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: throdo
 * Date: 20/05/13
 * Time: 09:00
 */
public class AvailableClustersTest {

    private static AvailableClusters availableClusters;
    private static Cluster cluster;

    @BeforeClass
    public static void setUp() throws Exception {
        AvailableClustersTest.availableClusters = new AvailableClusters();
        AvailableClustersTest.cluster = new Cluster("localhostTest", "Cluster local virtuel pour les tests jUnit", "htt://localhost:8091", "Administrator", "Password");
    }

    @AfterClass
    public static void tearDown() throws Exception {
        AvailableClustersTest.availableClusters = null;
    }

    @Test
    public void testGetClusterMap() throws Exception {
        Assert.assertNotNull(AvailableClustersTest.availableClusters.getClusterMap());
    }

    @Test
    public void testSetClusterMap() throws Exception {
        AvailableClusters newAvailableClusters = new AvailableClusters();
        Map<String, Cluster> clusterMap = new HashMap<>();
        newAvailableClusters.setClusterMap(clusterMap);
        Assert.assertEquals(clusterMap, newAvailableClusters.getClusterMap());
    }

    @Test
    public void testEquals() throws Exception {
        AvailableClusters newAvailableClusters = new AvailableClusters();
        Map<String, Cluster> clusterMap = new HashMap<>();
        newAvailableClusters.setClusterMap(clusterMap);

        Assert.assertTrue(AvailableClustersTest.availableClusters.equals(AvailableClustersTest.availableClusters));
        Assert.assertFalse(AvailableClustersTest.availableClusters.equals(newAvailableClusters));
    }

    @Test
    public void testHashCode() throws Exception {

    }

    @Test
    public void testToString() throws Exception {

    }
}
