package codeplays.trainee.cleanarch.infra.view;

public class ResponseWriter implements ViewWriter {

    private ViewModel viewModel;
    @Override
    public void write(ViewModel viewModel) {
        this.viewModel = viewModel;
    }

    @Override
    public ViewModel read() {
        return viewModel;
    }
}
