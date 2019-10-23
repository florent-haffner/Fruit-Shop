import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BasicLoopTest {

    // Event : Microsoft Tech Days 2015

    @Test
    public void should_return_cerises() {
        BasicLoop loop = new BasicLoop();
        assertThat(loop.doSomethingWithInput("cerises"))
            .isEqualTo(75);
    }

    @Test
    public void should_return_pommes() {
        BasicLoop loop = new BasicLoop();
        assertThat(loop.doSomethingWithInput("pommes"))
            .isEqualTo(100);
    }

    @Test
    public void should_return_bananes() {
        BasicLoop loop = new BasicLoop();
        assertThat(loop.doSomethingWithInput("bananes"))
            .isEqualTo(250);
    }

    @Test
    public void addition_cerises() {
        BasicLoop loop = new BasicLoop();
        loop.doSomethingWithInput("cerises");
        assertThat(loop.doSomethingWithInput("pommes"))
            .isEqualTo(175);
    }

    @Test
    public void reduction_test_cerises() {
        BasicLoop loop = new BasicLoop();
        loop.doSomethingWithInput("cerises");
        assertThat(loop.doSomethingWithInput("cerises"))
            .isEqualTo(130);
    }

    @Test
    public void reduction_test_bananes() {
        BasicLoop loop = new BasicLoop();
        loop.doSomethingWithInput("bananes");
        assertThat(loop.doSomethingWithInput("bananes"))
            .isEqualTo(250);
    }

    @Test
    public void should_return_apples() {
        BasicLoop loop = new BasicLoop();
        assertThat(loop.doSomethingWithInput("apples"))
            .isEqualTo(100);
    }

    @Test
    public void should_return_melees() {
        BasicLoop loop = new BasicLoop();
        assertThat(loop.doSomethingWithInput("melees"))
            .isEqualTo(80);
    }

}
