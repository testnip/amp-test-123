package nz.co.amp.automation.io.random;

public class RandomValueGeneratorFactory {
  public RandomValueGenerator create() {
    return new DefaultRandomValueGenerator();
  }
}
