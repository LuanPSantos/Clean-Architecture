package codeplays.trainee.cleanarch.infra.view;

public interface ViewWriter {

    void write(ViewModel viewModel);
    ViewModel read();
}
