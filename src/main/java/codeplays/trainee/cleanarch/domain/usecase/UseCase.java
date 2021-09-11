package codeplays.trainee.cleanarch.domain.usecase;

import codeplays.trainee.cleanarch.domain.entity.Entity;
import codeplays.trainee.cleanarch.domain.entity.Gateway;

public class UseCase implements InputPort {

    private final Gateway gateway;
    private final OutputPort outputPort;

    public UseCase(Gateway gateway, OutputPort outputPort) {
        this.gateway = gateway;
        this.outputPort = outputPort;
    }

    @Override
    public void execute(RequestModel input) {

        Entity entity = gateway.getEntity(input.getData());

        outputPort.apply(new ResponseModel(entity.getData()));
    }
}
