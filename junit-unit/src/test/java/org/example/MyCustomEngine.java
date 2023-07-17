package org.example;

import org.junit.platform.engine.*;
import org.junit.platform.engine.support.descriptor.EngineDescriptor;

public class MyCustomEngine implements TestEngine {

    private static final String ENGINE_ID = "my-custom-engine";
    @Override
    public String getId() {
        return ENGINE_ID;
    }

    @Override
    public TestDescriptor discover(EngineDiscoveryRequest engineDiscoveryRequest, UniqueId uniqueId) {
        TestDescriptor testDescriptor = new EngineDescriptor(uniqueId, "my test");
        return testDescriptor;
    }

    @Override
    public void execute(ExecutionRequest executionRequest) {
        TestDescriptor rootTestDescriptor = executionRequest.getRootTestDescriptor();
        executionRequest.getEngineExecutionListener()
                .executionStarted(rootTestDescriptor);
    }
}
