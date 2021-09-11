package codeplays.trainee.cleanarch.infra.adapter.presenter;

import codeplays.trainee.cleanarch.domain.usecase.OutputPort;
import codeplays.trainee.cleanarch.domain.usecase.ResponseModel;

public class Presenter implements OutputPort {

    private final ViewWriter viewWriter;

    public Presenter(ViewWriter viewWriter) {
        this.viewWriter = viewWriter;
    }

    @Override
    public void apply(ResponseModel output) {
        viewWriter.write(new ViewModel(output.getData()));
    }
}
