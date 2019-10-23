import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BasicLoopTest {

    @Test
    public void should_return_cerises() {
        assertThat(
                new BasicLoop().doSomethingWithInput("cerises"))
                .isEqualTo(75);
    }

    @Test
    public void should_return_pommes() {
        assertThat(
            new BasicLoop().doSomethingWithInput("pommes"))
                .isEqualTo(100);
    }

    @Test
    public void should_return_bananes() {
        assertThat(
                new BasicLoop().doSomethingWithInput("bananes"))
                .isEqualTo(250);
    }

    @Test
    public void addition_cerises() {
        BasicLoop loop = new BasicLoop();
        loop.doSomethingWithInput("cerises");
        assertThat(loop.doSomethingWithInput("pommes")).isEqualTo(175);
    }

    @Test
    public void reduction_test_cerises() {
        BasicLoop loop = new BasicLoop();
        loop.doSomethingWithInput("cerises");
        assertThat(loop.doSomethingWithInput("cerises")).isEqualTo(130);
    }

    @Test
    public void reduction_test_bananes() {
        BasicLoop loop = new BasicLoop();
        loop.doSomethingWithInput("bananes");
        assertThat(loop.doSomethingWithInput("bananes")).isEqualTo(250);
    }

    @Test
    public void should_return_apples() {
        assertThat(
            new BasicLoop().doSomethingWithInput("apples"))
                .isEqualTo(100);
    }

    @Test
    public void should_return_melees() {
        assertThat(
                new BasicLoop().doSomethingWithInput("melees"))
                .isEqualTo(80);
    }

    /*
    Vérification
    Cerises -> 75
    Pommes -> 175
    Cerises 250
    Bannanes -> 400
    Pommes -> 500

    reduction = 20cts deux lots cerises
    reduction = 2e lot bananes -> gratuit
    gérer la traduction
     */

    // Event : Microsoft Tech Days 2015

}
