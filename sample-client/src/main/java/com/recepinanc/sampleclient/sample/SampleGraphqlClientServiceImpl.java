package com.recepinanc.sampleclient.sample;

import org.mountcloud.graphql.GraphqlClient;
import org.mountcloud.graphql.request.query.DefaultGraphqlQuery;
import org.mountcloud.graphql.request.query.GraphqlQuery;
import org.mountcloud.graphql.request.result.ResultAttributtes;
import org.mountcloud.graphql.response.GraphqlResponse;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Map;

@Service
public class SampleGraphqlClientServiceImpl implements SampleGraphqlClientService {

    @Override
    public void getRandomNumbers(int count) {
        //crate client
        GraphqlClient client = GraphqlClient.buildGraphqlClient("http://localhost:5000/graphql");
        //create query
        GraphqlQuery query = new DefaultGraphqlQuery("getRandomNumbers");
        //add query or mutation param
        query.addParameter("count",count);
        ResultAttributtes resultAttributtes = new ResultAttributtes("randomNumbers");
        query.addResultAttributes(resultAttributtes);
        try {
            GraphqlResponse response = client.doQuery(query);
            //this map is graphql result
            Map data = response.getData();
            System.out.println(response);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Object getLargeObjects(int count) {
        //crate client
        GraphqlClient client = GraphqlClient.buildGraphqlClient("http://localhost:5000/graphql");
        //create query
        GraphqlQuery query = new DefaultGraphqlQuery("getLargeObjects");
        //add query or mutation param
        query.addParameter("count",count);
        query.addResultAttributes("largeObjects");
        //ResultAttributtes resultAttributtes = new ResultAttributtes("data");
        //query.addResultAttributes(resultAttributtes);
        try {
            GraphqlResponse response = client.doQuery(query);
            //this map is graphql result
            Map data = response.getData();
            System.out.println(data);
            return data;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}