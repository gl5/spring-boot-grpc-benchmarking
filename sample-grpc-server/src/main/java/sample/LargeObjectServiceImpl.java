package sample;

import com.recepinanc.samplegrpcserver.sample.*;
import io.grpc.stub.StreamObserver;

public class LargeObjectServiceImpl extends LargeObjectServiceGrpc.LargeObjectServiceImplBase {

    @Override
    public void getLargeObjects(LargeObjectRequest request, StreamObserver<LargeObjectResponse> responseObserver) {
        int count = request.getCount();

        LargeObjectResponse response = LargeObjectResponse.newBuilder()
                .addAllLargeObjects(LargeObjectUtil.getLargeObjects(count))
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

}
