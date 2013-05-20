package com.orange.contextviewer.dao;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.orange.contextviewer.Cluster;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: throdo
 * Date: 20/05/13
 * Time: 10:40
 */
public class ClustersDAO {

    private List<Cluster> clusterList = new ArrayList<>();

    public List<Cluster> getClusterList() {
        return clusterList;
    }

    public void setClusterList(List<Cluster> clusterList) {
        this.clusterList = clusterList;
    }

    public ClustersDAO() {
        try {
            Type collectionType = new TypeToken<List<Cluster>>() {
            }.getType();
            Gson gson = new Gson();

            BufferedReader bufferedReader = new BufferedReader(new FileReader("public/configuration/contextClusterDescription.conf"));
            this.clusterList = gson.fromJson(bufferedReader, collectionType);
            System.out.println(this.clusterList.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
