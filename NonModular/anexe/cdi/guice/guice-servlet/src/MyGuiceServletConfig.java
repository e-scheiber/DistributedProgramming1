import com.google.inject.servlet.GuiceServletContextListener;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class MyGuiceServletConfig extends GuiceServletContextListener {
  @Override
  protected Injector getInjector() {
    return Guice.createInjector(new AppModule(), new MyServletModule());
  }
}