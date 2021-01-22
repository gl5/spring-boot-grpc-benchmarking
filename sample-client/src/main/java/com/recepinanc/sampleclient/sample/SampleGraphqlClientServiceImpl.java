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
    public Object getLargeObjects(int count) {
        //crate client
        GraphqlClient client = GraphqlClient.buildGraphqlClient("http://localhost:5000/graphql");
        //create query
        GraphqlQuery query = new DefaultGraphqlQuery("getLargeObjects");
        //add query or mutation param
        query.addParameter("count",count);
        ResultAttributtes resultAttributtes = new ResultAttributtes("largeObjects");
        ResultAttributtes field3Attributtes = new ResultAttributtes("field3");
        field3Attributtes.addResultAttributes("field31", "field32");
        ResultAttributtes field4Attributtes = new ResultAttributtes("field4");
        field4Attributtes.addResultAttributes("field41", "field42");
        resultAttributtes.addResultAttributes("field1", "field2");
        resultAttributtes.addResultAttributes(field3Attributtes, field4Attributtes);
        query.addResultAttributes(resultAttributtes);
        try {
            GraphqlResponse response = client.doQuery(query);
            //this map is graphql result
            Map data = response.getData();
            System.out.println("graphql response");
            return data;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}