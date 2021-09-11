import com.Stock;
import static com.Stock.askForTicker;
import org.junit.Test;
import static org.junit.Assert.*;

public class StockTrackerTest {

    @Test
    public void shouldReturnCompanyName() {
        Stock randomStock = new Stock("Apple", "AAPL", 120.0);
        assertEquals("Apple", randomStock.getName());
    }

    @Test
    public void shouldReturnTicker() {
        Stock randomStock = new Stock("Apple", "AAPL", 120.0);
        assertEquals("AAPL", randomStock.getTicker());
    }

    @Test
    public void shouldReturnPrice() {
        Stock randomStock = new Stock("Apple", "AAPL", 120.0);
        assertEquals(120.0, randomStock.getPrice(), 0.1);
    }

    // Search up Stream in & out to test user input
    @Test
    public void shouldReturnInputTicker() {
//        String ticker = askForTicker();
//        assertEquals("AAPL", askForTicker());
    }

}
