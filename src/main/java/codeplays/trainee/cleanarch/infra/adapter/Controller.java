package codeplays.trainee.cleanarch.infra.adapter;

import codeplays.trainee.cleanarch.domain.usecase.InputPort;
import codeplays.trainee.cleanarch.domain.usecase.RequestModel;

public class Controller {

    private final InputPort useCase;

    public Controller(InputPort useCase) {
        this.useCase = useCase;
    }

    public void execute(Request request) {
        useCase.execute(new RequestModel(request.getData()));
    }
}
