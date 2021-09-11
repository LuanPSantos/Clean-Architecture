package codeplays.trainee.cleanarch.infra.adapter;

import codeplays.trainee.cleanarch.domain.usecase.OutputPort;
import codeplays.trainee.cleanarch.domain.usecase.ResponseModel;
import codeplays.trainee.cleanarch.infra.view.ViewModel;
import codeplays.trainee.cleanarch.infra.view.ViewWriter;

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
