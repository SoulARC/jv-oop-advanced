package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[9];
        for (int i = 0; i < figures.length; i++) {
            if (i < 6) {
                figures[i] = figureSupplier.getRandomFigure();
                continue;
            }
            figures[i] = figureSupplier.getDefaultFigure();
        }
        for (Figure figure : figures) {
            figure.buildFigure();
        }
    }
}
