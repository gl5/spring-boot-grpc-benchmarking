package com.recepinanc.sampleclient.sample;

import com.recepinanc.samplegrpcserver.sample.*;
import org.springframework.stereotype.Service;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

@Service
public class SampleGrpcClientServiceImpl implements SampleGrpcClientService {

    public void getLargeObjects(int count) {
        final ManagedChannel channel = ManagedChannelBuilder.forTarget("localhost:3000")
                .usePlaintext()
                .maxInboundMessageSize(160800000)
                .build();

        LargeObjectServiceGrpc.LargeObjectServiceBlockingStub stub = LargeObjectServiceGrpc.newBlockingStub(channel);
        LargeObjectRequest request = LargeObjectRequest.newBuilder()
                .setCount(count)
                .build();

        LargeObjectResponse response = stub.getLargeObjects(request);
        System.out.println("grpc response");
        channel.shutdownNow();
    }
}
