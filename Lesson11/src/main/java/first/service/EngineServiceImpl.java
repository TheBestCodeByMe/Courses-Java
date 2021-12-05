package first.service;

import first.model.Engine;

public class EngineServiceImpl implements EngineService {
    private Engine engine;

    public EngineServiceImpl(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void start() {
        System.out.println("\nДвигатель включён.\n");
        engine.setStartedCar(true);
    }

    @Override
    public void stop() {
        System.out.println("\nДвигатель выключён.\n");
        engine.setStartedCar(false);
    }

    public void viewType() {
        System.out.println("\nТип двигателя " + engine.getType() + "\n");
    }
}
