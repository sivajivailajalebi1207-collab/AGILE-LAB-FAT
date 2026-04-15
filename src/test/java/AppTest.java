import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    void testValidateRefund() {
        assertEquals("Refund Accepted", App.ValidateRefund("Pending", "Successful"));

        assertEquals("Refund Rejected", App.ValidateRefund("Pending", "Not successful"));

        assertEquals("Refund Accepted", App.ValidateRefund("Booked", "Successful"));

        assertEquals("Refund Rejected", App.ValidateRefund("Booked", "Not successful"));

        assertEquals("Invalid Refund Request", App.ValidateRefund("Cancelled", "Successful"));

        assertEquals("Invalid Refund Request", App.ValidateRefund("Cancelled", "Not successful"));
    }
}